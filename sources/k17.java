// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k17 extends q59 implements jm7 {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public vh6 E;
    public String E0;
    public g17 F;
    public int F0;
    public String G;
    public fr6 G0;
    public i17 H;
    public yv1 H0;
    public i17 I;
    public final ylb I0;
    public ArrayList J;
    public ArrayList K;
    public final e7a K0;
    public ArrayList L;
    public Object[] L0;
    public String M;
    public ArrayList N;
    public ArrayList O;
    public String[] P;
    public ArrayList Q;
    public ArrayList R;
    public ArrayList S;
    public long T;
    public TLRPC.TL_inlineBotSwitchPM U;
    public TLRPC.TL_inlineBotWebView V;
    public final p17 W;
    public vh6 X;
    public int Y;
    public int Z;
    public String a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public ArrayList e0;
    public final Context h;
    public int h0;
    public int j0;
    public int k0;
    public boolean l0;
    public TLRPC.Chat m0;
    public long n;
    public w04 o0;
    public boolean p0;
    public fp6 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final bu9 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public d17 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = z8c.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final c17 J0 = new c17(this, new b17(this));
    public boolean M0 = false;
    public int N0 = -1;

    public k17(Context context, long j, long j2, p17 p17Var, ylb ylbVar, boolean z) {
        this.I0 = ylbVar;
        this.h = context;
        this.W = p17Var;
        this.n = j;
        this.s = z;
        this.r = j2;
        bu9 bu9Var = new bu9(true);
        this.x = bu9Var;
        bu9Var.a = new lj4(this);
        e7a e7aVar = (e7a) new ov0(nm7.f(this.f), this).b;
        e7aVar.b(nm7.X0);
        e7aVar.b(nm7.x0);
        this.K0 = e7aVar;
        e7aVar.b(nm7.Y1);
        e7aVar.b(nm7.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return (this.x0 == null || this.i0) && this.B0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (z8c.h(this.f).p() || !k47.W3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new j17(str, document));
                this.C0.put(str2, document);
                w04 w04Var = this.o0;
                if (w04Var != null) {
                    w04Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        Object obj = str;
        while (i < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.C0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (z8c.h(this.f).p() || !k47.W3(document))) {
                int size2 = document.attributes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i2++;
                }
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new j17(obj, document));
                this.C0.put(str2, document);
            }
            i++;
            obj = obj;
        }
    }

    public final void G() {
        yv1 yv1Var = this.H0;
        if (yv1Var == null || yv1Var.getParentActivity() == null) {
            return;
        }
        if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.J0.m();
    }

    public final void H() {
        if (this.B0 == null) {
            return;
        }
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int min = Math.min(6, this.B0.size());
        for (int i = 0; i < min; i++) {
            j17 j17Var = (j17) this.B0.get(i);
            TLRPC.PhotoSize w = bc4.w(j17Var.a.thumbs, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
                bc4.G(this.f);
                if (!bc4.J(w, "webp", true, true).exists()) {
                    arrayList.add(bc4.r("webp", w));
                    bc4.G(this.f).V(gn5.c(w, j17Var.a), j17Var.b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.x0;
        if (user == null || user.id == this.T) {
            return this.U;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if (r6.K != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i) {
        String str;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i >= 2) {
                i -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.V;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i >= 0 && i < arrayList2.size()) {
                        return this.S.get(i);
                    }
                } else if (i == 0) {
                    return tL_inlineBotWebView;
                }
                i--;
                if (i >= 0) {
                    return this.S.get(i);
                }
            } else {
                ArrayList arrayList3 = this.y;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.N;
                            if (arrayList6 != null) {
                                if (i >= 0 && i < arrayList6.size()) {
                                    return this.N.get(i);
                                }
                                ArrayList arrayList7 = this.N;
                                if (arrayList7 != null) {
                                    i -= arrayList7.size();
                                }
                            }
                            ArrayList arrayList8 = this.K;
                            if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                                ArrayList arrayList9 = this.Q;
                                if (arrayList9 == null || (this.h0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                    str = (String) this.K.get(i);
                                } else if (arrayList9.get(i) != null) {
                                    user = (TLRPC.User) this.Q.get(i);
                                    str = String.format("%s@%s", this.K.get(i), user != null ? m9c.p(user) : "");
                                } else {
                                    str = String.format("%s", this.K.get(i));
                                }
                                ArrayList arrayList10 = this.R;
                                if (arrayList10 == null || !((Boolean) arrayList10.get(i)).booleanValue()) {
                                    return str;
                                }
                                return new h17(str, user != null ? user.id : 0L);
                            }
                        } else if (i >= 0 && i < arrayList5.size()) {
                            return this.O.get(i);
                        }
                    } else if (i >= 0 && i < arrayList4.size()) {
                        return this.J.get(i);
                    }
                } else if (i >= 0 && i < arrayList3.size()) {
                    return this.y.get(i);
                }
            }
        } else if (i >= 0 && i < arrayList.size()) {
            return ((j17) this.B0.get(i)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i = 1;
        if (this.x0 != null && !this.i0) {
            return 1;
        }
        int i2 = this.G != null ? 2 : 0;
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.U == null && this.V == null) {
                    i = 0;
                }
                return size2 + i + i2;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else {
                    if (this.K != null || this.N != null) {
                        ArrayList arrayList5 = this.N;
                        int size3 = arrayList5 == null ? 0 : arrayList5.size();
                        ArrayList arrayList6 = this.K;
                        return size3 + (arrayList6 != null ? arrayList6.size() : 0) + i2;
                    }
                    ArrayList arrayList7 = this.O;
                    if (arrayList7 == null) {
                        return i2;
                    }
                    size = arrayList7.size();
                }
            }
        }
        return size + i2;
    }

    public final Object L(int i) {
        if (this.G != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return ((j17) this.B0.get(i)).b;
    }

    public final int M(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 0;
            }
            i -= 2;
        }
        return this.S != null ? (this.U == null && this.V == null) ? i : i - 1 : i;
    }

    public final boolean N() {
        return this.B0 != null;
    }

    public final void P() {
        c17 c17Var = this.J0;
        if (c17Var != null) {
            c17Var.n();
        }
        d17 d17Var = this.z0;
        if (d17Var != null) {
            gm.r(d17Var);
            this.z0 = null;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        this.x0 = null;
        this.U = null;
        this.i0 = true;
        this.r0 = null;
        this.s0 = null;
        this.w0 = false;
        this.K0.a();
    }

    public final void Q() {
        TLRPC.User user = this.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.A0 = location;
        location.setLatitude(-1000.0d);
        this.A0.setLongitude(-1000.0d);
        T(true, this.x0, this.s0, "");
    }

    public final void R(TLRPC.User user) {
        k17 k17Var;
        yv1 yv1Var;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.n();
        p17 p17Var = this.W;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            k17Var = this;
            k17Var.x0 = null;
            k17Var.U = null;
            k17Var.i0 = true;
        } else {
            this.x0 = user;
            long j = user.id;
            if (j != this.T) {
                this.U = null;
                this.T = j;
            }
            yv1 yv1Var2 = this.H0;
            if (yv1Var2 != null && (chat = yv1Var2.e) != null) {
                boolean t = sd2.t(chat);
                this.i0 = t;
                if (!t) {
                    f();
                    p17Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                if (oc7.r1(this.f).W3.getBoolean("inlinegeo_" + this.x0.id, false) || (yv1Var = this.H0) == null || yv1Var.getParentActivity() == null) {
                    k17Var = this;
                    k17Var.G();
                } else {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = jb6.M0(2131745157, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745158, null);
                    boolean[] zArr = new boolean[1];
                    k17Var = this;
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new wu2(k17Var, zArr, user2, false, (byte) 19));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new cz6((Object) k17Var, (Object) zArr, (byte) 4));
                    k17Var.H0.showDialog(heVar, new dg(k17Var, zArr, (byte) 11));
                }
            } else {
                k17Var = this;
            }
        }
        if (k17Var.x0 == null) {
            k17Var.w0 = true;
            k17Var.U = null;
        } else {
            if (p17Var != null) {
                p17Var.b(true);
            }
            k17Var.T(true, k17Var.x0, k17Var.s0, "");
        }
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            p17 p17Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                } else {
                    p17Var.a(false);
                }
            }
            d17 d17Var = this.z0;
            if (d17Var != null) {
                gm.r(d17Var);
                this.z0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.r0) != null && !str3.equals(str))) {
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.x0 = null;
                this.U = null;
                this.i0 = true;
                this.r0 = null;
                this.s0 = null;
                this.J0.n();
                this.w0 = false;
                if (p17Var != null) {
                    p17Var.b(false);
                }
                if (str == null || str.length() == 0) {
                    return;
                }
            }
            if (str2 == null) {
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.s0 = null;
                if (p17Var != null) {
                    p17Var.b(false);
                    return;
                }
                return;
            }
            if (p17Var != null) {
                if (this.x0 != null) {
                    p17Var.b(true);
                } else if (str.equals("gif")) {
                    this.r0 = "gif";
                    p17Var.b(false);
                }
            }
            oc7 r1 = oc7.r1(this.f);
            cf7 Y = cf7.Y(this.f);
            this.s0 = str2;
            d17 d17Var2 = new d17(this, str2, str, r1, Y);
            this.z0 = d17Var2;
            gm.d3(d17Var2, 400L);
        }
    }

    public final void T(boolean z, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        if (!this.i0 || !this.d) {
            p17 p17Var = this.W;
            if (p17Var != null) {
                p17Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.s0 = null;
            return;
        }
        if (user.bot_inline_geo && this.A0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        sb.append("_");
        sb.append(str);
        wi8.z("_", str2, "_", sb);
        sb.append(this.n);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.A0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude()));
        String sb2 = sb.toString();
        cf7 Y = cf7.Y(this.f);
        a17 a17Var = new a17(this, str, z, user, str2, Y, sb2);
        long j = user.id;
        if (j != this.T) {
            this.U = null;
            this.T = j;
        }
        if (z) {
            Y.L(sb2, a17Var);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = oc7.r1(this.f).p1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = gm.b0(this.A0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = gm.b0(this.A0.getLongitude());
        }
        if (pg3.B(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = oc7.r1(this.f).i1(this.n);
        }
        this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, a17Var, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x06f5, code lost:
    
        if (r17.toLowerCase().startsWith(r3) == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0708, code lost:
    
        if (r14.toLowerCase().startsWith(r3) != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0718, code lost:
    
        if (r15.toLowerCase().startsWith(r3) != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06aa, code lost:
    
        if (r13.user_id == r11.id) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x03d4, code lost:
    
        if (r6 != ':') goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x03ec, code lost:
    
        if (r28.w != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x03ee, code lost:
    
        if (r12 == 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x03f0, code lost:
    
        r28.a0 = r7;
        r28.d0 = r3;
        r28.e0 = r4;
        r28.W.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x03fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x03fd, code lost:
    
        r28.Y = r12;
        r28.Z = r13.length() + 1;
        r0 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x04a2, code lost:
    
        r28.Y = r12;
        r28.Z = r13.length() + r11;
        r0 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0731 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04d5  */
    /* JADX WARN: Type inference failed for: r0v59, types: [p17] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v38, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v57, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object, k17, y59] */
    /* JADX WARN: Type inference failed for: r5v16, types: [i17] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.ArrayList, vh6] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        boolean z3;
        String str;
        int i2;
        ArrayList arrayList2;
        String str2;
        yv1 yv1Var;
        char c;
        int i3;
        String str3;
        String str4;
        int i4;
        boolean z4;
        int i5;
        ?? r5;
        i17 i17Var;
        ?? r6;
        ArrayList arrayList3;
        String str5;
        String str6;
        long j;
        TLRPC.Chat L0;
        TLRPC.ChatFull chatFull;
        int i6;
        long j2;
        boolean z5;
        String str7;
        String p;
        String str8;
        TLRPC.Chat chat;
        long j3;
        TLRPC.Chat chat2;
        boolean z6;
        String str9 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.m0;
        yv1 yv1Var2 = this.H0;
        if (yv1Var2 != null) {
            chat3 = yv1Var2.e;
            yv1Var2.h();
        }
        TLRPC.Chat chat4 = chat3;
        fp6 fp6Var = this.q0;
        if (fp6Var != null) {
            gm.r(fp6Var);
            this.q0 = null;
        }
        if (this.k0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.k0, true);
            this.k0 = 0;
        }
        g17 g17Var = this.F;
        if (g17Var != null) {
            gm.r(g17Var);
            this.F = null;
        }
        fr6 fr6Var = this.G0;
        if (fr6Var != null) {
            gm.r(fr6Var);
            this.G0 = null;
        }
        if (TextUtils.isEmpty(charSequence2) || charSequence2.length() > oc7.r1(this.f).s1()) {
            S(null, null);
            this.W.a(false);
            this.a0 = null;
            this.E0 = null;
            this.B0 = null;
            this.C0 = null;
            f();
            this.p0 = false;
            if (this.F0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.F0, true);
                this.F0 = 0;
            }
            w04 w04Var = this.o0;
            if (w04Var != null) {
                w04Var.a();
                return;
            }
            return;
        }
        int i7 = charSequence2.length() > 0 ? i - 1 : i;
        this.a0 = null;
        this.c0 = z;
        this.b0 = z2;
        StringBuilder sb = new StringBuilder();
        boolean z7 = !z && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z7) {
            int length = charSequence2.length();
            z3 = true;
            int i8 = 0;
            CharSequence charSequence3 = charSequence2;
            while (i8 < length) {
                char charAt = charSequence3.charAt(i8);
                int i9 = length - 1;
                char charAt2 = i8 < i9 ? charSequence3.charAt(i8 + 1) : (char) 0;
                if (i8 < i9 && charAt == 55356 && charAt2 >= 57339 && charAt2 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i8), charSequence3.subSequence(i8 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i8), charSequence3.subSequence(i8 + 1, charSequence3.length()));
                    length--;
                } else {
                    i8++;
                }
                i8--;
                i8++;
            }
            this.E0 = charSequence3.toString().trim();
            str = charSequence2;
        } else {
            z3 = true;
            str = "";
        }
        boolean z8 = (z7 && (gw3.h(str) || gw3.h(this.E0))) ? z3 : false;
        if (z8 && (charSequence instanceof Spanned)) {
            gn[] gnVarArr = (gn[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gn.class);
            z8 = (gnVarArr == null || gnVarArr.length == 0) ? z3 : false;
        }
        int i10 = i7;
        if (this.c && z8 && (chat4 == null || sd2.t(chat4))) {
            this.D0.clear();
            int i11 = gda.D;
            if (i11 == 2 || !z8) {
                if (this.p0 && i11 == 2) {
                    this.p0 = false;
                    this.W.a(false);
                    f();
                    return;
                }
                return;
            }
            this.B0 = null;
            this.C0 = null;
            if (this.F0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.F0, z3);
                this.F0 = 0;
            }
            boolean z9 = oc7.r1(this.f).l4.Q0.f;
            if (z9) {
                i2 = i;
                arrayList2 = arrayList;
                z6 = z9;
            } else {
                arrayList2 = arrayList;
                z6 = z9;
                i2 = i;
                this.G0 = new fr6((k17) this, charSequence, i2, arrayList2, z, z2);
                hs6.d0(this.f).X0(false, true, false, 0);
                hs6.d0(this.f).X0(false, true, false, 2);
                ArrayList arrayList4 = hs6.d0(this.f).g0[0];
                ArrayList arrayList5 = hs6.d0(this.f).g0[2];
                int min = Math.min(20, arrayList4.size());
                int i12 = 0;
                for (int i13 = 0; i13 < min; i13++) {
                    TLRPC.Document document = (TLRPC.Document) arrayList4.get(i13);
                    if (O(document, this.E0)) {
                        E(document, "recent");
                        int i14 = i12 + 1;
                        if (i14 >= 5) {
                            break;
                        } else {
                            i12 = i14;
                        }
                    }
                }
                int size = arrayList5.size();
                for (int i15 = 0; i15 < size; i15++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList5.get(i15);
                    if (O(document2, this.E0)) {
                        E(document2, "fav");
                    }
                }
                hs6.d0(this.f).D(0);
                HashMap hashMap = hs6.d0(this.f).e0;
                ArrayList arrayList6 = hashMap != null ? (ArrayList) hashMap.get(this.E0) : null;
                if (arrayList6 != null && !arrayList6.isEmpty()) {
                    F(null, arrayList6);
                }
                ArrayList arrayList7 = this.B0;
                if (arrayList7 != null) {
                    Collections.sort(arrayList7, new e17(arrayList5, arrayList4));
                }
            }
            if (gda.D == 0 || z6) {
                String str10 = this.E0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str;
                tL_messages_getStickers.hash = 0L;
                this.F0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new cx3(this, str10, (byte) 27));
            }
            ArrayList arrayList8 = this.B0;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                if (gda.D != 0 || this.B0.size() >= 5) {
                    H();
                    this.W.a(this.D0.isEmpty());
                    this.p0 = true;
                } else {
                    this.W.a(false);
                    this.p0 = false;
                }
                f();
            } else if (this.p0) {
                this.W.a(false);
                this.p0 = false;
            }
            c = 4;
            str2 = null;
        } else {
            i2 = i;
            arrayList2 = arrayList;
            if (!z && this.g0 && charSequence2.charAt(0) == '@') {
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str4 = charSequence2.substring(indexOf + 1);
                    str3 = substring;
                    i3 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i3 = 1;
                    str3 = charSequence2.substring(1);
                    str4 = "";
                } else {
                    i3 = 1;
                    S(null, null);
                    str3 = null;
                    str4 = null;
                }
                if (str3 != null && str3.length() >= i3) {
                    int i16 = 1;
                    while (true) {
                        if (i16 >= str3.length()) {
                            str9 = str3;
                            break;
                        }
                        char charAt3 = str3.charAt(i16);
                        if ((charAt3 < '0' || charAt3 > '9') && ((charAt3 < 'a' || charAt3 > 'z') && ((charAt3 < 'A' || charAt3 > 'Z') && charAt3 != '_'))) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                S(str9, str4);
                str2 = null;
            } else if (!this.c || (yv1Var = this.H0) == null || yv1Var.h != null || (!(chat4 == null || sd2.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                str2 = null;
                S(null, null);
            } else {
                str2 = null;
                S(null, null);
            }
            c = 65535;
        }
        if (this.x0 == null) {
            oc7 r1 = oc7.r1(this.f);
            String str11 = this.G;
            this.G = str2;
            if (z) {
                sb.append(charSequence2.substring(1));
                this.Y = 0;
                this.Z = sb.length();
                c = 0;
            } else {
                i4 = i10;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    if (i4 < charSequence2.length()) {
                        char charAt4 = charSequence2.charAt(i4);
                        if (i4 != 0) {
                            int i17 = i4 - 1;
                            if (charSequence2.charAt(i17) != ' ') {
                                if (charSequence2.charAt(i17) != '\n') {
                                }
                            }
                        }
                        if (charAt4 == '@') {
                            boolean z10 = this.n0;
                            if (z10 || this.f0 || (this.g0 && i4 == 0)) {
                                break;
                            }
                        } else if (charAt4 == '#') {
                            if (sd2.V(chat4) && !TextUtils.isEmpty(sd2.K(chat4, false))) {
                                String substring2 = charSequence2.substring(i4);
                                this.G = substring2;
                                if (substring2.length() < 4 || !this.G.matches("^[#$][\\p{L}_-]+$")) {
                                    this.G = null;
                                }
                            }
                            bu9 bu9Var = this.x;
                            if (!bu9Var.s) {
                                cf7.Y(bu9Var.m).a.c(new yt9(bu9Var, (byte) 1));
                                this.a0 = charSequence2;
                                this.d0 = i2;
                                this.e0 = arrayList2;
                                return;
                            }
                            this.Y = i4;
                            this.Z = sb.length() + 1;
                            z4 = false;
                            sb.insert(0, charAt4);
                            c = 1;
                        } else if (i4 != 0 || this.X == null || charAt4 != '/') {
                            if (charAt4 == ':' && sb.length() > 0) {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                    i5 = 1;
                                    if (sb.length() > 1) {
                                        break;
                                    }
                                } else {
                                    i5 = 1;
                                    break;
                                }
                            }
                        } else {
                            this.Y = i4;
                            this.Z = sb.length() + 1;
                            c = 2;
                            break;
                        }
                        sb.insert(0, charAt4);
                    }
                    i4--;
                }
            }
            z4 = false;
            i4 = -1;
            ?? r11 = z4;
            String str12 = this.G;
            if (str11 == null) {
                if (str12 != null) {
                    p(r11, 2);
                }
                r5 = this.H;
                if (r5 != 0) {
                    r5.a(r11, str12, chat4);
                }
                i17Var = this.I;
                if (i17Var != null) {
                    i17Var.a(1, this.G, chat4);
                }
            } else {
                if (str12 == null) {
                    q(r11, 2);
                }
                r5 = this.H;
                if (r5 != 0) {
                }
                i17Var = this.I;
                if (i17Var != null) {
                }
            }
            if (c == 65535) {
                this.y0 = r11;
                this.S = null;
                this.W.a(r11);
                return;
            }
            if (c != 0) {
                if (c == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    String lowerCase = sb.toString().toLowerCase();
                    ArrayList arrayList10 = this.x.q;
                    for (int i18 = 0; i18 < arrayList10.size(); i18++) {
                        zt9 zt9Var = (zt9) arrayList10.get(i18);
                        if (zt9Var != null && (str6 = zt9Var.a) != null && str6.startsWith(lowerCase)) {
                            arrayList9.add(zt9Var.a);
                        }
                    }
                    this.J = arrayList9;
                    this.B0 = null;
                    this.y = null;
                    this.E = null;
                    this.N = null;
                    this.K = null;
                    this.R = null;
                    this.L = null;
                    this.Q = null;
                    this.O = null;
                    this.y0 = false;
                    this.S = null;
                    f();
                    this.W.a((this.J.isEmpty() && this.G == null) ? false : true);
                    return;
                }
                if (c != 2) {
                    if (c == 3) {
                        String[] F0 = gm.F0();
                        if (!Arrays.equals(F0, this.P)) {
                            hs6.d0(this.f).O(F0, false);
                        }
                        this.P = F0;
                        hs6.d0(this.f).W(this.P, sb.toString(), false, new z07(this), gda.E && z8c.h(this.f).p());
                        return;
                    }
                    if (c == 4) {
                        this.J = null;
                        this.y = null;
                        this.E = null;
                        this.O = null;
                        this.K = null;
                        this.R = null;
                        this.N = null;
                        this.L = null;
                        this.Q = null;
                        return;
                    }
                    return;
                }
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                String lowerCase2 = sb.toString().toLowerCase();
                for (int i19 = 0; i19 < this.X.m(); i19++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.X.n(i19);
                    for (int i20 = 0; i20 < botInfo.commands.size(); i20++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i20);
                        if (botCommand != null && (str5 = botCommand.command) != null && str5.startsWith(lowerCase2)) {
                            arrayList11.add("/" + botCommand.command);
                            arrayList12.add(botCommand.description);
                            arrayList13.add(r1.W1(Long.valueOf(botInfo.user_id)));
                            arrayList14.add(Boolean.valueOf(botCommand.ephemeral));
                        }
                    }
                }
                if (this.H0 != null && !pg3.B(this.n)) {
                    yv1 yv1Var3 = this.H0;
                    if (yv1Var3.g4 == 0 && yv1Var3.h() != null && !this.H0.h().bot && !m9c.B(this.H0.h()) && !m9c.C(this.H0.h().id)) {
                        pz8 f = pz8.f(this.f);
                        f.h();
                        this.M = lowerCase2;
                        this.N = new ArrayList();
                        for (int i21 = 0; i21 < f.b.size(); i21++) {
                            oz8 oz8Var = (oz8) f.b.get(i21);
                            if (!pz8.g(oz8Var.b)) {
                                String lowerCase3 = oz8Var.b.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase2) || gm.I3(lowerCase3).startsWith(lowerCase2)) {
                                    this.N.add(oz8Var);
                                }
                            }
                        }
                        r6 = 0;
                        this.J = r6;
                        this.B0 = r6;
                        this.y = r6;
                        this.E = r6;
                        this.O = r6;
                        this.K = arrayList11;
                        this.L = arrayList12;
                        this.Q = arrayList13;
                        this.R = arrayList14;
                        this.y0 = false;
                        this.S = r6;
                        f();
                        this.W.a(arrayList11.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
                        return;
                    }
                }
                r6 = 0;
                this.M = null;
                this.N = null;
                this.J = r6;
                this.B0 = r6;
                this.y = r6;
                this.E = r6;
                this.O = r6;
                this.K = arrayList11;
                this.L = arrayList12;
                this.Q = arrayList13;
                this.R = arrayList14;
                this.y0 = false;
                this.S = r6;
                f();
                this.W.a(arrayList11.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
                return;
            }
            this.y0 = r11;
            this.S = null;
            ArrayList arrayList15 = new ArrayList();
            if (arrayList2 != null) {
                for (int i22 = 0; i22 < Math.min(100, arrayList2.size()); i22++) {
                    long Z0 = ((k47) arrayList2.get(i22)).Z0();
                    if (Z0 > 0 && !arrayList15.contains(Long.valueOf(Z0))) {
                        arrayList15.add(Long.valueOf(Z0));
                    }
                }
            }
            String lowerCase4 = sb.toString().toLowerCase();
            boolean z11 = lowerCase4.indexOf(32) >= 0;
            ArrayList arrayList16 = new ArrayList();
            vh6 vh6Var = new vh6();
            vh6 vh6Var2 = new vh6();
            ArrayList arrayList17 = new ArrayList();
            arrayList17.addAll(hs6.d0(this.f).k1);
            if (chat4 == null || (!sd2.p0(chat4) && !sd2.V(chat4))) {
                arrayList17.addAll(hs6.d0(this.f).l1);
            }
            List.-EL.sort(arrayList17, new tk6((byte) 9));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList17.size();
            int i23 = 0;
            while (i23 < size2) {
                Object obj = arrayList17.get(i23);
                i23++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(pg3.n(tL_topPeer.peer)), tL_topPeer);
            }
            ArrayList arrayList18 = new ArrayList(linkedHashMap.values());
            if (!z && this.g0 && i4 == 0 && !arrayList18.isEmpty()) {
                int i24 = 0;
                for (int i25 = 0; i25 < arrayList18.size(); i25++) {
                    TLRPC.User W1 = r1.W1(Long.valueOf(((TLRPC.TL_topPeer) arrayList18.get(i25)).peer.user_id));
                    if (W1 != null) {
                        String p2 = m9c.p(W1);
                        if (!TextUtils.isEmpty(p2) && (lowerCase4.length() == 0 || p2.toLowerCase().startsWith(lowerCase4))) {
                            arrayList16.add(W1);
                            vh6Var.k(W1, W1.id);
                            vh6Var2.k(W1, W1.id);
                            i24++;
                        }
                        if (i24 == 5) {
                            break;
                        }
                    }
                }
            }
            yv1 yv1Var4 = this.H0;
            if (yv1Var4 != null) {
                chat4 = yv1Var4.e;
                j = yv1Var4.s4;
            } else {
                TLRPC.ChatFull chatFull2 = this.w;
                if (chatFull2 != null) {
                    chat4 = r1.L0(Long.valueOf(chatFull2.id));
                }
                j = 0;
            }
            ?? f2 = z8c.h(this.f).f();
            if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!sd2.T(chat4) || chat4.megagroup)) {
                int i26 = -2;
                int i27 = -2;
                while (i27 < this.w.participants.participants.size()) {
                    if (i27 != i26) {
                        i6 = i27;
                        if (i6 == -1) {
                            if (z2) {
                                if (lowerCase4.length() == 0) {
                                    arrayList16.add(chat4);
                                } else {
                                    String str13 = chat4.title;
                                    p = sd2.K(chat4, false);
                                    j2 = j;
                                    chat2 = chat4;
                                    chat = f2;
                                    j3 = -chat4.id;
                                    str7 = str13;
                                    str8 = null;
                                    if (TextUtils.isEmpty(p)) {
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!z5) {
                                    }
                                }
                            }
                            z5 = z11;
                            j2 = j;
                            chat = f2;
                        } else {
                            TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i6);
                            if (f2 != null) {
                                j2 = j;
                            } else {
                                j2 = j;
                            }
                            ?? W12 = r1.W1(Long.valueOf(chatParticipant.user_id));
                            if (W12 != 0 && !m9c.D(W12) && vh6Var.h(W12.id) < 0) {
                                if (lowerCase4.length() != 0 || W12.deleted) {
                                    str7 = W12.first_name;
                                    String str14 = W12.last_name;
                                    p = m9c.p(W12);
                                    str8 = str14;
                                    chat = f2;
                                    j3 = W12.id;
                                    chat2 = W12;
                                    if (TextUtils.isEmpty(p)) {
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!z5) {
                                    }
                                } else {
                                    arrayList16.add(W12);
                                }
                            }
                            z5 = z11;
                            chat = f2;
                        }
                    } else if (f2 == null || !z) {
                        z5 = z11;
                        j2 = j;
                        i6 = i27;
                        chat = f2;
                    } else {
                        str7 = f2.first_name;
                        str8 = f2.last_name;
                        p = m9c.p(f2);
                        j2 = j;
                        TLRPC.Chat chat5 = f2;
                        j3 = f2.id;
                        i6 = i27;
                        chat = chat5;
                        chat2 = chat5;
                        if (TextUtils.isEmpty(p)) {
                            z5 = z11;
                        } else {
                            z5 = z11;
                        }
                        if (!TextUtils.isEmpty(str7)) {
                        }
                        if (!TextUtils.isEmpty(str8)) {
                        }
                        if (!z5) {
                            if (bw2.m(0, str7, str8).toLowerCase().startsWith(lowerCase4)) {
                            }
                            arrayList16.add(chat2);
                            vh6Var2.k(chat2, j3);
                        }
                    }
                    int i28 = i6 + 1;
                    j = j2;
                    f2 = chat;
                    i26 = -2;
                    i27 = i28;
                    z11 = z5;
                }
            }
            boolean z12 = z11;
            long j4 = j;
            if (this.n0) {
                ArrayList arrayList19 = oc7.r1(this.f).y;
                for (int i29 = 0; i29 < arrayList19.size(); i29++) {
                    if (((TLRPC.Dialog) arrayList19.get(i29)).id > 0) {
                        TLRPC.User W13 = r1.W1(Long.valueOf(((TLRPC.Dialog) arrayList19.get(i29)).id));
                        if (W13 != null && !m9c.D(W13) && vh6Var.h(W13.id) < 0) {
                            if (lowerCase4.length() != 0 || W13.deleted) {
                                String str15 = W13.first_name;
                                String str16 = W13.last_name;
                                String p3 = m9c.p(W13);
                                long j5 = W13.id;
                                if ((!TextUtils.isEmpty(p3) && p3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str15) && str15.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || (z12 && bw2.m(0, str15, str16).toLowerCase().startsWith(lowerCase4))))) {
                                    arrayList16.add(W13);
                                    vh6Var2.k(W13, j5);
                                }
                            } else {
                                arrayList16.add(W13);
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase4) && (L0 = r1.L0(Long.valueOf(-((TLRPC.Dialog) arrayList19.get(i29)).id))) != null && L0.username != null && vh6Var.h(L0.id) < 0) {
                        if (lowerCase4.length() == 0) {
                            arrayList16.add(L0);
                        } else {
                            String str17 = L0.title;
                            String str18 = L0.username;
                            long j6 = L0.id;
                            if ((!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4))) {
                                arrayList16.add(L0);
                                vh6Var2.k(L0, j6);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList16, new f17(vh6Var2, arrayList15));
            this.J = null;
            this.B0 = null;
            this.N = null;
            this.K = null;
            this.R = null;
            this.L = null;
            this.Q = null;
            this.O = null;
            if (((chat4 == null || !chat4.megagroup) && !this.n0) || lowerCase4.length() <= 0) {
                W(vh6Var2, arrayList16, true);
                return;
            }
            if (arrayList16.size() < 5) {
                fp6 fp6Var2 = new fp6((Object) this, (Object) arrayList16, (Object) vh6Var2, (byte) 13);
                this.q0 = fp6Var2;
                gm.d3(fp6Var2, 1000L);
            } else {
                W(vh6Var2, arrayList16, true);
            }
            g17 g17Var2 = new g17(this, chat4, lowerCase4, j4, arrayList16, vh6Var2, r1);
            this.F = g17Var2;
            gm.d3(g17Var2, 200L);
        }
    }

    public final void V(TLRPC.ChatFull chatFull) {
        yv1 yv1Var;
        TLRPC.Chat chat;
        this.f = z8c.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (yv1Var = this.H0) != null && (chat = yv1Var.e) != null) {
            boolean t = sd2.t(chat);
            this.i0 = t;
            if (t) {
                this.y = null;
                f();
                this.W.a(false);
                R(this.x0);
            }
        }
        String str = this.a0;
        if (str != null) {
            U(str, this.d0, this.e0, this.c0, this.b0);
        }
    }

    public final void W(vh6 vh6Var, ArrayList arrayList, boolean z) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || m9c.C(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = vh6Var;
        fp6 fp6Var = this.q0;
        if (fp6Var != null) {
            gm.r(fp6Var);
            this.q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z) {
            f();
            this.W.a(!this.y.isEmpty());
        }
    }

    @Override // y59
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override // y59
    public final int d(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.x0 != null && !this.i0) {
            return 3;
        }
        if (this.S == null) {
            ArrayList arrayList = this.N;
            return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
        }
        if (i == 0) {
            return (this.U == null && this.V == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fr6 fr6Var;
        if (i == nm7.Y1 || i == nm7.Z1) {
            ArrayList arrayList = this.B0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.D0;
            if (arrayList2.isEmpty() || !this.p0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.W.a(K() > 0);
                return;
            }
            return;
        }
        if (i == nm7.X0) {
            fr6 fr6Var2 = this.G0;
            if (fr6Var2 != null) {
                gm.c3(fr6Var2);
                this.G0 = null;
                return;
            }
            return;
        }
        if (i == nm7.x0 && ((Integer) objArr[0]).intValue() == 0 && (fr6Var = this.G0) != null) {
            gm.c3(fr6Var);
            this.G0 = null;
        }
    }

    @Override // y59
    public final void f() {
        ds6 ds6Var;
        String str;
        String str2;
        int i = this.N0;
        p17 p17Var = this.W;
        int i2 = 0;
        if (i != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            boolean z = i != K;
            int min = Math.min(i, K);
            Object[] objArr = new Object[K];
            for (int i3 = 0; i3 < K; i3++) {
                objArr[i3] = J(i3);
            }
            while (i2 < min) {
                if (i2 >= 0) {
                    Object[] objArr2 = this.L0;
                    if (i2 < objArr2.length && i2 < K) {
                        Object obj = objArr2[i2];
                        Object obj2 = objArr[i2];
                        if (!(obj instanceof oz8)) {
                            if (obj != obj2 && ((!(obj instanceof j17) || !(obj2 instanceof j17) || ((j17) obj).a != ((j17) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof ds6) && (obj2 instanceof ds6) && (str = (ds6Var = (ds6) obj).b) != null) {
                                    ds6 ds6Var2 = (ds6) obj2;
                                    if (str.equals(ds6Var2.b) && (str2 = ds6Var.a) != null && str2.equals(ds6Var2.a)) {
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                g(i2);
                z = true;
                i2++;
            }
            q(min, i - min);
            p(min, K - min);
            if (z && p17Var != null) {
                p17Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (p17Var != null) {
            this.N0 = K();
            p17Var.c();
        }
        super.f();
        int K2 = K();
        this.N0 = K2;
        this.L0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.L0;
            if (i2 >= objArr3.length) {
                return;
            }
            objArr3[i2] = J(i2);
            i2++;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        yv1 yv1Var;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f;
        String str = this.G;
        int i2 = str != null ? i - 2 : i;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 4) {
            v0b v0bVar = (v0b) view;
            if (i2 < 0 || i2 >= this.B0.size()) {
                return;
            }
            j17 j17Var = (j17) this.B0.get(i2);
            TLRPC.Document document = j17Var.a;
            Object obj = j17Var.b;
            pj8 pj8Var = v0bVar.n;
            bf0 bf0Var = v0bVar.a;
            v0bVar.c = obj;
            boolean W3 = k47.W3(document);
            v0bVar.s = W3;
            if (W3) {
                pj8Var.setColor(cmb.w0(null, cmb.c6, false));
                pj8Var.I = true;
                pj8Var.J = false;
                pj8Var.invalidate();
            }
            TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
            meb f2 = eq3.f(document, cmb.Z6, 1.0f, v0bVar.w);
            if (!k47.p(document)) {
                f = 1.0f;
                if (f2 == null) {
                    bf0Var.n(gn5.c(w, document), null, "webp", null, v0bVar.c);
                } else if (w != null) {
                    bf0Var.n(gn5.c(w, document), null, "webp", f2, v0bVar.c);
                } else {
                    bf0Var.n(gn5.b(document), null, "webp", f2, v0bVar.c);
                }
            } else if (f2 != null) {
                bf0Var.n(gn5.b(document), "80_80", null, f2, v0bVar.c);
                f = 1.0f;
            } else if (w != null) {
                f = 1.0f;
                bf0Var.h(gn5.b(document), "80_80", gn5.c(w, document), null, 0, v0bVar.c);
            } else {
                f = 1.0f;
                bf0Var.n(gn5.b(document), "80_80", null, null, v0bVar.c);
            }
            v0bVar.b = document;
            Drawable background = v0bVar.getBackground();
            if (background != null) {
                background.setAlpha(230);
                anb.x(v0bVar, background, cmb.sf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (v0bVar.s) {
                v0bVar.r = true;
            } else {
                v0bVar.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pj8Var.getLayoutParams();
            if (z8c.h(z8c.t0).p()) {
                int L = gm.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = gm.L(8.0f);
                layoutParams.rightMargin = gm.L(8.0f);
                pj8Var.setPadding(gm.L(f), gm.L(f), gm.L(f), gm.L(f));
            } else {
                int L2 = gm.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            }
            pj8Var.setLocked(!z8c.h(z8c.t0).p());
            gm.T3(pj8Var, v0bVar.r, 0.9f, true, false);
            v0bVar.invalidate();
            v0bVar.setClearsInputField(true);
            return;
        }
        if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!sd2.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(jb6.M0(2131749318, null));
                    return;
                } else if (gm.B1(chat.banned_rights)) {
                    textView.setText(jb6.M0(2131753932, null));
                    return;
                } else {
                    textView.setText(jb6.a0("AttachInlineRestricted", null, 2131753933, jb6.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i3 == 5) {
            kz8 kz8Var = (kz8) view;
            ArrayList arrayList = this.N;
            if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            kz8Var.a((oz8) this.N.get(i2), this.M, false);
            return;
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
            boolean z = (tL_inlineBotSwitchPM == null && this.V == null) ? false : true;
            if (i3 == 2) {
                if (z) {
                    ((pu0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.V.text);
                    return;
                }
                return;
            } else {
                if (z) {
                    i2--;
                }
                if (i2 < 0 || i2 >= arrayList2.size()) {
                    return;
                }
                ((lx2) view).e((TLRPC.BotInlineResult) this.S.get(i2), this.x0, this.y0, i2 != this.S.size() - 1, z && i2 == 0, "gif".equals(this.r0));
                return;
            }
        }
        if (i3 == 6) {
            i17 i17Var = (i17) view;
            int i4 = i2 + 2;
            if (i4 == 0) {
                this.H = i17Var;
            } else {
                this.I = i17Var;
            }
            TLRPC.Chat chat2 = this.m0;
            if (chat2 == null && (yv1Var = this.H0) != null) {
                chat2 = yv1Var.e;
            }
            i17Var.a(i4, str, chat2);
            return;
        }
        if (i3 == 7) {
            return;
        }
        y07 y07Var = (y07) view;
        ArrayList arrayList3 = this.y;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i2);
            if (tLObject instanceof TLRPC.User) {
                y07Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                y07Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.J;
            if (arrayList4 == null || i2 < 0 || i2 >= arrayList4.size()) {
                ArrayList arrayList5 = this.O;
                if (arrayList5 == null || i2 < 0 || i2 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.K;
                    if (arrayList6 != null && i2 >= 0 && i2 < arrayList6.size()) {
                        ArrayList arrayList7 = this.L;
                        String str2 = (arrayList7 == null || i2 < 0 || i2 >= arrayList7.size()) ? null : (String) this.L.get(i2);
                        ArrayList arrayList8 = this.Q;
                        TLRPC.User user = (arrayList8 == null || i2 < 0 || i2 >= arrayList8.size()) ? null : (TLRPC.User) this.Q.get(i2);
                        ArrayList arrayList9 = this.R;
                        boolean booleanValue = ((arrayList9 == null || i2 < 0 || i2 >= arrayList9.size()) ? null : (Boolean) this.R.get(i2)).booleanValue();
                        String str3 = (String) this.K.get(i2);
                        wb wbVar = y07Var.b;
                        TextView textView2 = y07Var.c;
                        pc0 pc0Var = y07Var.d;
                        y07Var.a();
                        bf0 bf0Var2 = y07Var.a;
                        if (user != null) {
                            bf0Var2.setVisibility(0);
                            pc0Var.q(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                bf0Var2.setImageDrawable(pc0Var);
                            } else {
                                bf0Var2.f(user, pc0Var);
                            }
                        } else {
                            bf0Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            pn2 pn2Var = new pn2(R.drawable.mini_ephemeral_hidden_14, 0);
                            pn2Var.a(cmb.z6);
                            pn2Var.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            wbVar.setText(spannableStringBuilder);
                        } else {
                            wbVar.setText(str3);
                        }
                        textView2.setText(gw3.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    y07Var.setEmojiSuggestion((ds6) this.O.get(i2));
                }
            } else {
                y07Var.setText((String) this.J.get(i2));
            }
        }
        y07Var.setDivider(false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        ylb ylbVar = this.I0;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    pu0 pu0Var = new pu0(context);
                    TextView textView = new TextView(context);
                    pu0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    anb.X(textView, cmb.tf, null);
                    textView.setTypeface(gm.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(jb6.a0 ? 5 : 3);
                    pu0Var.addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = pu0Var;
                } else if (i == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    anb.X(textView2, cmb.y6, ylbVar);
                    view = textView2;
                } else if (i != 5) {
                    boolean z = this.s;
                    if (i == 6) {
                        view2 = new i17(ylbVar, context, z);
                    } else if (i != 7) {
                        v0b v0bVar = new v0b(context);
                        v0bVar.w = ylbVar;
                        bf0 bf0Var = new bf0(context);
                        v0bVar.a = bf0Var;
                        bf0Var.setAspectFit(true);
                        bf0Var.setLayerNum(1);
                        v0bVar.addView(bf0Var, qoe.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        v0bVar.setFocusable(true);
                        pj8 pj8Var = new pj8(1, null, context);
                        v0bVar.n = pj8Var;
                        pj8Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
                        pj8Var.setImageReceiver(bf0Var.getImageReceiver());
                        v0bVar.addView(pj8Var, qoe.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view = v0bVar;
                    } else {
                        View o72Var = new o72(context, (byte) 13);
                        ColorDrawable colorDrawable = new ColorDrawable(z ? cmb.p1(0.15f, -1) : cmb.v0(cmb.Z6, ylbVar));
                        if (!z) {
                            anb.x(o72Var, colorDrawable, cmb.Z6, ylbVar, PorterDuff.Mode.SRC_IN);
                        }
                        sn2 sn2Var = new sn2(colorDrawable, cmb.V0(context, R.drawable.greydivider, cmb.v0(cmb.a7, ylbVar)), 0, 0);
                        sn2Var.x = true;
                        o72Var.setBackground(sn2Var);
                        view = o72Var;
                    }
                } else {
                    view = new kz8(ylbVar, context, false);
                }
            } else {
                lx2 lx2Var = new lx2(context);
                lx2Var.setDelegate(new z07(this));
                view2 = lx2Var;
            }
            view = view2;
        } else {
            y07 y07Var = new y07(context, ylbVar);
            y07Var.setIsDarkTheme(false);
            view = y07Var;
        }
        return new b59(view);
    }
}
