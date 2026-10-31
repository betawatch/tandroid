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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ly implements org.telegram.messenger.us {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public rh D;
    public j9.u E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.tk0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final un a;
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

    public ly(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f7, int i10) {
        float s10 = q1Var.getPhotoImage().s() + q1Var.getY();
        return s10 > f7 && s10 < ((float) i10);
    }

    public static int f() {
        float min;
        float f7;
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
            f7 = 0.4f;
        } else {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        return (int) ((((int) (min * f7)) * 2.0f) / org.telegram.messenger.i0.p);
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
        int i10 = 0;
        String str2 = str;
        while (i10 < length) {
            if (i10 < length - 1) {
                if (str2.charAt(i10) == 55356) {
                    int i11 = i10 + 1;
                    if (str2.charAt(i11) >= 57339) {
                    }
                }
                if (str2.charAt(i10) == 8205) {
                    int i12 = i10 + 1;
                    if (str2.charAt(i12) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 2, str2.length()));
                    i10--;
                    i10++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i10) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 1, str2.length()));
                i10--;
                i10++;
                str2 = str2;
            } else {
                i10++;
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
            for (int i10 = 0; i10 < this.c.documents.size(); i10++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i10).id), this.c.documents.get(i10));
            }
            for (int i11 = 0; i11 < this.c.packs.size(); i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i11);
                if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = L;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i13 = 0; i13 < 8; i13++) {
                            String str3 = strArr[i13];
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ky) arrayList.get(i10)).r.R();
            if (((ky) arrayList.get(i10)).j != null) {
                ((ky) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, org.telegram.messenger.jj jjVar, int i11, boolean z10, boolean z11, float f7, float f10, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize G1;
        boolean z13;
        rh rhVar;
        int i12 = i11;
        boolean z14 = jjVar != null && jjVar.W3();
        boolean z15 = (jjVar == null || jjVar.M0() == null) ? false : true;
        if (z15 || z14 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 >= arrayList2.size()) {
                        if (z10 && z14 && i14 > 0) {
                            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
                            if (wbVar != null && wbVar.b == jjVar.f1()) {
                                return false;
                            }
                            TLRPC.InputStickerSet k12 = org.telegram.messenger.jj.k1(jjVar.k);
                            TLRPC.TL_messages_stickerSet p02 = k12.short_name != null ? org.telegram.messenger.ui.b0(this.b).p0(k12.short_name) : null;
                            if (p02 == null) {
                                p02 = org.telegram.messenger.ui.b0(this.b).o0(k12.id);
                            }
                            if (p02 != null) {
                                o(p02, jjVar);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k12;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.t20(8, this, jjVar));
                            return false;
                        }
                        if (i14 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect M0 = jjVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.vp.r1(this.b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = M0.effect_animation_id;
                            if (j11 == 0) {
                                j11 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= E0.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = E0.documents.get(i16);
                                long j12 = j11;
                                if (document2 != null && document2.id == j12) {
                                    break;
                                }
                                i16++;
                                j11 = j12;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                G1 = org.telegram.messenger.jj.G1(document2);
                                z14 = G1 != null;
                            }
                            G1 = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z14) {
                                document2 = jjVar.F0();
                                G1 = org.telegram.messenger.jj.G1(jjVar.F0());
                            } else {
                                if (jjVar == null || !jjVar.F2()) {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i12;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i12 = abs;
                                }
                                G1 = null;
                            }
                        }
                        if (document2 == null && G1 == null) {
                            return false;
                        }
                        ky kyVar = new ky();
                        kyVar.h = z14;
                        kyVar.i = z15;
                        if (!z15) {
                            kyVar.f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            kyVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        kyVar.p = i10;
                        kyVar.q = document2;
                        kyVar.m = z12;
                        ImageReceiver imageReceiver = kyVar.r;
                        imageReceiver.t0 = true;
                        imageReceiver.s0 = z10;
                        if (org.telegram.messenger.tz.o() > 1) {
                            boolean z16 = org.telegram.messenger.v2.a;
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        int i18 = i12;
                        HashMap hashMap2 = this.f;
                        boolean z17 = z14;
                        if (G1 == null) {
                            int f11 = f();
                            boolean z18 = z13;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue);
                            sb2.append("_");
                            imageReceiver.v1 = a1.g.p(sb2, kyVar.p, "_");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f11);
                            sb3.append("_");
                            sb3.append(f11);
                            sb3.append(z18 ? "_pcache" : "");
                            kyVar.r.q0(b10, sb3.toString(), null, "tgs", this.c, 1);
                            imageReceiver.g1 = new jy(this, kyVar, z10, jjVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z13;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.v1 = a1.g.p(sb4, kyVar.p, "_");
                            }
                            kyVar.q = document2;
                            org.telegram.messenger.ic d = org.telegram.messenger.ic.d(G1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f12);
                            sb5.append("_");
                            sb5.append(f12);
                            sb5.append(z19 ? "_pcache" : "");
                            kyVar.r.q0(d, sb5.toString(), null, "tgs", this.c, 1);
                        }
                        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (kyVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(kyVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.G;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.d20.i(this.b).n != this.I) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (rhVar = this.D) != null) {
                                org.telegram.messenger.i0.r(rhVar);
                                this.D.run();
                            }
                            this.r = i10;
                            this.w = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.y;
                            ArrayList arrayList5 = this.x;
                            if (j13 == j10) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            rh rhVar2 = this.D;
                            if (rhVar2 != null) {
                                org.telegram.messenger.i0.r(rhVar2);
                                this.D = null;
                            }
                            rh rhVar3 = new rh(this, 28);
                            this.D = rhVar3;
                            org.telegram.messenger.i0.h3(rhVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        org.telegram.messenger.vp.r1(this.b).z4(11, 0, this.I, this.J, str);
                        return true;
                    }
                    if (((ky) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z15 && (((ky) arrayList2.get(i13)).r.B() == null || ((ky) arrayList2.get(i13)).r.B().y())) {
                            return false;
                        }
                    }
                    if (((ky) arrayList2.get(i13)).q != null && document != null) {
                        if (((ky) arrayList2.get(i13)).q.id == document.id) {
                            i15++;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer D1;
        if (i10 == org.telegram.messenger.zs.y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = org.telegram.messenger.zs.T4;
        long j10 = this.I;
        if (i10 != i12) {
            if (i10 == org.telegram.messenger.zs.r && (D1 = org.telegram.messenger.vp.r1(this.b).D1(j10, this.J)) != null && D1.intValue() == 5) {
                j9.u uVar = this.E;
                if (uVar != null) {
                    org.telegram.messenger.i0.r(uVar);
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
        if (longValue == j10 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.zb0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        ImageReceiver imageReceiver;
        org.telegram.messenger.jj jjVar;
        if (this.F.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.F.size()) {
            ky kyVar = (ky) this.F.get(i10);
            if (this.a != null) {
                kyVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.H.getChildCount()) {
                        f7 = 3.0f;
                        f10 = 2.0f;
                        f11 = 0.0f;
                        break;
                    }
                    View childAt = this.H.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        jjVar = q1Var.getMessageObject();
                        imageReceiver = q1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        jjVar = s0Var.getMessageObject();
                        imageReceiver = s0Var.getPhotoImage();
                    } else {
                        imageReceiver = null;
                        jjVar = null;
                    }
                    if (jjVar == null || jjVar.f1() != kyVar.p) {
                        i11++;
                    } else {
                        kyVar.c = true;
                        float x10 = childAt.getX() + this.H.getX();
                        float y3 = childAt.getY() + this.H.getY();
                        f11 = childAt.getY();
                        f7 = 3.0f;
                        float f12 = imageReceiver.M0;
                        kyVar.d = f12;
                        f10 = 2.0f;
                        kyVar.e = imageReceiver.N0;
                        if (kyVar.i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            float f13 = (f() * org.telegram.messenger.i0.p) / 1.3f;
                            float f14 = f13 / 3.0f;
                            kyVar.d = f14;
                            kyVar.e = f14;
                            float f15 = f13 / 2.0f;
                            kyVar.a = Utilities.i((q1Var2.getTimeX() + x10) - f15, org.telegram.messenger.i0.q.x - f13, 0.0f);
                            kyVar.b = (q1Var2.getTimeY() + y3) - f15;
                        } else if (kyVar.h) {
                            kyVar.a = x10 + imageReceiver.K0;
                            kyVar.b = y3 + imageReceiver.L0;
                        } else {
                            float f16 = x10 + imageReceiver.K0;
                            float f17 = y3 + imageReceiver.L0;
                            float L2 = kyVar.m ? ((-f12) * 2.0f) + org.telegram.messenger.i0.L(24.0f) + f16 : (-org.telegram.messenger.i0.L(24.0f)) + f16;
                            float f18 = f17 - imageReceiver.M0;
                            kyVar.a = L2;
                            kyVar.b = f18;
                        }
                    }
                }
                if (!kyVar.c || kyVar.e + f11 < this.a.L9 || f11 > this.H.getMeasuredHeight() - this.a.Ua) {
                    kyVar.n = true;
                }
                if (kyVar.h) {
                    float f19 = kyVar.e / f10;
                    boolean z10 = ((float) this.H.getMeasuredHeight()) - f11 <= f19;
                    boolean z11 = (f11 - this.a.L9) + f19 <= 0.0f;
                    if (z10 || z11) {
                        kyVar.n = true;
                    }
                }
                if (kyVar.n) {
                    float f20 = kyVar.o;
                    if (f20 != 1.0f) {
                        float i12 = Utilities.i(f20 + 0.10666667f, 1.0f, 0.0f);
                        kyVar.o = i12;
                        kyVar.r.setAlpha(1.0f - i12);
                        this.a.l1.invalidate();
                    }
                }
            } else {
                f7 = 3.0f;
                f10 = 2.0f;
                g(kyVar);
            }
            boolean z12 = !kyVar.l && kyVar.n;
            if (!z12) {
                if (!kyVar.h || kyVar.i) {
                    sg.d dVar = kyVar.j;
                    if (dVar != null) {
                        float f21 = kyVar.a + kyVar.f;
                        float f22 = kyVar.b + kyVar.g;
                        float f23 = kyVar.d * f7;
                        dVar.e((int) f21, (int) f22, (int) (f21 + f23), (int) (f22 + f23));
                        kyVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = kyVar.r;
                        float f24 = kyVar.a + kyVar.f;
                        float f25 = kyVar.b + kyVar.g;
                        float f26 = kyVar.d * f7;
                        imageReceiver2.y0(f24, f25, f26, f26);
                        if (kyVar.m) {
                            kyVar.r.h(canvas, null);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, kyVar.r.r(), kyVar.r.s());
                            kyVar.r.h(canvas, null);
                            canvas.restore();
                        }
                    }
                } else {
                    float f27 = kyVar.e;
                    float f28 = 1.49926f * f27;
                    float f29 = 0.0546875f * f28;
                    float f30 = (((f27 / f10) + kyVar.b) - (f28 / f10)) - (0.00279f * f28);
                    if (kyVar.m) {
                        kyVar.r.y0(((kyVar.a + kyVar.d) - f28) + f29, f30, f28, f28);
                    } else {
                        kyVar.r.y0(kyVar.a - f29, f30, f28, f28);
                    }
                    if (kyVar.m) {
                        kyVar.r.h(canvas, null);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, kyVar.r.r(), kyVar.r.s());
                        kyVar.r.h(canvas, null);
                        canvas.restore();
                    }
                }
            }
            sg.d dVar2 = kyVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : kyVar.l && kyVar.r.B() != null && kyVar.r.B().a0 >= kyVar.r.B().e[0] + (-2);
            if (kyVar.o == 1.0f || c10 || z12) {
                ky kyVar2 = (ky) this.F.remove(i10);
                if (kyVar.h && kyVar.r.B() != null) {
                    kyVar2.r.B().N(0, true, true);
                }
                kyVar2.r.R();
                sg.d dVar3 = kyVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.G);
                }
                i10--;
            } else if (kyVar.r.B() != null && kyVar.r.B().k0) {
                kyVar.l = true;
            } else if (kyVar.r.B() != null && !kyVar.r.B().k0) {
                kyVar.r.B().N(0, true, false);
                kyVar.r.B().start();
            }
            i10++;
        }
        if (this.F.isEmpty()) {
            h();
        }
        this.G.invalidate();
    }

    public final void i() {
        this.n = true;
        b();
        org.telegram.messenger.zs.f(this.b).c(this, org.telegram.messenger.zs.y0);
        org.telegram.messenger.zs.f(this.b).c(this, org.telegram.messenger.zs.T4);
        org.telegram.messenger.zs.f(this.b).c(this, org.telegram.messenger.zs.r);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ky) arrayList.get(i10)).r.P();
            if (((ky) arrayList.get(i10)).j != null) {
                ((ky) arrayList.get(i10)).j.f(this.G);
            }
            i10++;
        }
    }

    public final void j() {
        int i10 = 0;
        this.n = false;
        org.telegram.messenger.zs.f(this.b).n(this, org.telegram.messenger.zs.y0);
        org.telegram.messenger.zs.f(this.b).n(this, org.telegram.messenger.zs.T4);
        org.telegram.messenger.zs.f(this.b).n(this, org.telegram.messenger.zs.r);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ky) arrayList.get(i10)).r.R();
            if (((ky) arrayList.get(i10)).j != null) {
                ((ky) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, un unVar, boolean z10) {
        if (unVar.z() || q1Var.getMessageObject() == null || q1Var.getMessageObject().f1() < 0) {
            return;
        }
        if (q1Var.getMessageObject().W3() || unVar.f != null) {
            boolean z11 = false;
            boolean n10 = n(q1Var, -1, z10, false);
            if (z10 && n10) {
                String W1 = q1Var.getMessageObject().W1();
                if (!org.telegram.messenger.l6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                    try {
                        q1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            if (q1Var.getMessageObject().W3() || q1Var.getEffect() != null || (!z10 && q1Var.getMessageObject().o != null)) {
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().k.premiumEffectWasPlayed = true;
                unVar.getMessagesStorage().X1(this.I, q1Var.getMessageObject().k);
                return;
            }
            Integer D1 = org.telegram.messenger.vp.r1(this.b).D1(this.I, this.J);
            if ((D1 == null || D1.intValue() != 5) && this.E == null && n10) {
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
                if ((wbVar == null || !wbVar.l) && org.telegram.messenger.tz.d1 > 0 && org.telegram.messenger.d20.i(this.b).e() != unVar.f.id) {
                    org.telegram.messenger.tz.d1--;
                    org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.tz.d1).apply();
                    org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(unVar.getParentActivity(), null, 1, -1, q1Var.getMessageObject().F2() ? q1Var.getMessageObject().F0() : org.telegram.messenger.ui.b0(this.b).T(q1Var.getMessageObject().W1()), unVar.getResourceProvider());
                    fw0Var.c.setVisibility(8);
                    fw0Var.b.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("EmojiInteractionTapHint", null, 2131751178, unVar.f.first_name)), fw0Var.b.getPaint().getFontMetricsInt(), false, null, 0));
                    fw0Var.b.setTypeface(null);
                    fw0Var.b.setMaxLines(3);
                    fw0Var.b.setSingleLine(false);
                    j9.u uVar = new j9.u(this, org.telegram.ui.Components.wb.g(unVar, fw0Var, 2750), z11, 27);
                    this.E = uVar;
                    org.telegram.messenger.i0.h3(uVar, 1500L);
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
            org.telegram.messenger.ui.b0(this.b).l1(org.telegram.messenger.ic.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (messageObject.W3()) {
            return;
        }
        String W1 = messageObject.W1();
        if (W1 == null) {
            W1 = messageObject.k.message;
        }
        String p5 = p(W1);
        if (!L.contains(p5) || (arrayList = (ArrayList) this.e.get(p5)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            l((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i10, boolean z10, boolean z11) {
        if (q1Var == null || this.F.size() > 12) {
            return false;
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
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
        float f7 = q1Var.getPhotoImage().N0;
        float f10 = q1Var.getPhotoImage().M0;
        if (q1Var.getEffect() != null || (f7 > 0.0f && f10 > 0.0f)) {
            return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i10, z10, z11, f10, f7, q1Var.getMessageObject().P3());
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.jj jjVar) {
        un unVar = this.a;
        if (unVar == null || org.telegram.messenger.vp.r1(this.b).A3() || unVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(this.G.getContext(), null, 1, -1, jjVar.F0(), unVar.getResourceProvider());
        fw0Var.b.setText(tL_messages_stickerSet.set.title);
        fw0Var.c.setText(org.telegram.messenger.cd.L0(2131746963, null));
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar.getParentActivity(), unVar.getResourceProvider(), true);
        fw0Var.setButton(ubVar);
        ubVar.b = new xs(12, this, jjVar);
        ubVar.e(org.telegram.messenger.cd.L0(2131743589, null));
        org.telegram.ui.Components.wb g10 = org.telegram.ui.Components.wb.g(unVar, fw0Var, 2750);
        g10.b = jjVar.f1();
        g10.j();
    }

    public ly(un unVar, FrameLayout frameLayout, org.telegram.ui.Components.tk0 tk0Var, int i10, long j10, long j11) {
        this.a = unVar;
        this.G = frameLayout;
        this.H = tk0Var;
        this.b = i10;
        this.I = j10;
        this.J = j11;
    }

    public void g(ky kyVar) {
    }

    public void h() {
    }
}
