// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ob6 extends l34 {
    public final hb6 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public TLRPC.MessageMedia w0;
    public TL_stories.MediaArea x0;

    public ob6(Context context, PointF pointF, int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f, int i2) {
        super(context, pointF);
        hb6 hb6Var = new hb6(context, f);
        this.s0 = hb6Var;
        hb6Var.setMaxWidth(i2);
        r(i, messageMedia, mediaArea);
        hb6Var.e(0, this.u0);
        addView(hb6Var, nme.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String l = de9.l(new StringBuilder(""), (int) floor, "°");
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder sb = new StringBuilder(l);
        sb.append(floor2 <= 0.0d ? "0" : "");
        sb.append(floor2 < 10.0d ? "0" : "");
        String l2 = de9.l(sb, (int) floor2, "'");
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder sb2 = new StringBuilder(l2);
        sb2.append(floor3 <= 0.0d ? "0" : "");
        sb2.append(floor3 < 10.0d ? "0" : "");
        return de9.l(sb2, (int) floor3, "\"");
    }

    @Override // l34
    public final k34 a() {
        return new n46(this, getContext());
    }

    public int getColor() {
        return this.u0;
    }

    @Override // l34
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // l34
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new l29();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (gl.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (gl.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float e = de9.e(L, 2.0f, getPositionX(), scaleX);
        return new l29(e, de9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
    }

    @Override // l34
    public float getStickyPaddingBottom() {
        return this.s0.K;
    }

    @Override // l34
    public float getStickyPaddingLeft() {
        return this.s0.J;
    }

    @Override // l34
    public float getStickyPaddingRight() {
        return this.s0.J;
    }

    @Override // l34
    public float getStickyPaddingTop() {
        return this.s0.K;
    }

    public int getType() {
        return this.v0;
    }

    public int getTypesCount() {
        return this.s0.getTypesCount() - (!this.t0 ? 1 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public final void r(int i, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        this.w0 = messageMedia;
        this.x0 = mediaArea;
        String str2 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            StringBuilder sb = new StringBuilder(q(d));
            sb.append(d > 0.0d ? "N" : "S");
            sb.append(" ");
            sb.append(q(d2));
            sb.append(d2 > 0.0d ? "E" : "W");
            str = sb.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str2 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        hb6 hb6Var = this.s0;
        hb6Var.d(i, str2);
        hb6Var.setText(str);
        m();
    }

    public void setColor(int i) {
        this.t0 = true;
        this.u0 = i;
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.v0 = i;
        this.s0.e(i, this.u0);
    }
}
