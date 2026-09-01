package eg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class p3 extends j {
    public final TLRPC.Document n0;
    public final Object o0;
    public final int p0;
    public boolean q0;
    public final z5 r0;
    public final kv0 s0;
    public final s2 t0;
    public final ImageReceiver u0;

    public p3(Context context, PointF pointF, float f10, float f11, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.p0 = -1;
        int i10 = 0;
        this.q0 = false;
        this.u0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.n0 = document;
        this.s0 = kv0Var;
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
        s2 s2Var = new s2(this, context);
        this.t0 = s2Var;
        addView(s2Var, c6.c(-1.0f, -1));
        this.r0 = new z5(s2Var, 0L, 500L, pr.h);
        this.u0.setAspectFit(true);
        this.u0.setInvalidateAll(true);
        this.u0.setParentView(s2Var);
        this.u0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.u0.setDelegate(new a1.c(this, 24));
        k();
    }

    @Override // eg.j
    public final i a() {
        x2 x2Var = new x2(this, getContext(), 2);
        x2Var.r = new RectF();
        return x2Var;
    }

    public int getAnchor() {
        return this.p0;
    }

    public kv0 getBaseSize() {
        return this.s0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.u0;
        ij0 lottieAnimation = imageReceiver.getLottieAnimation();
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

    @Override // eg.j
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new tk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new tk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.n0;
    }

    @Override // eg.j
    public final void k() {
        kv0 kv0Var = this.s0;
        float f10 = kv0Var.a / 2.0f;
        float f11 = kv0Var.b / 2.0f;
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
        kv0 kv0Var = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) kv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) kv0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z4) {
        boolean z10 = !this.q0;
        this.q0 = z10;
        if (!z4) {
            this.r0.f(z10, true);
        }
        this.t0.invalidate();
    }

    public p3(Context context, p3 p3Var, PointF pointF) {
        this(context, pointF, p3Var.getRotation(), p3Var.getScale(), p3Var.s0, p3Var.n0, p3Var.o0);
        if (p3Var.q0) {
            r(false);
        }
    }

    public void q(ij0 ij0Var) {
    }
}
