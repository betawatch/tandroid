package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o extends View {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public final ArrayList e;
    public float f;
    public float h;
    public Integer n;

    public o(Context context) {
        super(context);
        this.e = new ArrayList();
        this.a = 20;
        this.b = 60;
        this.c = 60;
    }

    public final void a(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        String V;
        TLRPC.TL_availableReaction tL_availableReaction2 = p0Var.f != null ? (TLRPC.TL_availableReaction) si.b0(m10.t0).r.get(p0Var.f) : null;
        if (tL_availableReaction2 == null) {
            document = org.telegram.ui.Components.g5.e(m10.t0, p0Var.g);
            if (document != null && (V = gj.V(document, null, null)) != null) {
                tL_availableReaction2 = (TLRPC.TL_availableReaction) si.b0(m10.t0).r.get(V);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document != null || tL_availableReaction == null) {
            org.telegram.ui.Components.g5 m10 = document == null ? org.telegram.ui.Components.g5.m(2, p0Var.g, null, m10.t0) : org.telegram.ui.Components.g5.l(2, m10.t0, document);
            if (this.n != null) {
                m10.setColorFilter(new PorterDuffColorFilter(this.n.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            ch.d a10 = ch.d.a(m10, false, !m10.c());
            a10.f(this);
            arrayList.add(a10);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.H0(this);
        int i7 = this.d;
        this.d = i7 + 1;
        imageReceiver.w1 = Integer.toString(i7);
        gc b10 = gc.b(tL_availableReaction.around_animation);
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.b;
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_nolimit");
        imageReceiver.q0(b10, sb2.toString(), null, "tgs", tL_availableReaction, 1);
        imageReceiver.W(0);
        imageReceiver.P();
        arrayList.add(imageReceiver);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(this.c);
        int L2 = org.telegram.messenger.g0.L(this.b);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i7);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f10 = L2;
                imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f10, f10);
                imageReceiver.h(canvas, null);
            } else if (obj instanceof ch.d) {
                ch.d dVar = (ch.d) obj;
                dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                dVar.b(canvas);
                if (dVar.c()) {
                    dVar.d(this);
                    arrayList.remove(dVar);
                }
            }
            i7++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof ch.d) {
                    ((ch.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int max = Math.max(this.a, this.b);
        int i11 = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i11, max)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i11, Math.max(r4, r5))), TLObject.FLAG_30));
    }

    public void setColor(int i7) {
        this.n = Integer.valueOf(i7);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).p1 = porterDuffColorFilter;
            } else if (obj instanceof ch.d) {
                ((ch.d) obj).a.setColorFilter(porterDuffColorFilter2);
            }
            i10++;
        }
    }
}
