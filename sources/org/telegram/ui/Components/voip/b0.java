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
import c8.jd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zj;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b0 extends ViewGroup {
    public final a0 E;
    public float F;
    public long G;
    public long H;
    public int[] I;
    public final zj J;
    public final /* synthetic */ f0 K;
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
    public b0(f0 f0Var, Context context) {
        super(context);
        this.K = f0Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.r = 1.0f;
        this.E = new a0(this, 1);
        this.J = new zj(this, 21);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.n = f0Var.c;
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(j6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
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

    public static void a(b0 b0Var) {
        int width = b0Var.getWidth();
        int height = b0Var.getHeight();
        if (!b0Var.w || b0Var.y || width <= 0 || height <= 0 || b0Var.a.isEmpty() || b0Var.F <= 0.0f || !b0Var.c() || Math.abs(Math.log((width / height) / b0Var.F)) <= 0.06d) {
            return;
        }
        b0Var.g(true);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e0 e0Var = (e0) obj;
            e0Var.b();
            removeView(e0Var);
        }
        arrayList.clear();
        this.I = null;
    }

    public final boolean c() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        return W != null && org.telegram.messenger.g0.H1(W) && SystemClock.elapsedRealtime() - this.x > 1000;
    }

    public final void d(e0 e0Var, int i7, int i10) {
        float[] fArr = e0Var.P;
        float f10 = this.r;
        for (int i11 = 0; i11 < 4; i11++) {
            float f11 = e0Var.N[i11];
            fArr[i11] = com.google.android.gms.internal.vision.e2.z(e0Var.O[i11], f11, f10, f11);
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
        if (e0Var.getMeasuredWidth() != max || e0Var.getMeasuredHeight() != max2 || e0Var.isLayoutRequested()) {
            e0Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max2, TLObject.FLAG_30));
        }
        e0Var.layout(round, round2, max + round, max2 + round2);
        float f20 = this.r;
        float f21 = e0Var.Q;
        float f22 = ((e0Var.R - f21) * f20) + f21;
        e0Var.setAlpha(f22);
        float f23 = (f22 * 0.2f) + 0.8f;
        e0Var.setScaleX(f23);
        e0Var.setScaleY(f23);
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
            d((e0) obj, width, height);
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            d((e0) obj2, width, height);
        }
        invalidate();
    }

    public final boolean f(int i7, int i10) {
        return Math.abs(Math.log((double) ((((float) i7) / ((float) i10)) / this.n))) < 0.06d;
    }

    public final void g(boolean z10) {
        boolean z11;
        int i7;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z12 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            float f10 = e0Var.K;
            fArr[i10] = f10;
            s3 s3Var = e0Var.b;
            fArr2[i10] = (s3Var == null || !s3Var.b) ? 1.0f : 2.0f;
            boolean z13 = e0Var.M;
            iArr[i10] = z13 ? i10 : -1;
            z12 |= z13 && e0Var.L <= 0.0f && f10 > 0.0f;
        }
        wi.j a10 = jd.a(fArr, fArr2, 0.45f, 2.35f, iArr, z12 ? 0.0f : this.n);
        int width = getWidth();
        int height = getHeight();
        float f11 = 0.001f;
        if (Math.abs(a10.a - this.n) > 0.001f || width <= 0 || height <= 0 || f(width, height) || !c()) {
            z11 = false;
        } else {
            float f12 = width / height;
            a10 = jd.a(fArr, fArr2, f12, f12, iArr, 0.0f);
            z11 = true;
        }
        this.F = a10.a;
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("group call pip: mosaic ");
            sb2.append(Arrays.toString(fArr));
            sb2.append(z11 ? " in the window" : "");
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
            e0 e0Var2 = (e0) obj;
            float f13 = this.r;
            float f14 = f11;
            float[] fArr3 = e0Var2.N;
            for (int i12 = 0; i12 < 4; i12++) {
                float f15 = fArr3[i12];
                fArr3[i12] = com.google.android.gms.internal.vision.e2.z(e0Var2.O[i12], f15, f13, f15);
            }
            float f16 = e0Var2.Q;
            e0Var2.Q = com.google.android.gms.internal.vision.e2.z(e0Var2.R, f16, f13, f16);
            f11 = f14;
        }
        float f17 = f11;
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            e0 e0Var3 = (e0) obj2;
            float f18 = this.r;
            float[] fArr4 = e0Var3.N;
            float[] fArr5 = e0Var3.O;
            int i14 = 0;
            while (i14 < i7) {
                float f19 = fArr4[i14];
                fArr4[i14] = com.google.android.gms.internal.vision.e2.z(fArr5[i14], f19, f18, f19);
                i14++;
                i7 = 4;
            }
            float f20 = e0Var3.Q;
            e0Var3.Q = com.google.android.gms.internal.vision.e2.z(e0Var3.R, f20, f18, f20);
            System.arraycopy(e0Var3.N, 0, fArr5, 0, 4);
            e0Var3.R = 0.0f;
            i7 = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            e0 e0Var4 = (e0) arrayList.get(i15);
            System.arraycopy(a10.b, i15 * 4, e0Var4.O, 0, 4);
            e0Var4.R = 1.0f;
            e0Var4.L = fArr[i15];
            if (!e0Var4.M || !z10) {
                System.arraycopy(e0Var4.O, 0, e0Var4.N, 0, 4);
                e0Var4.Q = z10 ? 0.0f : 1.0f;
                e0Var4.M = true;
            }
        }
        for (int i16 : a10.c) {
            arrayList3.add((e0) arrayList.get(i16));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.I = null;
        boolean z14 = !z11 && Math.abs(a10.a - this.n) > f17;
        if (z14) {
            this.n = a10.a;
            wi.n nVar = this.K.a;
            if (nVar != null) {
                nVar.c();
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
        a0 a0Var = this.E;
        org.telegram.messenger.g0.r(a0Var);
        if (z10) {
            this.r = 0.0f;
            if (!z14 || getWidth() <= 0 || getHeight() <= 0 || f(getWidth(), getHeight())) {
                h();
            } else {
                this.y = true;
                org.telegram.messenger.g0.i3(a0Var, 500L);
            }
        } else {
            this.r = 1.0f;
            b();
        }
        e();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        int[] iArr = this.I;
        if (iArr == null || iArr.length != i7) {
            int[] iArr2 = new int[i7];
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int indexOfChild = indexOfChild((e0) obj);
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
                int indexOfChild2 = indexOfChild((e0) obj2);
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
                int indexOfChild3 = indexOfChild((e0) obj3);
                if (indexOfChild3 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild3;
                    i11++;
                }
            }
            for (int i15 = 0; i15 < i7 && i11 < i7; i15++) {
                if (!(getChildAt(i15) instanceof e0)) {
                    iArr2[i11] = i15;
                    i11++;
                }
            }
            if (i11 != i7) {
                for (int i16 = 0; i16 < i7; i16++) {
                    iArr2[i16] = i16;
                }
            }
            this.I = iArr2;
        }
        return this.I[i10];
    }

    public final void h() {
        this.y = false;
        org.telegram.messenger.g0.r(this.E);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(420L);
        this.s.setInterpolator(er.h);
        this.s.addUpdateListener(new hi.j3(this, 16));
        this.s.addListener(new w9(this, 12));
        this.s.start();
    }

    public final void i() {
        if (this.w) {
            int i7 = 0;
            this.w = false;
            org.telegram.messenger.g0.r(this.J);
            this.f.b();
            this.y = false;
            org.telegram.messenger.g0.r(this.E);
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
                e0 e0Var = (e0) obj;
                e0Var.b();
                removeView(e0Var);
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e0 e0Var2 = (e0) obj2;
                e0Var2.b();
                removeView(e0Var2);
            }
            ArrayList arrayList3 = this.c;
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                e0 e0Var3 = (e0) obj3;
                e0Var3.b();
                removeView(e0Var3);
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
    /* JADX WARN: Removed duplicated region for block: B:168:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216 A[EDGE_INSN: B:68:0x0216->B:69:0x0216 BREAK  A[LOOP:3: B:58:0x01db->B:65:0x0213], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        VoIPService voIPService;
        e0 e0Var;
        e0 e0Var2;
        VoIPService voIPService2;
        int i7;
        long j3;
        int size;
        boolean z11;
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
        boolean z12;
        long B1;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z13;
        String str;
        TLRPC.Chat chat;
        s3 s3Var;
        long j13;
        float f10;
        boolean z14;
        boolean z15;
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
            if (c10 != this.H) {
                this.H = c10;
                wi.n nVar = this.K.a;
                if (nVar != null) {
                    nVar.c();
                }
            }
            int callState = sharedInstance.getCallState();
            if (callState == 5) {
                textView.setText(hd.M0(2131743253, null));
                textView.setVisibility(0);
            } else if (callState != 3) {
                textView.setText(hd.M0(2131743419, null));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList e10 = f0.e(selfId, r3Var);
            int size3 = e10.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj = e10.get(i16);
                i16++;
                s3 s3Var2 = (s3) obj;
                linkedHashMap.put(f0.i(s3Var2), s3Var2);
            }
            boolean isEmpty = linkedHashMap.isEmpty();
            boolean z16 = true;
            int size4 = this.a.size() - 1;
            boolean z17 = false;
            while (size4 >= 0) {
                e0 e0Var3 = (e0) this.a.get(size4);
                if (!isEmpty ? !(e0Var3.c == null || linkedHashMap.containsKey(e0Var3.a)) : e0Var3.c != null) {
                    this.a.remove(size4);
                    e0Var3.getClass();
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    TLRPC.GroupCallParticipant groupCallParticipant2 = e0Var3.n;
                    if (groupCallParticipant2 == null || sharedInstance3 == null) {
                        z15 = z16;
                    } else {
                        z15 = z16;
                        sharedInstance3.removeExtraRemoteSink(groupCallParticipant2, e0Var3.r, e0Var3.U);
                    }
                    e0Var3.n = null;
                    this.b.add(e0Var3);
                    z17 = z15;
                } else {
                    z15 = z16;
                }
                size4--;
                z16 = z15;
            }
            boolean z18 = z16;
            for (int size5 = this.c.size() - 1; size5 >= 0; size5--) {
                e0 e0Var4 = (e0) this.c.get(size5);
                if (!linkedHashMap.containsKey(e0Var4.a)) {
                    this.c.remove(size5);
                    e0Var4.b();
                    removeView(e0Var4);
                    this.I = null;
                }
            }
            if (!isEmpty) {
                for (s3 s3Var3 : linkedHashMap.values()) {
                    String i17 = f0.i(s3Var3);
                    ArrayList arrayList = this.a;
                    int size6 = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size6) {
                            voIPService = sharedInstance;
                            e0Var = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i18);
                        i18++;
                        e0Var = (e0) obj2;
                        voIPService = sharedInstance;
                        if (TextUtils.equals(e0Var.a, i17)) {
                            break;
                        } else {
                            sharedInstance = voIPService;
                        }
                    }
                    if (e0Var == null) {
                        ArrayList arrayList2 = this.c;
                        int size7 = arrayList2.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size7) {
                                e0Var2 = null;
                                break;
                            }
                            Object obj3 = arrayList2.get(i19);
                            i19++;
                            e0Var2 = (e0) obj3;
                            if (TextUtils.equals(e0Var2.a, i17)) {
                                break;
                            }
                        }
                        e0Var = e0Var2;
                    }
                    if (e0Var == null) {
                        e0 e0Var5 = new e0(this.K, getContext(), i17, s3Var3);
                        if (z10) {
                            this.a.add(e0Var5);
                            addView(e0Var5);
                            z17 = z18;
                        } else {
                            e0Var5.y = elapsedRealtime;
                            e0Var5.setAlpha(0.0f);
                            this.c.add(e0Var5);
                            addView(e0Var5);
                        }
                    } else {
                        e0Var.b = s3Var3;
                    }
                    sharedInstance = voIPService;
                }
            } else if (this.a.isEmpty()) {
                e0 e0Var6 = new e0(this.K, getContext(), "avatar", null);
                this.a.add(e0Var6);
                addView(e0Var6);
                voIPService2 = sharedInstance;
                z17 = z18;
                i7 = 0;
                while (true) {
                    j3 = 2000;
                    if (i7 < this.c.size()) {
                        break;
                    }
                    e0 e0Var7 = (e0) this.c.get(i7);
                    e0Var7.d(false);
                    if (e0Var7.K > 0.0f || elapsedRealtime - e0Var7.y >= 2000) {
                        this.c.remove(i7);
                        this.a.add(e0Var7);
                        this.I = null;
                        i7--;
                        z17 = z18;
                    }
                    i7++;
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = this.a;
                    int size8 = arrayList3.size();
                    boolean z19 = false;
                    int i20 = 0;
                    while (i20 < size8) {
                        Object obj4 = arrayList3.get(i20);
                        i20++;
                        z19 |= !(((e0) obj4).c == null ? z18 : false);
                    }
                    for (int size9 = this.a.size() - 1; size9 >= 0 && z19; size9--) {
                        e0 e0Var8 = (e0) this.a.get(size9);
                        if (e0Var8.c == null) {
                            this.a.remove(size9);
                            this.b.add(e0Var8);
                            z17 = z18;
                        }
                    }
                }
                ArrayList arrayList4 = this.a;
                size = arrayList4.size();
                z11 = false;
                boolean z20 = false;
                i10 = 0;
                while (i10 < size) {
                    Object obj5 = arrayList4.get(i10);
                    i10++;
                    e0 e0Var9 = (e0) obj5;
                    long j14 = j3;
                    e0Var9.d(z18);
                    boolean z21 = e0Var9.L > 0.0f;
                    ArrayList arrayList5 = arrayList4;
                    float f11 = e0Var9.K;
                    if (f11 > 0.0f) {
                        f10 = f11;
                        z14 = true;
                    } else {
                        f10 = f11;
                        z14 = false;
                    }
                    if (z21 != z14 || (z14 && Math.abs(Math.log(f10 / r10)) > 0.10000000149011612d)) {
                        z11 = true;
                    }
                    if (!z14 && e0Var9.c != null && elapsedRealtime - e0Var9.E < j14) {
                        z20 = true;
                    }
                    j3 = j14;
                    arrayList4 = arrayList5;
                    z18 = true;
                }
                if (z11 && !z20) {
                    z17 = true;
                }
                if (!z17 || z10) {
                    i11 = 1;
                    g(!z10);
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
                    this.G = j11;
                } else if (!isEmpty && !this.a.isEmpty()) {
                    i13 = 0;
                    if (((e0) this.a.get(0)).b != null) {
                        this.G = gj.B1(((e0) this.a.get(0)).b.a.peer);
                    }
                    if (j11 == j12) {
                        long j17 = this.G;
                        if (j17 != j12 && r3Var.d.f(j17) != null) {
                            j11 = this.G;
                        } else if (voIPService2.getChat() != null) {
                            j11 = -voIPService2.getChat().id;
                        } else {
                            int i21 = i13;
                            while (true) {
                                if (i21 >= r3Var.e.size()) {
                                    break;
                                }
                                long B12 = gj.B1(((TLRPC.GroupCallParticipant) r3Var.e.get(i21)).peer);
                                if (B12 != selfId) {
                                    selfId = B12;
                                    break;
                                }
                                i21++;
                            }
                            j11 = selfId;
                        }
                    }
                    ArrayList arrayList6 = this.a;
                    size2 = arrayList6.size();
                    i14 = i13;
                    while (i14 < size2) {
                        Object obj6 = arrayList6.get(i14);
                        i14++;
                        e0 e0Var10 = (e0) obj6;
                        if (e0Var10.n == null) {
                            e0Var10.c();
                        }
                        o2 o2Var = e0Var10.c;
                        int i22 = (o2Var == null || e0Var10.n == null || !o2Var.d.isFirstFrameRendered() || elapsedRealtime - e0Var10.s >= 1500) ? i13 : i11;
                        o2 o2Var2 = e0Var10.c;
                        if (o2Var2 != null && e0Var10.n != null && !o2Var2.d.isFirstFrameRendered() && (s3Var = e0Var10.b) != null) {
                            boolean z22 = s3Var.b;
                            TLRPC.GroupCallParticipant groupCallParticipant4 = s3Var.a;
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = z22 ? groupCallParticipant4.presentation : groupCallParticipant4.video;
                            if (tL_groupCallParticipantVideo != null && !tL_groupCallParticipantVideo.paused && elapsedRealtime - e0Var10.E < 1200) {
                                i15 = i11;
                                z12 = (i22 == 0 || i15 != 0) ? i11 : i13;
                                if (e0Var10.F != z12) {
                                    e0Var10.F = z12;
                                    e0Var10.d.setVisibility(z12 != 0 ? 8 : i13);
                                    if (org.telegram.messenger.r2.a && e0Var10.c != null) {
                                        long elapsedRealtime2 = e0Var10.s == j12 ? -1L : SystemClock.elapsedRealtime() - e0Var10.s;
                                        StringBuilder sb2 = new StringBuilder("group call pip: ");
                                        sb2.append(e0Var10.a);
                                        sb2.append(z12 != 0 ? " video" : " avatar");
                                        sb2.append(", last frame ");
                                        sb2.append(elapsedRealtime2);
                                        sb2.append(" ms ago, subscribed ");
                                        sb2.append(e0Var10.n != null ? i11 : i13);
                                        sb2.append(", rendered ");
                                        sb2.append(e0Var10.c.d.isFirstFrameRendered());
                                        a8.b(sb2.toString());
                                    }
                                    e0Var10.invalidate();
                                }
                                s3 s3Var4 = e0Var10.b;
                                B1 = s3Var4 == null ? gj.B1(s3Var4.a.peer) : j11;
                                if (B1 != e0Var10.G) {
                                    e0Var10.G = B1;
                                    np s12 = np.s1(voIPService2.getAccount());
                                    if (m5.E(B1)) {
                                        TLRPC.User a22 = s12.a2(Long.valueOf(B1));
                                        str = q10.p(a22);
                                        chat = a22;
                                    } else {
                                        TLRPC.Chat M0 = s12.M0(Long.valueOf(-B1));
                                        if (M0 != null) {
                                            str = M0.title;
                                            chat = M0;
                                        } else {
                                            str = "";
                                            chat = M0;
                                        }
                                    }
                                    e0Var10.d.a(chat);
                                    e0Var10.e.setText(str);
                                }
                                groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(B1);
                                if (groupCallParticipant != null && r3Var.P.g(null, B1) != null) {
                                    z13 = i11;
                                    h hVar2 = e0Var10.d;
                                    float f12 = z13 == 0 ? groupCallParticipant.amplitude : 0.0f;
                                    hVar2.w = z13;
                                    hVar2.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                    hVar2.invalidate();
                                    if (e0Var10.H == z13) {
                                        e0Var10.H = z13;
                                        e0Var10.invalidate();
                                    }
                                    i13 = 0;
                                }
                                z13 = i13;
                                h hVar22 = e0Var10.d;
                                if (z13 == 0) {
                                }
                                hVar22.w = z13;
                                hVar22.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                                hVar22.invalidate();
                                if (e0Var10.H == z13) {
                                }
                                i13 = 0;
                            }
                        }
                        i15 = i13;
                        if (i22 == 0) {
                        }
                        if (e0Var10.F != z12) {
                        }
                        s3 s3Var42 = e0Var10.b;
                        if (s3Var42 == null) {
                        }
                        if (B1 != e0Var10.G) {
                        }
                        groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(B1);
                        if (groupCallParticipant != null) {
                            z13 = i11;
                            h hVar222 = e0Var10.d;
                            if (z13 == 0) {
                            }
                            hVar222.w = z13;
                            hVar222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                            hVar222.invalidate();
                            if (e0Var10.H == z13) {
                            }
                            i13 = 0;
                        }
                        z13 = i13;
                        h hVar2222 = e0Var10.d;
                        if (z13 == 0) {
                        }
                        hVar2222.w = z13;
                        hVar2222.r = Math.min(1.0f, Math.max(0.0f, (f12 * 15.0f) / 80.0f));
                        hVar2222.invalidate();
                        if (e0Var10.H == z13) {
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
            z11 = false;
            boolean z202 = false;
            i10 = 0;
            while (i10 < size) {
            }
            if (z11) {
                z17 = true;
            }
            if (z17) {
            }
            i11 = 1;
            g(!z10);
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
            e0 e0Var = (e0) obj;
            float[] fArr = e0Var.O;
            int round = Math.round((fArr[2] - fArr[0]) * width);
            float[] fArr2 = e0Var.O;
            int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
            int max = Math.max(1, round);
            int max2 = Math.max(1, round2);
            float f10 = e0Var.K;
            if (f10 > 0.0f) {
                float f11 = max;
                float f12 = max2;
                if (f11 / f12 > f10) {
                    max2 = Math.round(f11 / f10);
                } else {
                    max = Math.round(f12 * f10);
                }
            }
            if (max != e0Var.S || max2 != e0Var.T) {
                e0Var.S = max;
                e0Var.T = max2;
                e0Var.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
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
            post(this.E);
        } else {
            if (this.y) {
                return;
            }
            post(new a0(this, 0));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.I = null;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I = null;
    }
}
