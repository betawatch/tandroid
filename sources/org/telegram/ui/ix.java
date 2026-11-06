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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class ix implements org.telegram.messenger.ls {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public bh D;
    public fx E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.pj0 H;
    public final long I;
    public final long J;
    public HashMap K;
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
    public final ArrayList F = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        M = hashSet;
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

    public ix(int i7, FrameLayout frameLayout) {
        this.G = frameLayout;
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
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(this.b).p0("EmojiAnimations");
        this.c = p02;
        if (p02 == null) {
            this.c = org.telegram.messenger.ui.b0(this.b).n0("EmojiAnimations");
        }
        if (this.c == null) {
            org.telegram.messenger.ui.b0(this.b).c1("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i7 = 0; i7 < this.c.documents.size(); i7++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i7).id), this.c.documents.get(i7));
            }
            for (int i10 = 0; i10 < this.c.packs.size(); i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i10);
                if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = L;
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
            ArrayList arrayList = this.F;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((hx) arrayList.get(i7)).r.R();
            if (((hx) arrayList.get(i7)).j != null) {
                ((hx) arrayList.get(i7)).j.d(this.G);
            }
            i7++;
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.ij ijVar, int i10, boolean z9, boolean z10, float f10, float f11, boolean z11) {
        Random random;
        long j3;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize G1;
        boolean z12;
        bh bhVar;
        int i11 = i10;
        boolean z13 = ijVar != null && ijVar.X3();
        boolean z14 = (ijVar == null || ijVar.M0() == null) ? false : true;
        if (z14 || z13 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i12 >= arrayList2.size()) {
                        if (z9 && z13 && i13 > 0) {
                            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
                            if (ccVar != null && ccVar.b == ijVar.f1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet k12 = org.telegram.messenger.ij.k1(ijVar.k);
                            TLRPC.TL_messages_stickerSet p02 = k12.short_name != null ? org.telegram.messenger.ui.b0(this.b).p0(k12.short_name) : null;
                            if (p02 == null) {
                                p02 = org.telegram.messenger.ui.b0(this.b).o0(k12.id);
                            }
                            if (p02 != null) {
                                o(p02, ijVar);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k12;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new ld(24, this, ijVar));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect M0 = ijVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(this.b).E0();
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
                                G1 = org.telegram.messenger.ij.G1(document2);
                                z13 = G1 != null;
                            }
                            G1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z13) {
                                document2 = ijVar.F0();
                                G1 = org.telegram.messenger.ij.G1(ijVar.F0());
                            } else {
                                if (ijVar == null || !ijVar.G2()) {
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
                                                HashMap hashMap = this.K;
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
                                G1 = null;
                            }
                        }
                        if (document2 == null && G1 == null) {
                            return false;
                        }
                        hx hxVar = new hx();
                        hxVar.h = z13;
                        hxVar.i = z14;
                        if (!z14) {
                            hxVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            hxVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        hxVar.p = i7;
                        hxVar.q = document2;
                        hxVar.m = z11;
                        ImageReceiver imageReceiver = hxVar.r;
                        imageReceiver.t0 = true;
                        imageReceiver.s0 = z9;
                        if (org.telegram.messenger.iz.o() > 1) {
                            boolean z15 = org.telegram.messenger.r2.a;
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f;
                        boolean z16 = z13;
                        if (G1 == null) {
                            int f12 = f();
                            boolean z17 = z12;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue);
                            sb2.append("_");
                            imageReceiver.v1 = a8.p0.n(hxVar.p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z17 ? "_pcache" : "");
                            hxVar.r.q0(b10, sb3.toString(), null, "tgs", this.c, 1);
                            imageReceiver.g1 = new gx(this, hxVar, z9, ijVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z18 = z12;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.v1 = a8.p0.n(hxVar.p, "_", sb4);
                            }
                            hxVar.q = document2;
                            org.telegram.messenger.hc d = org.telegram.messenger.hc.d(G1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            sb5.append(z18 ? "_pcache" : "");
                            hxVar.r.q0(d, sb5.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (hxVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(hxVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.G;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z9 && !z16 && org.telegram.messenger.p10.i(this.b).n != this.I) {
                            int i18 = this.r;
                            if (i18 != 0 && i18 != i7 && (bhVar = this.D) != null) {
                                org.telegram.messenger.g0.r(bhVar);
                                this.D.run();
                            }
                            this.r = i7;
                            this.w = str;
                            long j12 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j12 == j3) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            bh bhVar2 = this.D;
                            if (bhVar2 != null) {
                                org.telegram.messenger.g0.r(bhVar2);
                                this.D = null;
                            }
                            bh bhVar3 = new bh(this, 27);
                            this.D = bhVar3;
                            org.telegram.messenger.g0.i3(bhVar3, 500L);
                        }
                        if (!z10) {
                            return true;
                        }
                        org.telegram.messenger.qp.s1(this.b).C4(11, 0, this.I, this.J, str);
                        return true;
                    }
                    if (((hx) arrayList2.get(i12)).p == i7) {
                        i13++;
                        if (!z14 && (((hx) arrayList2.get(i12)).r.B() == null || ((hx) arrayList2.get(i12)).r.B().y())) {
                            return false;
                        }
                    }
                    if (((hx) arrayList2.get(i12)).q != null && document != null) {
                        if (((hx) arrayList2.get(i12)).q.id == document.id) {
                            i14++;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Integer E1;
        if (i7 == org.telegram.messenger.qs.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.qs.T4;
        long j3 = this.I;
        if (i7 != i11) {
            if (i7 == org.telegram.messenger.qs.r && (E1 = org.telegram.messenger.qp.s1(this.b).E1(j3, this.J)) != null && E1.intValue() == 5) {
                fx fxVar = this.E;
                if (fxVar != null) {
                    org.telegram.messenger.g0.r(fxVar);
                }
                this.E = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i12 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.gb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
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
        org.telegram.messenger.ij ijVar;
        if (this.F.isEmpty()) {
            return;
        }
        int i7 = 0;
        while (i7 < this.F.size()) {
            hx hxVar = (hx) this.F.get(i7);
            if (this.a != null) {
                hxVar.c = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.H.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        break;
                    }
                    View childAt = this.H.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        ijVar = q1Var.getMessageObject();
                        imageReceiver = q1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        ijVar = t0Var.getMessageObject();
                        imageReceiver = t0Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        ijVar = null;
                    }
                    if (ijVar == null || ijVar.f1() != hxVar.p) {
                        i10++;
                    } else {
                        hxVar.c = true;
                        float x10 = childAt.getX() + this.H.getX();
                        float y10 = childAt.getY() + this.H.getY();
                        f12 = childAt.getY();
                        f10 = 3.0f;
                        float f13 = imageReceiver.M0;
                        hxVar.d = f13;
                        f11 = 2.0f;
                        hxVar.e = imageReceiver.N0;
                        if (hxVar.i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            float f14 = (f() * org.telegram.messenger.g0.p) / 1.3f;
                            float f15 = f14 / 3.0f;
                            hxVar.d = f15;
                            hxVar.e = f15;
                            float f16 = f14 / 2.0f;
                            hxVar.a = Utilities.i((q1Var2.getTimeX() + x10) - f16, org.telegram.messenger.g0.q.x - f14, 0.0f);
                            hxVar.b = (q1Var2.getTimeY() + y10) - f16;
                        } else if (hxVar.h) {
                            hxVar.a = x10 + imageReceiver.K0;
                            hxVar.b = y10 + imageReceiver.L0;
                        } else {
                            float f17 = x10 + imageReceiver.K0;
                            float f18 = y10 + imageReceiver.L0;
                            float L2 = hxVar.m ? ((-f13) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f17 : (-org.telegram.messenger.g0.L(24.0f)) + f17;
                            float f19 = f18 - imageReceiver.M0;
                            hxVar.a = L2;
                            hxVar.b = f19;
                        }
                    }
                }
                if (!hxVar.c || hxVar.e + f12 < this.a.L9 || f12 > this.H.getMeasuredHeight() - this.a.Ua) {
                    hxVar.n = true;
                }
                if (hxVar.h) {
                    float f20 = hxVar.e / f11;
                    boolean z9 = ((float) this.H.getMeasuredHeight()) - f12 <= f20;
                    boolean z10 = (f12 - this.a.L9) + f20 <= 0.0f;
                    if (z9 || z10) {
                        hxVar.n = true;
                    }
                }
                if (hxVar.n) {
                    float f21 = hxVar.o;
                    if (f21 != 1.0f) {
                        float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                        hxVar.o = i11;
                        hxVar.r.setAlpha(1.0f - i11);
                        this.a.l1.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                f11 = 2.0f;
                g(hxVar);
            }
            boolean z11 = !hxVar.l && hxVar.n;
            if (!z11) {
                if (!hxVar.h || hxVar.i) {
                    ch.d dVar = hxVar.j;
                    if (dVar != null) {
                        float f22 = hxVar.a + hxVar.f;
                        float f23 = hxVar.b + hxVar.g;
                        float f24 = hxVar.d * f10;
                        dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                        hxVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = hxVar.r;
                        float f25 = hxVar.a + hxVar.f;
                        float f26 = hxVar.b + hxVar.g;
                        float f27 = hxVar.d * f10;
                        imageReceiver2.y0(f25, f26, f27, f27);
                        if (hxVar.m) {
                            hxVar.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, hxVar.r.r(), hxVar.r.s());
                            hxVar.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f28 = hxVar.e;
                    float f29 = 1.49926f * f28;
                    float f30 = 0.0546875f * f29;
                    float f31 = (((f28 / f11) + hxVar.b) - (f29 / f11)) - (0.00279f * f29);
                    if (hxVar.m) {
                        hxVar.r.y0(((hxVar.a + hxVar.d) - f29) + f30, f31, f29, f29);
                    } else {
                        hxVar.r.y0(hxVar.a - f30, f31, f29, f29);
                    }
                    if (hxVar.m) {
                        hxVar.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, hxVar.r.r(), hxVar.r.s());
                        hxVar.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            ch.d dVar2 = hxVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : hxVar.l && hxVar.r.B() != null && hxVar.r.B().a0 >= hxVar.r.B().e[0] + (-2);
            if (hxVar.o == 1.0f || c10 || z11) {
                hx hxVar2 = (hx) this.F.remove(i7);
                if (hxVar.h && hxVar.r.B() != null) {
                    hxVar2.r.B().N(0, true, true);
                }
                hxVar2.r.R();
                ch.d dVar3 = hxVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.G);
                }
                i7--;
            } else if (hxVar.r.B() != null && hxVar.r.B().k0) {
                hxVar.l = true;
            } else if (hxVar.r.B() != null && !hxVar.r.B().k0) {
                hxVar.r.B().N(0, true, false);
                hxVar.r.B().start();
            }
            i7++;
        }
        if (this.F.isEmpty()) {
            h();
        }
        this.G.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        org.telegram.messenger.qs.f(this.b).c(this, org.telegram.messenger.qs.y0);
        org.telegram.messenger.qs.f(this.b).c(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.b).c(this, org.telegram.messenger.qs.r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((hx) arrayList.get(i7)).r.P();
            if (((hx) arrayList.get(i7)).j != null) {
                ((hx) arrayList.get(i7)).j.f(this.G);
            }
            i7++;
        }
    }

    public final void j() {
        int i7 = 0;
        this.n = false;
        org.telegram.messenger.qs.f(this.b).n(this, org.telegram.messenger.qs.y0);
        org.telegram.messenger.qs.f(this.b).n(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.b).n(this, org.telegram.messenger.qs.r);
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((hx) arrayList.get(i7)).r.R();
            if (((hx) arrayList.get(i7)).j != null) {
                ((hx) arrayList.get(i7)).j.d(this.G);
            }
            i7++;
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, an anVar, boolean z9) {
        if (anVar.z() || q1Var.getMessageObject() == null || q1Var.getMessageObject().f1() < 0) {
            return;
        }
        if (q1Var.getMessageObject().X3() || anVar.f != null) {
            boolean n10 = n(q1Var, -1, z9, false);
            if (z9 && n10) {
                String W1 = q1Var.getMessageObject().W1();
                if (!org.telegram.messenger.j6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                    try {
                        q1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (q1Var.getMessageObject().X3() || q1Var.getEffect() != null || (!z9 && q1Var.getMessageObject().o != null)) {
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().k.premiumEffectWasPlayed = true;
                anVar.getMessagesStorage().X1(this.I, q1Var.getMessageObject().k);
                return;
            }
            Integer E1 = org.telegram.messenger.qp.s1(this.b).E1(this.I, this.J);
            if ((E1 == null || E1.intValue() != 5) && this.E == null && n10) {
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
                if ((ccVar == null || !ccVar.l) && org.telegram.messenger.iz.d1 > 0 && org.telegram.messenger.p10.i(this.b).e() != anVar.f.id) {
                    org.telegram.messenger.iz.d1--;
                    org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.iz.d1).apply();
                    org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(anVar.getParentActivity(), null, 1, -1, q1Var.getMessageObject().G2() ? q1Var.getMessageObject().F0() : org.telegram.messenger.ui.b0(this.b).T(q1Var.getMessageObject().W1()), anVar.getResourceProvider());
                    cv0Var.c.setVisibility(8);
                    cv0Var.b.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EmojiInteractionTapHint", null, 2131751178, anVar.f.first_name)), cv0Var.b.getPaint().getFontMetricsInt(), false, null, 0));
                    cv0Var.b.setTypeface(null);
                    cv0Var.b.setMaxLines(3);
                    cv0Var.b.setSingleLine(false);
                    fx fxVar = new fx(0, this, org.telegram.ui.Components.cc.g(anVar, cv0Var, 2750));
                    this.E = fxVar;
                    org.telegram.messenger.g0.i3(fxVar, 1500L);
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.K;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.id), Boolean.TRUE);
            org.telegram.messenger.ui.b0(this.b).l1(org.telegram.messenger.hc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (messageObject.X3()) {
            return;
        }
        String W1 = messageObject.W1();
        if (W1 == null) {
            W1 = messageObject.k.message;
        }
        String p10 = p(W1);
        if (!L.contains(p10) || (arrayList = (ArrayList) this.e.get(p10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i7 = 0; i7 < min; i7++) {
            l((TLRPC.Document) arrayList.get(i7));
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9, boolean z10) {
        if (q1Var == null || this.F.size() > 12) {
            return false;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (q1Var.getEffect() == null && !q1Var.getPhotoImage().L()) {
            return false;
        }
        String W1 = messageObject.W1();
        if (W1 == null) {
            W1 = messageObject.k.message;
        }
        if (q1Var.getEffect() == null && W1 == null) {
            return false;
        }
        float f10 = q1Var.getPhotoImage().N0;
        float f11 = q1Var.getPhotoImage().M0;
        if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
            return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i7, z9, z10, f11, f10, q1Var.getMessageObject().Q3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.ij ijVar) {
        an anVar = this.a;
        if (anVar == null || org.telegram.messenger.qp.s1(this.b).D3() || anVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(this.G.getContext(), null, 1, -1, ijVar.F0(), anVar.getResourceProvider());
        cv0Var.b.setText(tL_messages_stickerSet.set.title);
        cv0Var.c.setText(org.telegram.messenger.hd.M0(2131746947, null));
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(anVar.getParentActivity(), anVar.getResourceProvider(), true);
        cv0Var.setButton(acVar);
        acVar.b = new org.telegram.ui.Components.g51(19, this, ijVar);
        acVar.e(org.telegram.messenger.hd.M0(2131743564, null));
        org.telegram.ui.Components.cc g10 = org.telegram.ui.Components.cc.g(anVar, cv0Var, 2750);
        g10.b = ijVar.f1();
        g10.j();
    }

    public ix(an anVar, FrameLayout frameLayout, org.telegram.ui.Components.pj0 pj0Var, int i7, long j3, long j10) {
        this.a = anVar;
        this.G = frameLayout;
        this.H = pj0Var;
        this.b = i7;
        this.I = j3;
        this.J = j10;
    }

    public void g(hx hxVar) {
    }

    public void h() {
    }
}
