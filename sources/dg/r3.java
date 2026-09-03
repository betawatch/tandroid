package dg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class r3 extends j {
    public final TLRPC.Document n0;
    public final Object o0;
    public final int p0;
    public boolean q0;
    public final z5 r0;
    public final jv0 s0;
    public final u2 t0;
    public final ImageReceiver u0;

    public r3(Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.p0 = -1;
        int i10 = 0;
        this.q0 = false;
        this.u0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.n0 = document;
        this.s0 = jv0Var;
        this.o0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.p0 = tL_maskCoords.n;
                }
            } else {
                i10++;
            }
        }
        u2 u2Var = new u2(this, context);
        this.t0 = u2Var;
        addView(u2Var, b6.c(-1.0f, -1));
        this.r0 = new z5(u2Var, 0L, 500L, mr.h);
        this.u0.setAspectFit(true);
        this.u0.setInvalidateAll(true);
        this.u0.setParentView(u2Var);
        this.u0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.u0.setDelegate(new a1.c(this, 19));
        k();
    }

    @Override // dg.j
    public final i a() {
        z2 z2Var = new z2(this, getContext(), 2);
        z2Var.r = new RectF();
        return z2Var;
    }

    public int getAnchor() {
        return this.p0;
    }

    public jv0 getBaseSize() {
        return this.s0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.u0;
        gj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        if (imageReceiver.getAnimation() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.o0;
    }

    @Override // dg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new rk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.n0;
    }

    @Override // dg.j
    public final void k() {
        jv0 jv0Var = this.s0;
        float f10 = jv0Var.a / 2.0f;
        float f11 = jv0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u0.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) jv0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z4) {
        boolean z10 = !this.q0;
        this.q0 = z10;
        if (!z4) {
            this.r0.f(z10, true);
        }
        this.t0.invalidate();
    }

    public r3(Context context, r3 r3Var, PointF pointF) {
        this(context, pointF, r3Var.getRotation(), r3Var.getScale(), r3Var.s0, r3Var.n0, r3Var.o0);
        if (r3Var.q0) {
            r(false);
        }
    }

    public void q(gj0 gj0Var) {
    }
}
