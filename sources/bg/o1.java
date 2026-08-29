package bg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o1 extends k {
    public final n1 m0;
    public boolean n0;
    public int o0;
    public int p0;
    public TLRPC.MessageMedia q0;
    public TL_stories.MediaArea r0;

    public o1(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f9, int i11) {
        super(context, pointF);
        n1 n1Var = new n1(context, f9);
        this.m0 = n1Var;
        n1Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        n1Var.e(0, this.o0);
        addView(n1Var, f6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String l10 = a4.w.l((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(l10);
        n10.append(floor2 <= 0.0d ? "0" : "");
        n10.append(floor2 < 10.0d ? "0" : "");
        String l11 = a4.w.l((int) floor2, "'", n10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder n11 = com.google.android.recaptcha.internal.a.n(l11);
        n11.append(floor3 <= 0.0d ? "0" : "");
        n11.append(floor3 < 10.0d ? "0" : "");
        return a4.w.l((int) floor3, "\"", n11);
    }

    @Override // bg.k
    public final j a() {
        return new j1(this, getContext());
    }

    public int getColor() {
        return this.o0;
    }

    @Override // bg.k
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // bg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // bg.k
    public float getStickyPaddingBottom() {
        return this.m0.F;
    }

    @Override // bg.k
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override // bg.k
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override // bg.k
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.n0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.q0 = messageMedia;
        this.r0 = mediaArea;
        String str2 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            sb2.append(d > 0.0d ? "N" : "S");
            sb2.append(" ");
            sb2.append(q(d10));
            sb2.append(d10 > 0.0d ? "E" : "W");
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str2 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        n1 n1Var = this.m0;
        n1Var.d(i10, str2);
        n1Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.n0 = true;
        this.o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.p0 = i10;
        this.m0.e(i10, this.o0);
    }
}
