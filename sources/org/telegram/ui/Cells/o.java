package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final void a(dh.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        String V;
        TLRPC.TL_availableReaction tL_availableReaction2 = n0Var.f != null ? (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(n0Var.f) : null;
        if (tL_availableReaction2 == null) {
            document = org.telegram.ui.Components.g5.e(h10.t0, n0Var.g);
            if (document != null && (V = zi.V(document, null, null)) != null) {
                tL_availableReaction2 = (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(V);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document != null || tL_availableReaction == null) {
            org.telegram.ui.Components.g5 m10 = document == null ? org.telegram.ui.Components.g5.m(2, n0Var.g, null, h10.t0) : org.telegram.ui.Components.g5.l(2, h10.t0, document);
            if (this.n != null) {
                m10.setColorFilter(new PorterDuffColorFilter(this.n.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            dh.d a10 = dh.d.a(m10, false, !m10.c());
            a10.f(this);
            arrayList.add(a10);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.H0(this);
        int i3 = this.d;
        this.d = i3 + 1;
        imageReceiver.w1 = Integer.toString(i3);
        ac b10 = ac.b(tL_availableReaction.around_animation);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i3 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i3);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f10 = L2;
                imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f10, f10);
                imageReceiver.h(canvas, null);
            } else if (obj instanceof dh.d) {
                dh.d dVar = (dh.d) obj;
                dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                dVar.b(canvas);
                if (dVar.c()) {
                    dVar.d(this);
                    arrayList.remove(dVar);
                }
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof dh.d) {
                    ((dh.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int max = Math.max(this.a, this.b);
        int i11 = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i11, max)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.max(i11, Math.max(r4, r5))), TLObject.FLAG_30));
    }

    public void setColor(int i3) {
        this.n = Integer.valueOf(i3);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).p1 = porterDuffColorFilter;
            } else if (obj instanceof dh.d) {
                ((dh.d) obj).a.setColorFilter(porterDuffColorFilter2);
            }
            i10++;
        }
    }
}
