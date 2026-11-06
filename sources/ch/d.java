package ch;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d {
    public static int m;
    public i5 a;
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

    public static d a(i5 i5Var, boolean z9, boolean z10) {
        int i7 = p10.s0;
        d dVar = new d();
        dVar.b = new Rect();
        dVar.c = new ArrayList();
        dVar.g = true;
        dVar.k = -1;
        dVar.a = i5Var;
        dVar.f = z9;
        dVar.h = i7;
        dVar.i = z10;
        dVar.e = System.currentTimeMillis();
        if (z10 && rc.e(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            dVar.j = imageReceiver;
            if (z9) {
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
        boolean z9 = this.f;
        if (z9) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j3 = currentTimeMillis - this.e;
                if (j3 < 1500 && j3 > 200 && currentTimeMillis - this.l > 50 && ((int) Utilities.c.nextLong()) % 6 == 0) {
                    c cVar = new c(this);
                    cVar.a();
                    arrayList.add(cVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i7 = 0; i7 < 7; i7++) {
                c cVar2 = new c(this);
                cVar2.a();
                arrayList.add(cVar2);
            }
        }
        if (imageReceiver != null && this.i && (imageReceiver.B() == null || !imageReceiver.B().A())) {
            if (z9) {
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
            i5 i5Var = dVar.a;
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
                    i5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
                    i5Var.setBounds((int) (T1 - f12), (int) (T12 - f12), (int) (T1 + f12), (int) (T12 + f12));
                    i5Var.draw(canvas);
                    i5Var.setAlpha(qs.e4);
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
            i5Var.setAlpha((int) (Utilities.i(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
            i5Var.setBounds((int) (T1 - f122), (int) (T12 - f122), (int) (T1 + f122), (int) (T12 + f122));
            i5Var.draw(canvas);
            i5Var.setAlpha(qs.e4);
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

    public final void e(int i7, int i10, int i11, int i12) {
        Rect rect = this.b;
        rect.set(i7, i10, i11, i12);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.z0(rect);
        }
    }

    public final void f(View view) {
        boolean z9;
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z11 = this.f;
        int i7 = this.h;
        i5 i5Var = this.a;
        i5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.P();
        TLRPC.Document document2 = i5Var.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String V = ij.V(document2, null, null);
        if (V == null || (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i7).r.get(V)) == null || (document = tL_availableReaction.around_animation) == null) {
            z9 = true;
            z10 = false;
        } else {
            if (z11) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = m;
                m = i10 + 1;
                imageReceiver.v1 = a8.p0.n(i10, " ", sb2);
                int f10 = ix.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z9 = true;
                imageReceiver.q0(hc.b(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
            } else {
                hc b10 = hc.b(document);
                String a10 = k0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z9 = true;
                imageReceiver.q0(b10, a10, null, null, document4, 0);
            }
            z10 = z9;
        }
        if (!z10) {
            String str = p10.i(i7).d0;
            if (str != null && (tL_messages_stickerSet = ui.b0(i7).p0(str)) == null) {
                tL_messages_stickerSet = ui.b0(i7).n0(str);
            }
            if (tL_messages_stickerSet != null) {
                if (this.k < 0) {
                    this.k = Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size());
                }
                if (z11) {
                    StringBuilder sb3 = new StringBuilder();
                    int i11 = m;
                    m = i11 + 1;
                    imageReceiver.v1 = a8.p0.n(i11, " ", sb3);
                    int f11 = ix.f();
                    imageReceiver.q0(hc.b(tL_messages_stickerSet.documents.get(this.k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.q0(hc.b(tL_messages_stickerSet.documents.get(this.k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z10 = z9;
            }
        }
        if (!z10) {
            imageReceiver.w0(new zg0(R.raw.custom_emoji_reaction, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null));
            return;
        }
        if (imageReceiver.B() != null) {
            imageReceiver.B().N(0, false, z9);
        }
        imageReceiver.W(0);
    }
}
