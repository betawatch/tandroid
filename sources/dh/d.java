package dh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d {
    public static int m;
    public g5 a;
    public Rect b;
    public ArrayList c;
    public View d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public ImageReceiver j;
    public int k;
    public long l;

    public static d a(g5 g5Var, boolean z10, boolean z11) {
        int i3 = h10.t0;
        d dVar = new d();
        dVar.b = new Rect();
        dVar.c = new ArrayList();
        dVar.g = true;
        dVar.k = -1;
        dVar.a = g5Var;
        dVar.f = z10;
        dVar.h = i3;
        dVar.i = z11;
        dVar.e = System.currentTimeMillis();
        if (z11 && lc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            dVar.j = imageReceiver;
            if (z10) {
                imageReceiver.b = true;
            }
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        float f10;
        Rect rect = this.b;
        ImageReceiver imageReceiver = this.j;
        ArrayList arrayList = this.c;
        boolean z10 = this.f;
        if (z10) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j10 = currentTimeMillis - this.e;
                if (j10 < 1500 && j10 > 200 && currentTimeMillis - this.l > 50 && ((int) Utilities.c.nextLong()) % 6 == 0) {
                    c cVar = new c(this);
                    cVar.a();
                    arrayList.add(cVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i3 = 0; i3 < 7; i3++) {
                c cVar2 = new c(this);
                cVar2.a();
                arrayList.add(cVar2);
            }
        }
        if (imageReceiver != null && this.i && (imageReceiver.B() == null || !imageReceiver.B().A())) {
            if (z10) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.h(canvas, null);
                canvas.restore();
            } else {
                imageReceiver.h(canvas, null);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar3 = (c) arrayList.get(i10);
            float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.r) / cVar3.i) + cVar3.h;
            cVar3.h = min;
            float i11 = Utilities.i(min, 1.0f, 0.0f);
            cVar3.h = i11;
            xq xqVar = xq.g;
            float interpolation = xqVar.getInterpolation(i11);
            float T1 = org.telegram.messenger.g0.T1(cVar3.a, cVar3.c, interpolation);
            d dVar = cVar3.l;
            g5 g5Var = dVar.a;
            float f11 = cVar3.h;
            float T12 = f11 < 0.3f ? org.telegram.messenger.g0.T1(cVar3.b, cVar3.d, xqVar.getInterpolation(f11 / 0.3f)) : org.telegram.messenger.g0.T1(cVar3.d, cVar3.e, xq.i.getInterpolation((f11 - 0.3f) / 0.7f));
            float T13 = org.telegram.messenger.g0.T1(cVar3.f, cVar3.g, interpolation);
            if (!dVar.f) {
                float height = dVar.b.height() * 0.8f;
                if (T12 > height) {
                    f10 = 1.0f - Utilities.i((T12 - height) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f);
                    float f12 = (T13 / 2.0f) * f10;
                    canvas.save();
                    if (cVar3.j) {
                        canvas.scale(-1.0f, 1.0f, T1, T12);
                    }
                    canvas.rotate(cVar3.k, T1, T12);
                    g5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
                    g5Var.setBounds((int) (T1 - f12), (int) (T12 - f12), (int) (T1 + f12), (int) (T12 + f12));
                    g5Var.draw(canvas);
                    g5Var.setAlpha(hs.e4);
                    canvas.restore();
                    if (((c) arrayList.get(i10)).h < 1.0f) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            f10 = 1.0f;
            float f122 = (T13 / 2.0f) * f10;
            canvas.save();
            if (cVar3.j) {
            }
            canvas.rotate(cVar3.k, T1, T12);
            g5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
            g5Var.setBounds((int) (T1 - f122), (int) (T12 - f122), (int) (T1 + f122), (int) (T12 + f122));
            g5Var.draw(canvas);
            g5Var.setAlpha(hs.e4);
            canvas.restore();
            if (((c) arrayList.get(i10)).h < 1.0f) {
            }
            i10++;
        }
        canvas.restore();
        View view = this.d;
        if (view != null) {
            view.invalidate();
        }
        this.g = false;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.e > 2500;
    }

    public final void d(View view) {
        this.a.n(view);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.R();
            imageReceiver.f();
        }
    }

    public final void e(int i3, int i10, int i11, int i12) {
        Rect rect = this.b;
        rect.set(i3, i10, i11, i12);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f;
        int i3 = this.h;
        g5 g5Var = this.a;
        g5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.P();
        TLRPC.Document document2 = g5Var.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String V = zi.V(document2, null, null);
        if (V == null || (tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i3).r.get(V)) == null || (document = tL_availableReaction.around_animation) == null) {
            z10 = true;
            z11 = false;
        } else {
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = m;
                m = i10 + 1;
                imageReceiver.w1 = a1.g.o(i10, " ", sb2);
                int f10 = fx.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.q0(ac.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
            } else {
                ac b10 = ac.b(document);
                String a10 = j0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.q0(b10, a10, null, null, document4, 0);
            }
            z11 = z10;
        }
        if (!z11) {
            String str = h10.i(i3).e0;
            if (str != null && (tL_messages_stickerSet = li.b0(i3).p0(str)) == null) {
                tL_messages_stickerSet = li.b0(i3).n0(str);
            }
            if (tL_messages_stickerSet != null) {
                if (this.k < 0) {
                    this.k = Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size());
                }
                if (z12) {
                    StringBuilder sb3 = new StringBuilder();
                    int i11 = m;
                    m = i11 + 1;
                    imageReceiver.w1 = a1.g.o(i11, " ", sb3);
                    int f11 = fx.f();
                    imageReceiver.q0(ac.b(tL_messages_stickerSet.documents.get(this.k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.q0(ac.b(tL_messages_stickerSet.documents.get(this.k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z11 = z10;
            }
        }
        if (!z11) {
            imageReceiver.w0(new ch0(R.raw.custom_emoji_reaction, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
            return;
        }
        if (imageReceiver.B() != null) {
            imageReceiver.B().N(0, false, z10);
        }
        imageReceiver.W(0);
    }
}
