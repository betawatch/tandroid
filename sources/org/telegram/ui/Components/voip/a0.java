package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c8.jc;
import fi.v3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a0 extends ViewGroup {
    public final z D;
    public float E;
    public long F;
    public long G;
    public int[] H;
    public final dt I;
    public final /* synthetic */ e0 J;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final TextView d;
    public final ImageView e;
    public final k f;
    public final int h;
    public float n;
    public float r;
    public ValueAnimator s;
    public boolean w;
    public long x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Context context) {
        super(context);
        this.J = e0Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.r = 1.0f;
        this.D = new z(this, 1);
        this.I = new dt(this, 18);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.n = e0Var.c;
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(k6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1275068417);
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, TLObject.FLAG_31);
        textView.setVisibility(8);
        addView(textView);
        k kVar = new k(context);
        this.f = kVar;
        addView(kVar);
    }

    public static void a(a0 a0Var) {
        int width = a0Var.getWidth();
        int height = a0Var.getHeight();
        if (!a0Var.w || a0Var.y || width <= 0 || height <= 0 || a0Var.a.isEmpty() || a0Var.E <= 0.0f || !a0Var.c() || Math.abs(Math.log((width / height) / a0Var.E)) <= 0.06d) {
            return;
        }
        a0Var.g(true);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var = (d0) obj;
            d0Var.b();
            removeView(d0Var);
        }
        arrayList.clear();
        this.H = null;
    }

    public final boolean c() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        return W != null && org.telegram.messenger.g0.H1(W) && SystemClock.elapsedRealtime() - this.x > 1000;
    }

    public final void d(d0 d0Var, int i7, int i10) {
        float[] fArr = d0Var.O;
        float f10 = this.r;
        for (int i11 = 0; i11 < 4; i11++) {
            float f11 = d0Var.M[i11];
            fArr[i11] = com.google.android.recaptcha.internal.a.z(d0Var.N[i11], f11, f10, f11);
        }
        float f12 = this.h / 2.0f;
        float f13 = fArr[0];
        float f14 = i7;
        int round = Math.round((f13 * f14) + (f13 > 0.001f ? f12 : 0.0f));
        float f15 = fArr[1];
        float f16 = i10;
        int round2 = Math.round((f15 * f16) + (f15 > 0.001f ? f12 : 0.0f));
        float f17 = fArr[2];
        int round3 = Math.round((f14 * f17) - (f17 < 0.999f ? f12 : 0.0f));
        float f18 = fArr[3];
        float f19 = f16 * f18;
        if (f18 >= 0.999f) {
            f12 = 0.0f;
        }
        int round4 = Math.round(f19 - f12);
        int max = Math.max(1, round3 - round);
        int max2 = Math.max(1, round4 - round2);
        if (d0Var.getMeasuredWidth() != max || d0Var.getMeasuredHeight() != max2 || d0Var.isLayoutRequested()) {
            d0Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max2, TLObject.FLAG_30));
        }
        d0Var.layout(round, round2, max + round, max2 + round2);
        float f20 = this.r;
        float f21 = d0Var.P;
        float f22 = ((d0Var.Q - f21) * f20) + f21;
        d0Var.setAlpha(f22);
        float f23 = (f22 * 0.2f) + 0.8f;
        d0Var.setScaleX(f23);
        d0Var.setScaleY(f23);
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d((d0) obj, width, height);
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            d((d0) obj2, width, height);
        }
        invalidate();
    }

    public final boolean f(int i7, int i10) {
        return Math.abs(Math.log((double) ((((float) i7) / ((float) i10)) / this.n))) < 0.06d;
    }

    public final void g(boolean z9) {
        boolean z10;
        int i7;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d0 d0Var = (d0) arrayList.get(i10);
            float f10 = d0Var.J;
            fArr[i10] = f10;
            s3 s3Var = d0Var.b;
            fArr2[i10] = (s3Var == null || !s3Var.b) ? 1.0f : 2.0f;
            boolean z12 = d0Var.L;
            iArr[i10] = z12 ? i10 : -1;
            z11 |= z12 && d0Var.K <= 0.0f && f10 > 0.0f;
        }
        ti.k a10 = jc.a(fArr, fArr2, 0.45f, 2.35f, iArr, z11 ? 0.0f : this.n);
        int width = getWidth();
        int height = getHeight();
        float f11 = 0.001f;
        if (Math.abs(a10.a - this.n) > 0.001f || width <= 0 || height <= 0 || f(width, height) || !c()) {
            z10 = false;
        } else {
            float f12 = width / height;
            a10 = jc.a(fArr, fArr2, f12, f12, iArr, 0.0f);
            z10 = true;
        }
        this.E = a10.a;
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("group call pip: mosaic ");
            sb2.append(Arrays.toString(fArr));
            sb2.append(z10 ? " in the window" : "");
            sb2.append(" -> ");
            sb2.append(a10);
            a8.b(sb2.toString());
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            i7 = 4;
            if (i11 >= size2) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            d0 d0Var2 = (d0) obj;
            float f13 = this.r;
            float f14 = f11;
            float[] fArr3 = d0Var2.M;
            for (int i12 = 0; i12 < 4; i12++) {
                float f15 = fArr3[i12];
                fArr3[i12] = com.google.android.recaptcha.internal.a.z(d0Var2.N[i12], f15, f13, f15);
            }
            float f16 = d0Var2.P;
            d0Var2.P = com.google.android.recaptcha.internal.a.z(d0Var2.Q, f16, f13, f16);
            f11 = f14;
        }
        float f17 = f11;
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            d0 d0Var3 = (d0) obj2;
            float f18 = this.r;
            float[] fArr4 = d0Var3.M;
            float[] fArr5 = d0Var3.N;
            int i14 = 0;
            while (i14 < i7) {
                float f19 = fArr4[i14];
                fArr4[i14] = com.google.android.recaptcha.internal.a.z(fArr5[i14], f19, f18, f19);
                i14++;
                i7 = 4;
            }
            float f20 = d0Var3.P;
            d0Var3.P = com.google.android.recaptcha.internal.a.z(d0Var3.Q, f20, f18, f20);
            System.arraycopy(d0Var3.M, 0, fArr5, 0, 4);
            d0Var3.Q = 0.0f;
            i7 = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            d0 d0Var4 = (d0) arrayList.get(i15);
            System.arraycopy(a10.b, i15 * 4, d0Var4.N, 0, 4);
            d0Var4.Q = 1.0f;
            d0Var4.K = fArr[i15];
            if (!d0Var4.L || !z9) {
                System.arraycopy(d0Var4.N, 0, d0Var4.M, 0, 4);
                d0Var4.P = z9 ? 0.0f : 1.0f;
                d0Var4.L = true;
            }
        }
        for (int i16 : a10.c) {
            arrayList3.add((d0) arrayList.get(i16));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.H = null;
        boolean z13 = !z10 && Math.abs(a10.a - this.n) > f17;
        if (z13) {
            this.n = a10.a;
            ti.o oVar = this.J.a;
            if (oVar != null) {
                oVar.c();
            }
        }
        k();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
            this.s = null;
        }
        this.y = false;
        z zVar = this.D;
        org.telegram.messenger.g0.r(zVar);
        if (z9) {
            this.r = 0.0f;
            if (!z13 || getWidth() <= 0 || getHeight() <= 0 || f(getWidth(), getHeight())) {
                h();
            } else {
                this.y = true;
                org.telegram.messenger.g0.i3(zVar, 500L);
            }
        } else {
            this.r = 1.0f;
            b();
        }
        e();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        int[] iArr = this.H;
        if (iArr == null || iArr.length != i7) {
            int[] iArr2 = new int[i7];
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int indexOfChild = indexOfChild((d0) obj);
                if (indexOfChild >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild;
                    i11++;
                }
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                int indexOfChild2 = indexOfChild((d0) obj2);
                if (indexOfChild2 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild2;
                    i11++;
                }
            }
            ArrayList arrayList3 = this.a;
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                int indexOfChild3 = indexOfChild((d0) obj3);
                if (indexOfChild3 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild3;
                    i11++;
                }
            }
            for (int i15 = 0; i15 < i7 && i11 < i7; i15++) {
                if (!(getChildAt(i15) instanceof d0)) {
                    iArr2[i11] = i15;
                    i11++;
                }
            }
            if (i11 != i7) {
                for (int i16 = 0; i16 < i7; i16++) {
                    iArr2[i16] = i16;
                }
            }
            this.H = iArr2;
        }
        return this.H[i10];
    }

    public final void h() {
        this.y = false;
        org.telegram.messenger.g0.r(this.D);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(420L);
        this.s.setInterpolator(xq.h);
        this.s.addUpdateListener(new v3(this, 16));
        this.s.addListener(new va(this, 11));
        this.s.start();
    }

    public final void i() {
        if (this.w) {
            int i7 = 0;
            this.w = false;
            org.telegram.messenger.g0.r(this.I);
            this.f.b();
            this.y = false;
            org.telegram.messenger.g0.r(this.D);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.s.cancel();
                this.s = null;
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                d0Var.b();
                removeView(d0Var);
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                d0 d0Var2 = (d0) obj2;
                d0Var2.b();
                removeView(d0Var2);
            }
            ArrayList arrayList3 = this.c;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                d0 d0Var3 = (d0) obj3;
                d0Var3.b();
                removeView(d0Var3);
            }
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            this.r = 1.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b A[EDGE_INSN: B:142:0x030b->B:143:0x030b BREAK  A[LOOP:7: B:126:0x02db->B:137:0x0306], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216 A[EDGE_INSN: B:68:0x0216->B:69:0x0216 BREAK  A[LOOP:3: B:58:0x01db->B:65:0x0213], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z9) {
        VoIPService voIPService;
        d0 d0Var;
        d0 d0Var2;
        VoIPService voIPService2;
        int i7;
        long j3;
        int size;
        boolean z10;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        a0.h hVar;
        long j12;
        int i13;
        int size2;
        int i14;
        int i15;
        boolean z11;
        long C1;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z12;
        String str;
        TLRPC.Chat chat;
        s3 s3Var;
        long j13;
        float f10;
        boolean z13;
        boolean z14;
        if (this.w) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            r3 r3Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
            if (sharedInstance == null || r3Var == null) {
                return;
            }
            long selfId = sharedInstance.getSelfId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TextView textView = this.d;
            this.e.setImageResource(sharedInstance.isMicMute() ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
            this.f.c();
            long c10 = g.c();
            if (c10 != this.G) {
                this.G = c10;
                ti.o oVar = this.J.a;
                if (oVar != null) {
                    oVar.c();
                }
            }
            int callState = sharedInstance.getCallState();
            if (callState == 5) {
                textView.setText(hd.M0(2131743254, null));
                textView.setVisibility(0);
            } else if (callState != 3) {
                textView.setText(hd.M0(2131743420, null));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList a10 = e0.a(selfId, r3Var);
            int size3 = a10.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj = a10.get(i16);
                i16++;
                s3 s3Var2 = (s3) obj;
                linkedHashMap.put(e0.i(s3Var2), s3Var2);
            }
            boolean isEmpty = linkedHashMap.isEmpty();
            boolean z15 = true;
            int size4 = this.a.size() - 1;
            boolean z16 = false;
            while (size4 >= 0) {
                d0 d0Var3 = (d0) this.a.get(size4);
                if (!isEmpty ? !(d0Var3.c == null || linkedHashMap.containsKey(d0Var3.a)) : d0Var3.c != null) {
                    this.a.remove(size4);
                    d0Var3.getClass();
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    TLRPC.GroupCallParticipant groupCallParticipant2 = d0Var3.n;
                    if (groupCallParticipant2 == null || sharedInstance3 == null) {
                        z14 = z15;
                    } else {
                        z14 = z15;
                        sharedInstance3.removeExtraRemoteSink(groupCallParticipant2, d0Var3.r, d0Var3.T);
                    }
                    d0Var3.n = null;
                    this.b.add(d0Var3);
                    z16 = z14;
                } else {
                    z14 = z15;
                }
                size4--;
                z15 = z14;
            }
            boolean z17 = z15;
            for (int size5 = this.c.size() - 1; size5 >= 0; size5--) {
                d0 d0Var4 = (d0) this.c.get(size5);
                if (!linkedHashMap.containsKey(d0Var4.a)) {
                    this.c.remove(size5);
                    d0Var4.b();
                    removeView(d0Var4);
                    this.H = null;
                }
            }
            if (!isEmpty) {
                for (s3 s3Var3 : linkedHashMap.values()) {
                    String i17 = e0.i(s3Var3);
                    ArrayList arrayList = this.a;
                    int size6 = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size6) {
                            voIPService = sharedInstance;
                            d0Var = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i18);
                        i18++;
                        d0Var = (d0) obj2;
                        voIPService = sharedInstance;
                        if (TextUtils.equals(d0Var.a, i17)) {
                            break;
                        } else {
                            sharedInstance = voIPService;
                        }
                    }
                    if (d0Var == null) {
                        ArrayList arrayList2 = this.c;
                        int size7 = arrayList2.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size7) {
                                d0Var2 = null;
                                break;
                            }
                            Object obj3 = arrayList2.get(i19);
                            i19++;
                            d0Var2 = (d0) obj3;
                            if (TextUtils.equals(d0Var2.a, i17)) {
                                break;
                            }
                        }
                        d0Var = d0Var2;
                    }
                    if (d0Var == null) {
                        d0 d0Var5 = new d0(this.J, getContext(), i17, s3Var3);
                        if (z9) {
                            this.a.add(d0Var5);
                            addView(d0Var5);
                            z16 = z17;
                        } else {
                            d0Var5.y = elapsedRealtime;
                            d0Var5.setAlpha(0.0f);
                            this.c.add(d0Var5);
                            addView(d0Var5);
                        }
                    } else {
                        d0Var.b = s3Var3;
                    }
                    sharedInstance = voIPService;
                }
            } else if (this.a.isEmpty()) {
                d0 d0Var6 = new d0(this.J, getContext(), "avatar", null);
                this.a.add(d0Var6);
                addView(d0Var6);
                voIPService2 = sharedInstance;
                z16 = z17;
                i7 = 0;
                while (true) {
                    j3 = 2000;
                    if (i7 < this.c.size()) {
                        break;
                    }
                    d0 d0Var7 = (d0) this.c.get(i7);
                    d0Var7.d(false);
                    if (d0Var7.J > 0.0f || elapsedRealtime - d0Var7.y >= 2000) {
                        this.c.remove(i7);
                        this.a.add(d0Var7);
                        this.H = null;
                        i7--;
                        z16 = z17;
                    }
                    i7++;
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = this.a;
                    int size8 = arrayList3.size();
                    boolean z18 = false;
                    int i20 = 0;
                    while (i20 < size8) {
                        Object obj4 = arrayList3.get(i20);
                        i20++;
                        z18 |= !(((d0) obj4).c == null ? z17 : false);
                    }
                    for (int size9 = this.a.size() - 1; size9 >= 0 && z18; size9--) {
                        d0 d0Var8 = (d0) this.a.get(size9);
                        if (d0Var8.c == null) {
                            this.a.remove(size9);
                            this.b.add(d0Var8);
                            z16 = z17;
                        }
                    }
                }
                ArrayList arrayList4 = this.a;
                size = arrayList4.size();
                z10 = false;
                boolean z19 = false;
                i10 = 0;
                while (i10 < size) {
                    Object obj5 = arrayList4.get(i10);
                    i10++;
                    d0 d0Var9 = (d0) obj5;
                    long j14 = j3;
                    d0Var9.d(z17);
                    boolean z20 = d0Var9.K > 0.0f;
                    ArrayList arrayList5 = arrayList4;
                    float f11 = d0Var9.J;
                    if (f11 > 0.0f) {
                        f10 = f11;
                        z13 = true;
                    } else {
                        f10 = f11;
                        z13 = false;
                    }
                    if (z20 != z13 || (z13 && Math.abs(Math.log(f10 / r10)) > 0.10000000149011612d)) {
                        z10 = true;
                    }
                    if (!z13 && d0Var9.c != null && elapsedRealtime - d0Var9.D < j14) {
                        z19 = true;
                    }
                    j3 = j14;
                    arrayList4 = arrayList5;
                    z17 = true;
                }
                if (z10 && !z19) {
                    z16 = true;
                }
                if (!z16 || z9) {
                    i11 = 1;
                    g(!z9);
                } else {
                    i11 = 1;
                }
                j10 = 0;
                j11 = 0;
                long j15 = 0;
                i12 = 0;
                while (true) {
                    hVar = r3Var.P;
                    if (i12 < hVar.m()) {
                        break;
                    }
                    TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) hVar.n(i12);
                    long j16 = hVar.j(i12);
                    if (groupCallParticipant3 == null || j16 == selfId) {
                        j13 = j10;
                    } else {
                        j13 = j10;
                        if (j11 == j10 || groupCallParticipant3.lastSpeakTime > j15) {
                            j15 = groupCallParticipant3.lastSpeakTime;
                            j11 = j16;
                        }
                    }
                    i12++;
                    j10 = j13;
                }
                j12 = j10;
                if (j11 == j12) {
                    this.F = j11;
                } else if (!isEmpty && !this.a.isEmpty()) {
                    i13 = 0;
                    if (((d0) this.a.get(0)).b != null) {
                        this.F = ij.C1(((d0) this.a.get(0)).b.a.peer);
                    }
                    if (j11 == j12) {
                        long j17 = this.F;
                        j11 = (j17 == j12 || r3Var.d.f(j17) == null) ? -voIPService2.getChat().id : this.F;
                    }
                    ArrayList arrayList6 = this.a;
                    size2 = arrayList6.size();
                    i14 = i13;
                    while (i14 < size2) {
                        Object obj6 = arrayList6.get(i14);
                        i14++;
                        d0 d0Var10 = (d0) obj6;
                        if (d0Var10.n == null) {
                            d0Var10.c();
                        }
                        k2 k2Var = d0Var10.c;
                        int i21 = (k2Var == null || d0Var10.n == null || !k2Var.d.isFirstFrameRendered() || elapsedRealtime - d0Var10.s >= 1500) ? i13 : i11;
                        k2 k2Var2 = d0Var10.c;
                        if (k2Var2 != null && d0Var10.n != null && !k2Var2.d.isFirstFrameRendered() && (s3Var = d0Var10.b) != null) {
                            boolean z21 = s3Var.b;
                            TLRPC.GroupCallParticipant groupCallParticipant4 = s3Var.a;
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = z21 ? groupCallParticipant4.presentation : groupCallParticipant4.video;
                            if (tL_groupCallParticipantVideo != null && !tL_groupCallParticipantVideo.paused && elapsedRealtime - d0Var10.D < 1200) {
                                i15 = i11;
                                z11 = (i21 == 0 || i15 != 0) ? i11 : i13;
                                if (d0Var10.E != z11) {
                                    d0Var10.E = z11;
                                    d0Var10.d.setVisibility(z11 != 0 ? 8 : i13);
                                    if (org.telegram.messenger.r2.a && d0Var10.c != null) {
                                        long elapsedRealtime2 = d0Var10.s == j12 ? -1L : SystemClock.elapsedRealtime() - d0Var10.s;
                                        StringBuilder sb2 = new StringBuilder("group call pip: ");
                                        sb2.append(d0Var10.a);
                                        sb2.append(z11 != 0 ? " video" : " avatar");
                                        sb2.append(", last frame ");
                                        sb2.append(elapsedRealtime2);
                                        sb2.append(" ms ago, subscribed ");
                                        sb2.append(d0Var10.n != null ? i11 : i13);
                                        sb2.append(", rendered ");
                                        sb2.append(d0Var10.c.d.isFirstFrameRendered());
                                        a8.b(sb2.toString());
                                    }
                                    d0Var10.invalidate();
                                }
                                s3 s3Var4 = d0Var10.b;
                                C1 = s3Var4 == null ? ij.C1(s3Var4.a.peer) : j11;
                                if (C1 != d0Var10.F) {
                                    d0Var10.F = C1;
                                    qp s12 = qp.s1(voIPService2.getAccount());
                                    if (m5.E(C1)) {
                                        TLRPC.User a22 = s12.a2(Long.valueOf(C1));
                                        str = t10.p(a22);
                                        chat = a22;
                                    } else {
                                        TLRPC.Chat M0 = s12.M0(Long.valueOf(-C1));
                                        if (M0 != null) {
                                            str = M0.title;
                                            chat = M0;
                                        } else {
                                            str = "";
                                            chat = M0;
                                        }
                                    }
                                    d0Var10.d.a(chat);
                                    d0Var10.e.setText(str);
                                }
                                groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(C1);
                                if (groupCallParticipant != null && r3Var.P.g(null, C1) != null) {
                                    z12 = i11;
                                    h hVar2 = d0Var10.d;
                                    float f12 = z12 == 0 ? groupCallParticipant.amplitude : 0.0f;
                                    hVar2.w = z12;
                                    hVar2.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                    hVar2.invalidate();
                                    if (d0Var10.G == z12) {
                                        d0Var10.G = z12;
                                        d0Var10.invalidate();
                                    }
                                    i13 = 0;
                                }
                                z12 = i13;
                                h hVar22 = d0Var10.d;
                                if (z12 == 0) {
                                }
                                hVar22.w = z12;
                                hVar22.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                hVar22.invalidate();
                                if (d0Var10.G == z12) {
                                }
                                i13 = 0;
                            }
                        }
                        i15 = i13;
                        if (i21 == 0) {
                        }
                        if (d0Var10.E != z11) {
                        }
                        s3 s3Var42 = d0Var10.b;
                        if (s3Var42 == null) {
                        }
                        if (C1 != d0Var10.F) {
                        }
                        groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(C1);
                        if (groupCallParticipant != null) {
                            z12 = i11;
                            h hVar222 = d0Var10.d;
                            if (z12 == 0) {
                            }
                            hVar222.w = z12;
                            hVar222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                            hVar222.invalidate();
                            if (d0Var10.G == z12) {
                            }
                            i13 = 0;
                        }
                        z12 = i13;
                        h hVar2222 = d0Var10.d;
                        if (z12 == 0) {
                        }
                        hVar2222.w = z12;
                        hVar2222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                        hVar2222.invalidate();
                        if (d0Var10.G == z12) {
                        }
                        i13 = 0;
                    }
                }
                i13 = 0;
                if (j11 == j12) {
                }
                ArrayList arrayList62 = this.a;
                size2 = arrayList62.size();
                i14 = i13;
                while (i14 < size2) {
                }
            }
            voIPService2 = sharedInstance;
            i7 = 0;
            while (true) {
                j3 = 2000;
                if (i7 < this.c.size()) {
                }
                i7++;
            }
            if (!isEmpty) {
            }
            ArrayList arrayList42 = this.a;
            size = arrayList42.size();
            z10 = false;
            boolean z192 = false;
            i10 = 0;
            while (i10 < size) {
            }
            if (z10) {
                z16 = true;
            }
            if (z16) {
            }
            i11 = 1;
            g(!z9);
            j10 = 0;
            j11 = 0;
            long j152 = 0;
            i12 = 0;
            while (true) {
                hVar = r3Var.P;
                if (i12 < hVar.m()) {
                }
                i12++;
                j10 = j13;
            }
            j12 = j10;
            if (j11 == j12) {
            }
            i13 = 0;
            if (j11 == j12) {
            }
            ArrayList arrayList622 = this.a;
            size2 = arrayList622.size();
            i14 = i13;
            while (i14 < size2) {
            }
        }
    }

    public final void k() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var = (d0) obj;
            float[] fArr = d0Var.N;
            int round = Math.round((fArr[2] - fArr[0]) * width);
            float[] fArr2 = d0Var.N;
            int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
            int max = Math.max(1, round);
            int max2 = Math.max(1, round2);
            float f10 = d0Var.J;
            if (f10 > 0.0f) {
                float f11 = max;
                float f12 = max2;
                if (f11 / f12 > f10) {
                    max2 = Math.round(f11 / f10);
                } else {
                    max = Math.round(f12 * f10);
                }
            }
            if (max != d0Var.R || max2 != d0Var.S) {
                d0Var.R = max;
                d0Var.S = max2;
                d0Var.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        ImageView imageView = this.e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(6.0f));
        int i13 = i11 - i7;
        TextView textView = this.d;
        int measuredWidth = (i13 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, org.telegram.messenger.g0.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        this.f.layout(0, 0, i13, i12 - i10);
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(64.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
        if (this.y && i7 > 0 && i10 > 0 && f(i7, i10)) {
            post(this.D);
        } else {
            if (this.y) {
                return;
            }
            post(new z(this, 0));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.H = null;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.H = null;
    }
}
