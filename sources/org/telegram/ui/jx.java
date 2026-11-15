package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class jx implements org.telegram.messenger.is {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public bh E;
    public m9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.uj0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final an a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String w;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList G = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        N = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public jx(int i7, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.b = i7;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f10, int i7) {
        float s5 = q1Var.getPhotoImage().s() + q1Var.getY();
        return s5 > f10 && s5 < ((float) i7);
    }

    public static int f() {
        float min;
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r8.charAt(r3) <= 57343) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8.charAt(r3) != 9794) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i7 = 0;
        String str2 = str;
        while (i7 < length) {
            if (i7 < length - 1) {
                if (str2.charAt(i7) == 55356) {
                    int i10 = i7 + 1;
                    if (str2.charAt(i10) >= 57339) {
                    }
                }
                if (str2.charAt(i7) == 8205) {
                    int i11 = i7 + 1;
                    if (str2.charAt(i11) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i7), str2.subSequence(i7 + 2, str2.length()));
                    i7--;
                    i7++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i7) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i7), str2.subSequence(i7 + 1, str2.length()));
                i7--;
                i7++;
                str2 = str2;
            } else {
                i7++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(this.b).p0("EmojiAnimations");
        this.c = p02;
        if (p02 == null) {
            this.c = org.telegram.messenger.si.b0(this.b).n0("EmojiAnimations");
        }
        if (this.c == null) {
            org.telegram.messenger.si.b0(this.b).c1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i7 = 0; i7 < this.c.documents.size(); i7++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i7).id), this.c.documents.get(i7));
            }
            for (int i10 = 0; i10 < this.c.packs.size(); i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i10);
                if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = M;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i11 = 0; i11 < tL_stickerPack.documents.size(); i11++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i11)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i12 = 0; i12 < 8; i12++) {
                            String str3 = strArr[i12];
                            hashSet.add(str3);
                            hashMap2.put(str3, arrayList);
                        }
                    }
                }
            }
            this.d = true;
        }
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ix) arrayList.get(i7)).r.R();
            if (((ix) arrayList.get(i7)).j != null) {
                ((ix) arrayList.get(i7)).j.d(this.H);
            }
            i7++;
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.gj gjVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j3;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize F1;
        boolean z13;
        bh bhVar;
        int i11 = i10;
        boolean z14 = gjVar != null && gjVar.W3();
        boolean z15 = (gjVar == null || gjVar.M0() == null) ? false : true;
        if (z15 || z14 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 >= arrayList2.size()) {
                        if (z10 && z14 && i13 > 0) {
                            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
                            if (xbVar != null && xbVar.b == gjVar.e1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet j12 = org.telegram.messenger.gj.j1(gjVar.k);
                            TLRPC.TL_messages_stickerSet p02 = j12.short_name != null ? org.telegram.messenger.si.b0(this.b).p0(j12.short_name) : null;
                            if (p02 == null) {
                                p02 = org.telegram.messenger.si.b0(this.b).o0(j12.id);
                            }
                            if (p02 != null) {
                                o(p02, gjVar);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j12;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new v7(26, this, gjVar));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect M0 = gjVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(this.b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            j3 = 0;
                            long j10 = M0.effect_animation_id;
                            if (j10 == 0) {
                                j10 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= E0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = E0.documents.get(i15);
                                long j11 = j10;
                                if (document2 != null && document2.id == j11) {
                                    break;
                                }
                                i15++;
                                j10 = j11;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = org.telegram.messenger.gj.F1(document2);
                                z14 = F1 != null;
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z14) {
                                document2 = gjVar.F0();
                                F1 = org.telegram.messenger.gj.F1(gjVar.F0());
                            } else {
                                if (gjVar == null || !gjVar.F2()) {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i11;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i11 = abs;
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        ix ixVar = new ix();
                        ixVar.h = z14;
                        ixVar.i = z15;
                        if (!z15) {
                            ixVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            ixVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        ixVar.p = i7;
                        ixVar.q = document2;
                        ixVar.m = z12;
                        ImageReceiver imageReceiver = ixVar.r;
                        imageReceiver.u0 = true;
                        imageReceiver.t0 = z10;
                        if (org.telegram.messenger.gz.o() > 1) {
                            boolean z16 = org.telegram.messenger.r2.a;
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f;
                        boolean z17 = z14;
                        if (F1 == null) {
                            int f12 = f();
                            boolean z18 = z13;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue);
                            sb2.append("_");
                            imageReceiver.w1 = a8.p0.n(ixVar.p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            ixVar.r.q0(b10, sb3.toString(), null, "tgs", this.c, 1);
                            imageReceiver.h1 = new hx(this, ixVar, z10, gjVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z13;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.w1 = a8.p0.n(ixVar.p, "_", sb4);
                            }
                            ixVar.q = document2;
                            org.telegram.messenger.gc d = org.telegram.messenger.gc.d(F1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            sb5.append(z19 ? "_pcache" : "");
                            ixVar.r.q0(d, sb5.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (ixVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(ixVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.m10.i(this.b).n != this.J) {
                            int i18 = this.r;
                            if (i18 != 0 && i18 != i7 && (bhVar = this.E) != null) {
                                org.telegram.messenger.g0.r(bhVar);
                                this.E.run();
                            }
                            this.r = i7;
                            this.w = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j13 == j3) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            bh bhVar2 = this.E;
                            if (bhVar2 != null) {
                                org.telegram.messenger.g0.r(bhVar2);
                                this.E = null;
                            }
                            bh bhVar3 = new bh(this, 27);
                            this.E = bhVar3;
                            org.telegram.messenger.g0.i3(bhVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        org.telegram.messenger.np.s1(this.b).D4(11, 0, this.J, this.K, str);
                        return true;
                    }
                    if (((ix) arrayList2.get(i12)).p == i7) {
                        i13++;
                        if (!z15 && (((ix) arrayList2.get(i12)).r.B() == null || ((ix) arrayList2.get(i12)).r.B().y())) {
                            return false;
                        }
                    }
                    if (((ix) arrayList2.get(i12)).q != null && document != null) {
                        if (((ix) arrayList2.get(i12)).q.id == document.id) {
                            i14++;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Integer E1;
        if (i7 == org.telegram.messenger.ns.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.ns.T4;
        long j3 = this.J;
        if (i7 != i11) {
            if (i7 == org.telegram.messenger.ns.r && (E1 = org.telegram.messenger.np.s1(this.b).E1(j3, this.K)) != null && E1.intValue() == 5) {
                m9.u uVar = this.F;
                if (uVar != null) {
                    org.telegram.messenger.g0.r(uVar);
                }
                this.F = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j3 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i12 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.hb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        ImageReceiver imageReceiver;
        org.telegram.messenger.gj gjVar;
        if (this.G.isEmpty()) {
            return;
        }
        int i7 = 0;
        while (i7 < this.G.size()) {
            ix ixVar = (ix) this.G.get(i7);
            if (this.a != null) {
                ixVar.c = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.I.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        break;
                    }
                    View childAt = this.I.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        gjVar = q1Var.getMessageObject();
                        imageReceiver = q1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        gjVar = t0Var.getMessageObject();
                        imageReceiver = t0Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        gjVar = null;
                    }
                    if (gjVar == null || gjVar.e1() != ixVar.p) {
                        i10++;
                    } else {
                        ixVar.c = true;
                        float x10 = childAt.getX() + this.I.getX();
                        float y10 = childAt.getY() + this.I.getY();
                        f12 = childAt.getY();
                        f10 = 3.0f;
                        float f13 = imageReceiver.N0;
                        ixVar.d = f13;
                        f11 = 2.0f;
                        ixVar.e = imageReceiver.O0;
                        if (ixVar.i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            float f14 = (f() * org.telegram.messenger.g0.p) / 1.3f;
                            float f15 = f14 / 3.0f;
                            ixVar.d = f15;
                            ixVar.e = f15;
                            float f16 = f14 / 2.0f;
                            ixVar.a = Utilities.i((q1Var2.getTimeX() + x10) - f16, org.telegram.messenger.g0.q.x - f14, 0.0f);
                            ixVar.b = (q1Var2.getTimeY() + y10) - f16;
                        } else if (ixVar.h) {
                            ixVar.a = x10 + imageReceiver.L0;
                            ixVar.b = y10 + imageReceiver.M0;
                        } else {
                            float f17 = x10 + imageReceiver.L0;
                            float f18 = y10 + imageReceiver.M0;
                            float L = ixVar.m ? ((-f13) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f17 : (-org.telegram.messenger.g0.L(24.0f)) + f17;
                            float f19 = f18 - imageReceiver.N0;
                            ixVar.a = L;
                            ixVar.b = f19;
                        }
                    }
                }
                if (!ixVar.c || ixVar.e + f12 < this.a.O9 || f12 > this.I.getMeasuredHeight() - this.a.Xa) {
                    ixVar.n = true;
                }
                if (ixVar.h) {
                    float f20 = ixVar.e / f11;
                    boolean z10 = ((float) this.I.getMeasuredHeight()) - f12 <= f20;
                    boolean z11 = (f12 - this.a.O9) + f20 <= 0.0f;
                    if (z10 || z11) {
                        ixVar.n = true;
                    }
                }
                if (ixVar.n) {
                    float f21 = ixVar.o;
                    if (f21 != 1.0f) {
                        float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                        ixVar.o = i11;
                        ixVar.r.setAlpha(1.0f - i11);
                        this.a.m1.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                f11 = 2.0f;
                g(ixVar);
            }
            boolean z12 = !ixVar.l && ixVar.n;
            if (!z12) {
                if (!ixVar.h || ixVar.i) {
                    ch.d dVar = ixVar.j;
                    if (dVar != null) {
                        float f22 = ixVar.a + ixVar.f;
                        float f23 = ixVar.b + ixVar.g;
                        float f24 = ixVar.d * f10;
                        dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                        ixVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = ixVar.r;
                        float f25 = ixVar.a + ixVar.f;
                        float f26 = ixVar.b + ixVar.g;
                        float f27 = ixVar.d * f10;
                        imageReceiver2.y0(f25, f26, f27, f27);
                        if (ixVar.m) {
                            ixVar.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ixVar.r.r(), ixVar.r.s());
                            ixVar.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f28 = ixVar.e;
                    float f29 = 1.49926f * f28;
                    float f30 = 0.0546875f * f29;
                    float f31 = (((f28 / f11) + ixVar.b) - (f29 / f11)) - (0.00279f * f29);
                    if (ixVar.m) {
                        ixVar.r.y0(((ixVar.a + ixVar.d) - f29) + f30, f31, f29, f29);
                    } else {
                        ixVar.r.y0(ixVar.a - f30, f31, f29, f29);
                    }
                    if (ixVar.m) {
                        ixVar.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, ixVar.r.r(), ixVar.r.s());
                        ixVar.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            ch.d dVar2 = ixVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : ixVar.l && ixVar.r.B() != null && ixVar.r.B().b0 >= ixVar.r.B().e[0] + (-2);
            if (ixVar.o == 1.0f || c10 || z12) {
                ix ixVar2 = (ix) this.G.remove(i7);
                if (ixVar.h && ixVar.r.B() != null) {
                    ixVar2.r.B().N(0, true, true);
                }
                ixVar2.r.R();
                ch.d dVar3 = ixVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.H);
                }
                i7--;
            } else if (ixVar.r.B() != null && ixVar.r.B().l0) {
                ixVar.l = true;
            } else if (ixVar.r.B() != null && !ixVar.r.B().l0) {
                ixVar.r.B().N(0, true, false);
                ixVar.r.B().start();
            }
            i7++;
        }
        if (this.G.isEmpty()) {
            h();
        }
        this.H.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        org.telegram.messenger.ns.f(this.b).c(this, org.telegram.messenger.ns.y0);
        org.telegram.messenger.ns.f(this.b).c(this, org.telegram.messenger.ns.T4);
        org.telegram.messenger.ns.f(this.b).c(this, org.telegram.messenger.ns.r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((ix) arrayList.get(i7)).r.P();
            if (((ix) arrayList.get(i7)).j != null) {
                ((ix) arrayList.get(i7)).j.f(this.H);
            }
            i7++;
        }
    }

    public final void j() {
        int i7 = 0;
        this.n = false;
        org.telegram.messenger.ns.f(this.b).n(this, org.telegram.messenger.ns.y0);
        org.telegram.messenger.ns.f(this.b).n(this, org.telegram.messenger.ns.T4);
        org.telegram.messenger.ns.f(this.b).n(this, org.telegram.messenger.ns.r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ix) arrayList.get(i7)).r.R();
            if (((ix) arrayList.get(i7)).j != null) {
                ((ix) arrayList.get(i7)).j.d(this.H);
            }
            i7++;
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, an anVar, boolean z10) {
        if (anVar.z() || q1Var.getMessageObject() == null || q1Var.getMessageObject().e1() < 0) {
            return;
        }
        if (q1Var.getMessageObject().W3() || anVar.f != null) {
            boolean z11 = false;
            boolean n10 = n(q1Var, -1, z10, false);
            if (z10 && n10) {
                String V1 = q1Var.getMessageObject().V1();
                if (!org.telegram.messenger.k6.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                    try {
                        q1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (q1Var.getMessageObject().W3() || q1Var.getEffect() != null || (!z10 && q1Var.getMessageObject().o != null)) {
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().k.premiumEffectWasPlayed = true;
                anVar.getMessagesStorage().X1(this.J, q1Var.getMessageObject().k);
                return;
            }
            Integer E1 = org.telegram.messenger.np.s1(this.b).E1(this.J, this.K);
            if ((E1 == null || E1.intValue() != 5) && this.F == null && n10) {
                org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
                if ((xbVar == null || !xbVar.l) && org.telegram.messenger.gz.d1 > 0 && org.telegram.messenger.m10.i(this.b).e() != anVar.f.id) {
                    org.telegram.messenger.gz.d1--;
                    org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.gz.d1).apply();
                    org.telegram.ui.Components.ev0 ev0Var = new org.telegram.ui.Components.ev0(anVar.getParentActivity(), null, 1, -1, q1Var.getMessageObject().F2() ? q1Var.getMessageObject().F0() : org.telegram.messenger.si.b0(this.b).T(q1Var.getMessageObject().V1()), anVar.getResourceProvider());
                    ev0Var.c.setVisibility(8);
                    ev0Var.b.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EmojiInteractionTapHint", null, 2131751177, anVar.f.first_name)), ev0Var.b.getPaint().getFontMetricsInt(), false, null, 0));
                    ev0Var.b.setTypeface(null);
                    ev0Var.b.setMaxLines(3);
                    ev0Var.b.setSingleLine(false);
                    m9.u uVar = new m9.u(this, org.telegram.ui.Components.xb.g(anVar, ev0Var, 2750), z11, 29);
                    this.F = uVar;
                    org.telegram.messenger.g0.i3(uVar, 1500L);
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.L;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.L == null) {
                this.L = new HashMap();
            }
            this.L.put(Long.valueOf(document.id), Boolean.TRUE);
            org.telegram.messenger.si.b0(this.b).l1(org.telegram.messenger.gc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject.W3()) {
            return;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        String p10 = p(V1);
        if (!M.contains(p10) || (arrayList = (ArrayList) this.e.get(p10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i7 = 0; i7 < min; i7++) {
            l((TLRPC.Document) arrayList.get(i7));
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10, boolean z11) {
        if (q1Var == null || this.G.size() > 12) {
            return false;
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (q1Var.getEffect() == null && !q1Var.getPhotoImage().L()) {
            return false;
        }
        String V1 = messageObject.V1();
        if (V1 == null) {
            V1 = messageObject.k.message;
        }
        if (q1Var.getEffect() == null && V1 == null) {
            return false;
        }
        float f10 = q1Var.getPhotoImage().O0;
        float f11 = q1Var.getPhotoImage().N0;
        if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
            return d(p(V1), q1Var.getMessageObject().e1(), q1Var.getMessageObject().F0(), messageObject, i7, z10, z11, f11, f10, q1Var.getMessageObject().P3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.gj gjVar) {
        an anVar = this.a;
        if (anVar == null || org.telegram.messenger.np.s1(this.b).D3() || anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.ev0 ev0Var = new org.telegram.ui.Components.ev0(this.H.getContext(), null, 1, -1, gjVar.F0(), anVar.getResourceProvider());
        ev0Var.b.setText(tL_messages_stickerSet.set.title);
        ev0Var.c.setText(org.telegram.messenger.hd.M0(2131746948, null));
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(anVar.getParentActivity(), anVar.getResourceProvider(), true);
        ev0Var.setButton(vbVar);
        vbVar.b = new org.telegram.ui.Components.voip.u(15, this, gjVar);
        vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
        org.telegram.ui.Components.xb g10 = org.telegram.ui.Components.xb.g(anVar, ev0Var, 2750);
        g10.b = gjVar.e1();
        g10.j();
    }

    public jx(an anVar, FrameLayout frameLayout, org.telegram.ui.Components.uj0 uj0Var, int i7, long j3, long j10) {
        this.a = anVar;
        this.H = frameLayout;
        this.I = uj0Var;
        this.b = i7;
        this.J = j3;
        this.K = j10;
    }

    public void g(ix ixVar) {
    }

    public void h() {
    }
}
