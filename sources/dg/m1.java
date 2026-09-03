package dg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m1 extends j {
    public final l1 n0;
    public boolean o0;
    public int p0;
    public int q0;
    public TLRPC.MessageMedia r0;
    public TL_stories.MediaArea s0;

    public m1(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i11) {
        super(context, pointF);
        l1 l1Var = new l1(context, f10);
        this.n0 = l1Var;
        l1Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        l1Var.e(0, this.p0);
        addView(l1Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String m9 = android.support.v4.media.a.m((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder l10 = e2.c.l(m9);
        l10.append(floor2 <= 0.0d ? "0" : "");
        l10.append(floor2 < 10.0d ? "0" : "");
        String m10 = android.support.v4.media.a.m((int) floor2, "'", l10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder l11 = e2.c.l(m10);
        l11.append(floor3 <= 0.0d ? "0" : "");
        l11.append(floor3 < 10.0d ? "0" : "");
        return android.support.v4.media.a.m((int) floor3, "\"", l11);
    }

    @Override // dg.j
    public final i a() {
        return new h1(this, getContext());
    }

    public int getColor() {
        return this.p0;
    }

    @Override // dg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // dg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // dg.j
    public float getStickyPaddingBottom() {
        return this.n0.G;
    }

    @Override // dg.j
    public float getStickyPaddingLeft() {
        return this.n0.F;
    }

    @Override // dg.j
    public float getStickyPaddingRight() {
        return this.n0.F;
    }

    @Override // dg.j
    public float getStickyPaddingTop() {
        return this.n0.G;
    }

    public int getType() {
        return this.q0;
    }

    public int getTypesCount() {
        return this.n0.getTypesCount() - (!this.o0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.r0 = messageMedia;
        this.s0 = mediaArea;
        String str2 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb = new StringBuilder();
            sb.append(q(d));
            sb.append(d > 0.0d ? "N" : "S");
            sb.append(" ");
            sb.append(q(d10));
            sb.append(d10 > 0.0d ? "E" : "W");
            str = sb.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str2 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        l1 l1Var = this.n0;
        l1Var.d(i10, str2);
        l1Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.o0 = true;
        this.p0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.q0 = i10;
        this.n0.e(i10, this.p0);
    }
}
