package jg;

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
import c8.ma;
import di.a8;
import di.xb;
import hi.t5;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.y5;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h1 extends dk0 implements gs {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public a0.h E;
    public String E0;
    public c1 F;
    public int F0;
    public String G;
    public t0 G0;
    public f1 H;
    public bn H0;
    public f1 I;
    public final h6 I0;
    public ArrayList J;
    public ArrayList K;
    public final xi.e K0;
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
    public final q90 W;
    public a0.h X;
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
    public d1 o0;
    public boolean p0;
    public a8 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final z1 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public z0 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = k10.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final y0 J0 = new y0(this, new x0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public h1(Context context, long j3, long j10, q90 q90Var, h6 h6Var, boolean z10) {
        this.I0 = h6Var;
        this.h = context;
        this.W = q90Var;
        this.n = j3;
        this.s = z10;
        this.r = j10;
        z1 z1Var = new z1(true);
        this.x = z1Var;
        z1Var.a = new t5(this, 6);
        xi.e eVar = (xi.e) new ks(ls.f(this.f), this).b;
        eVar.c(ls.X0);
        eVar.c(ls.x0);
        this.K0 = eVar;
        eVar.c(ls.Y1);
        eVar.c(ls.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i7++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return (this.x0 == null || this.i0) && this.B0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (k10.i(this.f).q() || !gj.X3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new g1(str, document));
                this.C0.put(str2, document);
                d1 d1Var = this.o0;
                if (d1Var != null) {
                    d1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        Object obj = str;
        while (i7 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.C0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (k10.i(this.f).q() || !gj.X3(document))) {
                int size2 = document.attributes.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i10++;
                }
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new g1(obj, document));
                this.C0.put(str2, document);
            }
            i7++;
            obj = obj;
        }
    }

    public final void G() {
        bn bnVar = this.H0;
        if (bnVar == null || bnVar.getParentActivity() == null) {
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
        this.J0.o();
    }

    public final void H() {
        if (this.B0 == null) {
            return;
        }
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int min = Math.min(6, this.B0.size());
        for (int i7 = 0; i7 < min; i7++) {
            g1 g1Var = (g1) this.B0.get(i7);
            TLRPC.PhotoSize w10 = w7.w(g1Var.a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f).V(gc.c(w10, g1Var.a), g1Var.b, "webp", 1, 1);
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

    public final Object J(int i7) {
        String str;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i7 >= 2) {
                i7 -= 2;
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
                        if (i7 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i7 >= 0 && i7 < arrayList2.size()) {
                        return this.S.get(i7);
                    }
                } else if (i7 == 0) {
                    return tL_inlineBotWebView;
                }
                i7--;
                if (i7 >= 0) {
                    return this.S.get(i7);
                }
            } else {
                ArrayList arrayList3 = this.y;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.N;
                            if (arrayList6 != null || this.K != null) {
                                if (arrayList6 != null) {
                                    if (i7 >= 0 && i7 < arrayList6.size()) {
                                        return this.N.get(i7);
                                    }
                                    ArrayList arrayList7 = this.N;
                                    if (arrayList7 != null) {
                                        i7 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.K;
                                if (arrayList8 != null && i7 >= 0 && i7 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.Q;
                                    if (arrayList9 == null || (this.h0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.K.get(i7);
                                    } else if (arrayList9.get(i7) != null) {
                                        user = (TLRPC.User) this.Q.get(i7);
                                        str = String.format("%s@%s", this.K.get(i7), user != null ? p10.o(user) : "");
                                    } else {
                                        str = String.format("%s", this.K.get(i7));
                                    }
                                    ArrayList arrayList10 = this.R;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i7)).booleanValue()) {
                                        return str;
                                    }
                                    return new e1(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i7 >= 0 && i7 < arrayList5.size()) {
                            return this.O.get(i7);
                        }
                    } else if (i7 >= 0 && i7 < arrayList4.size()) {
                        return this.J.get(i7);
                    }
                } else if (i7 >= 0 && i7 < arrayList3.size()) {
                    return this.y.get(i7);
                }
            }
        } else if (i7 >= 0 && i7 < arrayList.size()) {
            return ((g1) this.B0.get(i7)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i7 = 1;
        if (this.x0 != null && !this.i0) {
            return 1;
        }
        int i10 = this.G != null ? 2 : 0;
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.U == null && this.V == null) {
                    i7 = 0;
                }
                return size2 + i7 + i10;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.K == null && this.N == null) {
                    ArrayList arrayList5 = this.O;
                    if (arrayList5 == null) {
                        return i10;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.N;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.K;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i10;
    }

    public final Object L(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return null;
            }
            i7 -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return null;
        }
        return ((g1) this.B0.get(i7)).b;
    }

    public final int M(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return 0;
            }
            i7 -= 2;
        }
        return this.S != null ? (this.U == null && this.V == null) ? i7 : i7 - 1 : i7;
    }

    public final boolean N() {
        return this.B0 != null;
    }

    public final void P() {
        y0 y0Var = this.J0;
        if (y0Var != null) {
            y0Var.p();
        }
        z0 z0Var = this.z0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
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
        this.K0.b();
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
        bn bnVar;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.p();
        q90 q90Var = this.W;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.x0 = null;
            this.U = null;
            this.i0 = true;
        } else {
            this.x0 = user;
            long j3 = user.id;
            if (j3 != this.T) {
                this.U = null;
                this.T = j3;
            }
            bn bnVar2 = this.H0;
            if (bnVar2 != null && (chat = bnVar2.e) != null) {
                boolean t6 = v3.t(chat);
                this.i0 = t6;
                if (!t6) {
                    f();
                    q90Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                if (np.u1(this.f).g7.getBoolean("inlinegeo_" + this.x0.id, false) || (bnVar = this.H0) == null || bnVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String N0 = hd.N0(2131745227, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = hd.N0(2131745228, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(hd.N0(2131747637, null), new a3.h(this, zArr, user2, 12));
                    alertDialog$Builder.h(hd.N0(2131752577, null), new ab.g(19, this, zArr));
                    this.H0.showDialog(t1Var, new di.u1(this, zArr, 3));
                }
            }
        }
        if (this.x0 == null) {
            this.w0 = true;
            this.U = null;
        } else {
            if (q90Var != null) {
                q90Var.b(true);
            }
            T(true, this.x0, this.s0, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0087, code lost:
    
        if (r8.length() != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            q90 q90Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                } else {
                    q90Var.a(false);
                }
            }
            z0 z0Var = this.z0;
            if (z0Var != null) {
                org.telegram.messenger.g0.r(z0Var);
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
                this.J0.p();
                this.w0 = false;
                if (q90Var != null) {
                    q90Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (q90Var != null) {
                    if (this.x0 != null) {
                        q90Var.b(true);
                    } else if (str.equals("gif")) {
                        this.r0 = "gif";
                        q90Var.b(false);
                    }
                }
                np u12 = np.u1(this.f);
                ur a02 = ur.a0(this.f);
                this.s0 = str2;
                z0 z0Var2 = new z0(this, str2, str, u12, a02);
                this.z0 = z0Var2;
                org.telegram.messenger.g0.h3(z0Var2, 400L);
                return;
            }
            if (this.v0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                this.v0 = 0;
            }
            this.s0 = null;
            if (q90Var != null) {
                q90Var.b(false);
            }
        }
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Location location;
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        if (!this.i0 || !this.d) {
            q90 q90Var = this.W;
            if (q90Var != null) {
                q90Var.b(false);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(user.id);
        sb2.append("_");
        sb2.append((!user.bot_inline_geo || this.A0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude()));
        final String sb3 = sb2.toString();
        final ur a02 = ur.a0(this.f);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: jg.v0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new w0(h1.this, str, z10, tLObject, user, str2, a02, sb3));
            }
        };
        long j3 = user.id;
        if (j3 != this.T) {
            this.U = null;
            this.T = j3;
        }
        if (z10) {
            a02.M(sb3, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = np.u1(this.f).s1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
        }
        if (n5.C(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = np.u1(this.f).l1(this.n);
        }
        this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x071b, code lost:
    
        if (r17.toLowerCase().startsWith(r0) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x072e, code lost:
    
        if (r14.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x073e, code lost:
    
        if (r15.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06cf, code lost:
    
        if (r13.user_id == r11.id) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03ec, code lost:
    
        if (r10 != ':') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0408, code lost:
    
        if (r27.w != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x040a, code lost:
    
        if (r13 == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x040c, code lost:
    
        r27.a0 = r7;
        r27.d0 = r3;
        r27.e0 = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0416, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04bb, code lost:
    
        r27.Y = r13;
        r27.Z = r14.length() + r15;
        r15 = 3;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0467, code lost:
    
        r13 = -1;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071e  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v39, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v57, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.q90] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, jg.h1, v4.i0] */
    /* JADX WARN: Type inference failed for: r3v24, types: [jg.f1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        boolean z12;
        String str2;
        int i10;
        ArrayList arrayList2;
        char c10;
        String str3;
        bn bnVar;
        char c11;
        int i11;
        String str4;
        String str5;
        boolean z13;
        char c12;
        int i12;
        ?? r11;
        boolean z14;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j3;
        TLRPC.Chat O0;
        TLRPC.ChatFull chatFull;
        int i13;
        long j10;
        String str8;
        String o4;
        String str9;
        TLRPC.Chat chat;
        long j11;
        boolean z15;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        String str10;
        char c13;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.m0;
        bn bnVar2 = this.H0;
        if (bnVar2 != null) {
            chat3 = bnVar2.e;
            bnVar2.j();
        }
        TLRPC.Chat chat4 = chat3;
        a8 a8Var = this.q0;
        if (a8Var != null) {
            org.telegram.messenger.g0.r(a8Var);
            this.q0 = null;
        }
        if (this.k0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.k0, true);
            this.k0 = 0;
        }
        c1 c1Var = this.F;
        if (c1Var != null) {
            org.telegram.messenger.g0.r(c1Var);
            this.F = null;
        }
        t0 t0Var = this.G0;
        if (t0Var != null) {
            org.telegram.messenger.g0.r(t0Var);
            this.G0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.W;
        if (isEmpty || charSequence2.length() > np.u1(this.f).w1()) {
            S(null, null);
            r12.a(false);
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
            d1 d1Var = this.o0;
            if (d1Var != null) {
                d1Var.a();
                return;
            }
            return;
        }
        int i14 = charSequence2.length() > 0 ? i7 - 1 : i7;
        this.a0 = null;
        this.c0 = z10;
        this.b0 = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z16 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z16) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            z12 = true;
            int i15 = 0;
            while (i15 < length) {
                char charAt = charSequence3.charAt(i15);
                int i16 = length - 1;
                if (i15 < i16) {
                    str10 = str11;
                    c13 = charSequence3.charAt(i15 + 1);
                } else {
                    str10 = str11;
                    c13 = 0;
                }
                if (i15 < i16 && charAt == 55356 && c13 >= 57339 && c13 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i15), charSequence3.subSequence(i15 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i15), charSequence3.subSequence(i15 + 1, charSequence3.length()));
                    length--;
                } else {
                    i15++;
                    str11 = str10;
                }
                i15--;
                i15++;
                str11 = str10;
            }
            str = str11;
            this.E0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            z12 = true;
            str2 = str;
        }
        boolean z17 = (z16 && (j6.h(str2) || j6.h(this.E0))) ? z12 : false;
        if (z17 && (charSequence instanceof Spanned)) {
            y5[] y5VarArr = (y5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), y5.class);
            z17 = (y5VarArr == null || y5VarArr.length == 0) ? z12 : false;
        }
        if (this.c && z17 && (chat4 == null || v3.t(chat4))) {
            ArrayList arrayList5 = this.D0;
            arrayList5.clear();
            int i17 = cz.E;
            if (i17 == 2 || !z17) {
                if (this.p0 && i17 == 2) {
                    this.p0 = false;
                    r12.a(false);
                    f();
                    return;
                }
                return;
            }
            this.B0 = null;
            this.C0 = null;
            if (this.F0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.F0, z12);
                this.F0 = 0;
            }
            boolean z18 = np.u1(this.f).d4;
            if (z18) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i10 = i7;
            } else {
                arrayList4 = arrayList5;
                i10 = i7;
                arrayList2 = arrayList;
                this.G0 = new t0((h1) this, charSequence, i10, arrayList, z10, z11);
                si.d0(this.f).Y0(0, false, true, false);
                si.d0(this.f).Y0(2, false, true, false);
                ArrayList arrayList6 = si.d0(this.f).g0[0];
                ArrayList arrayList7 = si.d0(this.f).g0[2];
                int min = Math.min(20, arrayList6.size());
                int i18 = 0;
                for (int i19 = 0; i19 < min; i19++) {
                    TLRPC.Document document = (TLRPC.Document) arrayList6.get(i19);
                    if (O(document, this.E0)) {
                        E(document, "recent");
                        int i20 = i18 + 1;
                        if (i20 >= 5) {
                            break;
                        } else {
                            i18 = i20;
                        }
                    }
                }
                int size = arrayList7.size();
                for (int i21 = 0; i21 < size; i21++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList7.get(i21);
                    if (O(document2, this.E0)) {
                        E(document2, "fav");
                    }
                }
                si.d0(this.f).D(0);
                HashMap hashMap = si.d0(this.f).e0;
                ArrayList arrayList8 = hashMap != null ? (ArrayList) hashMap.get(this.E0) : null;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    F(null, arrayList8);
                }
                ArrayList arrayList9 = this.B0;
                if (arrayList9 != null) {
                    Collections.sort(arrayList9, new a1(arrayList7, arrayList6));
                }
            }
            if (cz.E == 0 || z18) {
                String str12 = this.E0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.F0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new bi.o1(18, this, str12));
            }
            ArrayList arrayList10 = this.B0;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                if (cz.E != 0 || this.B0.size() >= 5) {
                    H();
                    r12.a(arrayList4.isEmpty());
                    this.p0 = true;
                } else {
                    r12.a(false);
                    this.p0 = false;
                }
                f();
            } else if (this.p0) {
                r12.a(false);
                this.p0 = false;
            }
            c10 = ' ';
            c11 = 4;
            str3 = null;
        } else {
            i10 = i7;
            arrayList2 = arrayList;
            if (!z10 && this.g0 && charSequence2.charAt(0) == '@') {
                c10 = ' ';
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    str4 = substring;
                    i11 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i11 = 1;
                    str4 = charSequence2.substring(1);
                    str5 = str;
                } else {
                    i11 = 1;
                    S(null, null);
                    str4 = null;
                    str5 = null;
                }
                if (str4 != null && str4.length() >= i11) {
                    for (int i22 = 1; i22 < str4.length(); i22++) {
                        char charAt2 = str4.charAt(i22);
                        if ((charAt2 >= '0' && charAt2 <= '9') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '_'))) {
                        }
                    }
                    S(str4, str5);
                    str3 = null;
                }
                str4 = str;
                S(str4, str5);
                str3 = null;
            } else {
                c10 = ' ';
                if (!this.c || (bnVar = this.H0) == null || bnVar.h != null || (!(chat4 == null || v3.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c11 = 65535;
        }
        if (this.x0 != null) {
            return;
        }
        np u12 = np.u1(this.f);
        String str13 = this.G;
        this.G = str3;
        z1 z1Var = this.x;
        if (z10) {
            sb2.append(charSequence2.substring(1));
            this.Y = 0;
            this.Z = sb2.length();
            z14 = false;
            i14 = -1;
        } else {
            while (true) {
                if (i14 < 0) {
                    z13 = false;
                    c12 = c11;
                    break;
                }
                if (i14 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i14);
                    if (i14 != 0) {
                        int i23 = i14 - 1;
                        if (charSequence2.charAt(i23) != c10) {
                            if (charSequence2.charAt(i23) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z19 = this.n0;
                        if (z19 || this.f0 || (this.g0 && i14 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (v3.V(chat4) && !TextUtils.isEmpty(v3.K(chat4, false))) {
                            String substring2 = charSequence2.substring(i14);
                            this.G = substring2;
                            if (substring2.length() < 4 || !this.G.matches("^[#$][\\p{L}_-]+$")) {
                                this.G = null;
                            }
                        }
                        if (!z1Var.s) {
                            ur.a0(z1Var.m).a.c(new w1(z1Var, 1));
                            this.a0 = charSequence2;
                            this.d0 = i10;
                            this.e0 = arrayList2;
                            return;
                        }
                        this.Y = i14;
                        c12 = 1;
                        this.Z = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        z13 = false;
                    } else if (i14 != 0 || this.X == null || charAt3 != '/') {
                        if (charAt3 == ':' && sb2.length() > 0) {
                            if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                i12 = 1;
                                if (sb2.length() > 1) {
                                    break;
                                }
                            } else {
                                i12 = 1;
                                break;
                            }
                        }
                    } else {
                        this.Y = i14;
                        this.Z = sb2.length() + 1;
                        r11 = 0;
                        i14 = -1;
                        c12 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i14--;
            }
            this.Y = i14;
            this.Z = sb2.length() + 1;
            z14 = false;
        }
        c12 = 0;
        r11 = z14;
        if (str13 == null && this.G != null) {
            o(r11, 2);
        } else if (str13 == null || this.G != null) {
            ?? r32 = this.H;
            if (r32 != 0) {
                r32.a(r11, this.G, chat4);
            }
            f1 f1Var = this.I;
            if (f1Var != null) {
                f1Var.a(1, this.G, chat4);
            }
        } else {
            p(r11, 2);
        }
        if (c12 == 65535) {
            this.y0 = r11;
            this.S = null;
            r12.a(r11);
            return;
        }
        if (c12 != 0) {
            if (c12 == 1) {
                ArrayList arrayList11 = new ArrayList();
                String lowerCase = sb2.toString().toLowerCase();
                ArrayList arrayList12 = z1Var.q;
                for (int i24 = 0; i24 < arrayList12.size(); i24++) {
                    x1 x1Var = (x1) arrayList12.get(i24);
                    if (x1Var != null && (str7 = x1Var.a) != null && str7.startsWith(lowerCase)) {
                        arrayList11.add(x1Var.a);
                    }
                }
                this.J = arrayList11;
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
                r12.a((this.J.isEmpty() && this.G == null) ? false : true);
                return;
            }
            if (c12 != 2) {
                if (c12 == 3) {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    if (!Arrays.equals(G0, this.P)) {
                        si.d0(this.f).O(G0, false);
                    }
                    this.P = G0;
                    si.d0(this.f).W(this.P, sb2.toString(), false, new u0(this), cz.F && k10.i(this.f).q());
                    return;
                }
                if (c12 == 4) {
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
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            String lowerCase2 = sb2.toString().toLowerCase();
            for (int i25 = 0; i25 < this.X.m(); i25++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.X.n(i25);
                for (int i26 = 0; i26 < botInfo.commands.size(); i26++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i26);
                    if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                        arrayList13.add("/" + botCommand.command);
                        arrayList14.add(botCommand.description);
                        arrayList15.add(u12.c2(Long.valueOf(botInfo.user_id)));
                        arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            if (this.H0 != null && !n5.C(this.n)) {
                bn bnVar3 = this.H0;
                if (bnVar3.g4 == 0 && bnVar3.j() != null && !this.H0.j().bot && !p10.A(this.H0.j()) && !p10.B(this.H0.j().id)) {
                    kg.v1 f10 = kg.v1.f(this.f);
                    ArrayList arrayList17 = f10.b;
                    f10.h();
                    this.M = lowerCase2;
                    this.N = new ArrayList();
                    for (int i27 = 0; i27 < arrayList17.size(); i27++) {
                        kg.u1 u1Var = (kg.u1) arrayList17.get(i27);
                        if (!kg.v1.g(u1Var.b)) {
                            String lowerCase3 = u1Var.b.toLowerCase();
                            if (lowerCase3.startsWith(lowerCase2) || org.telegram.messenger.g0.M3(lowerCase3).startsWith(lowerCase2)) {
                                this.N.add(u1Var);
                            }
                        }
                    }
                    r62 = 0;
                    this.J = r62;
                    this.B0 = r62;
                    this.y = r62;
                    this.E = r62;
                    this.O = r62;
                    this.K = arrayList13;
                    this.L = arrayList14;
                    this.Q = arrayList15;
                    this.R = arrayList16;
                    this.y0 = false;
                    this.S = r62;
                    f();
                    r12.a(arrayList13.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
                    return;
                }
            }
            r62 = 0;
            this.M = null;
            this.N = null;
            this.J = r62;
            this.B0 = r62;
            this.y = r62;
            this.E = r62;
            this.O = r62;
            this.K = arrayList13;
            this.L = arrayList14;
            this.Q = arrayList15;
            this.R = arrayList16;
            this.y0 = false;
            this.S = r62;
            f();
            r12.a(arrayList13.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
            return;
        }
        this.y0 = r11;
        this.S = null;
        ArrayList arrayList18 = new ArrayList();
        if (arrayList2 != null) {
            for (int i28 = 0; i28 < Math.min(100, arrayList2.size()); i28++) {
                long Z0 = ((gj) arrayList2.get(i28)).Z0();
                if (Z0 > 0 && !arrayList18.contains(Long.valueOf(Z0))) {
                    arrayList18.add(Long.valueOf(Z0));
                }
            }
        }
        String lowerCase4 = sb2.toString().toLowerCase();
        boolean z20 = lowerCase4.indexOf(c10) >= 0;
        ArrayList arrayList19 = new ArrayList();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        ArrayList arrayList20 = new ArrayList();
        arrayList20.addAll(si.d0(this.f).k1);
        if (chat4 == null || (!v3.p0(chat4) && !v3.V(chat4))) {
            arrayList20.addAll(si.d0(this.f).l1);
        }
        List.-EL.sort(arrayList20, new w(1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList20.size();
        int i29 = 0;
        while (i29 < size2) {
            Object obj = arrayList20.get(i29);
            i29++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(n5.o(tL_topPeer.peer)), tL_topPeer);
        }
        ArrayList arrayList21 = new ArrayList(linkedHashMap.values());
        if (!z10 && this.g0 && i14 == 0 && !arrayList21.isEmpty()) {
            int i30 = 0;
            for (int i31 = 0; i31 < arrayList21.size(); i31++) {
                TLRPC.User c22 = u12.c2(Long.valueOf(((TLRPC.TL_topPeer) arrayList21.get(i31)).peer.user_id));
                if (c22 != null) {
                    String o10 = p10.o(c22);
                    if (!TextUtils.isEmpty(o10) && (lowerCase4.length() == 0 || o10.toLowerCase().startsWith(lowerCase4))) {
                        arrayList19.add(c22);
                        hVar.k(c22, c22.id);
                        hVar2.k(c22, c22.id);
                        i30++;
                    }
                    if (i30 == 5) {
                        break;
                    }
                }
            }
        }
        bn bnVar4 = this.H0;
        if (bnVar4 != null) {
            chat4 = bnVar4.e;
            j3 = bnVar4.s4;
        } else {
            TLRPC.ChatFull chatFull2 = this.w;
            if (chatFull2 != null) {
                chat4 = u12.O0(Long.valueOf(chatFull2.id));
            }
            j3 = 0;
        }
        ?? f11 = k10.i(this.f).f();
        if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!v3.T(chat4) || chat4.megagroup)) {
            int i32 = -2;
            int i33 = -2;
            while (i33 < this.w.participants.participants.size()) {
                if (i33 != i32) {
                    i13 = i33;
                    if (i13 == -1) {
                        if (z11) {
                            if (lowerCase4.length() == 0) {
                                arrayList19.add(chat4);
                            } else {
                                String str14 = chat4.title;
                                o4 = v3.K(chat4, false);
                                j10 = j3;
                                chat2 = chat4;
                                chat = f11;
                                j11 = -chat4.id;
                                str8 = str14;
                                str9 = null;
                                if (TextUtils.isEmpty(o4)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z15) {
                                }
                            }
                        }
                        z15 = z20;
                        j10 = j3;
                        chat = f11;
                    } else {
                        TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i13);
                        if (f11 != null) {
                            j10 = j3;
                        } else {
                            j10 = j3;
                        }
                        ?? c23 = u12.c2(Long.valueOf(chatParticipant.user_id));
                        if (c23 != 0 && !p10.C(c23) && hVar.h(c23.id) < 0) {
                            if (lowerCase4.length() != 0 || c23.deleted) {
                                str8 = c23.first_name;
                                String str15 = c23.last_name;
                                o4 = p10.o(c23);
                                str9 = str15;
                                chat = f11;
                                j11 = c23.id;
                                chat2 = c23;
                                if (TextUtils.isEmpty(o4)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z15) {
                                }
                            } else {
                                arrayList19.add(c23);
                            }
                        }
                        z15 = z20;
                        chat = f11;
                    }
                } else if (f11 == null || !z10) {
                    z15 = z20;
                    j10 = j3;
                    i13 = i33;
                    chat = f11;
                } else {
                    str8 = f11.first_name;
                    str9 = f11.last_name;
                    o4 = p10.o(f11);
                    j10 = j3;
                    TLRPC.Chat chat5 = f11;
                    j11 = f11.id;
                    i13 = i33;
                    chat = chat5;
                    chat2 = chat5;
                    if (TextUtils.isEmpty(o4)) {
                        z15 = z20;
                    } else {
                        z15 = z20;
                    }
                    if (!TextUtils.isEmpty(str8)) {
                    }
                    if (!TextUtils.isEmpty(str9)) {
                    }
                    if (!z15) {
                        if (i5.m(0, str8, str9).toLowerCase().startsWith(lowerCase4)) {
                        }
                        arrayList19.add(chat2);
                        hVar2.k(chat2, j11);
                    }
                }
                int i34 = i13 + 1;
                j3 = j10;
                f11 = chat;
                i32 = -2;
                i33 = i34;
                z20 = z15;
            }
        }
        boolean z21 = z20;
        long j12 = j3;
        if (this.n0) {
            ArrayList arrayList22 = np.u1(this.f).y;
            for (int i35 = 0; i35 < arrayList22.size(); i35++) {
                if (((TLRPC.Dialog) arrayList22.get(i35)).id > 0) {
                    TLRPC.User c24 = u12.c2(Long.valueOf(((TLRPC.Dialog) arrayList22.get(i35)).id));
                    if (c24 != null && !p10.C(c24) && hVar.h(c24.id) < 0) {
                        if (lowerCase4.length() != 0 || c24.deleted) {
                            String str16 = c24.first_name;
                            String str17 = c24.last_name;
                            String o11 = p10.o(c24);
                            long j13 = c24.id;
                            if ((!TextUtils.isEmpty(o11) && o11.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z21 && i5.m(0, str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                arrayList19.add(c24);
                                hVar2.k(c24, j13);
                            }
                        } else {
                            arrayList19.add(c24);
                        }
                    }
                } else if (!TextUtils.isEmpty(lowerCase4) && (O0 = u12.O0(Long.valueOf(-((TLRPC.Dialog) arrayList22.get(i35)).id))) != null && O0.username != null && hVar.h(O0.id) < 0) {
                    if (lowerCase4.length() == 0) {
                        arrayList19.add(O0);
                    } else {
                        String str18 = O0.title;
                        String str19 = O0.username;
                        long j14 = O0.id;
                        if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                            arrayList19.add(O0);
                            hVar2.k(O0, j14);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList19, new b1(hVar2, arrayList18));
        this.J = null;
        this.B0 = null;
        this.N = null;
        this.K = null;
        this.R = null;
        this.L = null;
        this.Q = null;
        this.O = null;
        if (((chat4 == null || !chat4.megagroup) && !this.n0) || lowerCase4.length() <= 0) {
            Y(hVar2, arrayList19, true);
            return;
        }
        if (arrayList19.size() < 5) {
            a8 a8Var2 = new a8(this, arrayList19, hVar2, 24);
            this.q0 = a8Var2;
            org.telegram.messenger.g0.h3(a8Var2, 1000L);
        } else {
            Y(hVar2, arrayList19, true);
        }
        c1 c1Var2 = new c1(this, chat4, lowerCase4, j12, arrayList19, hVar2, u12);
        this.F = c1Var2;
        org.telegram.messenger.g0.h3(c1Var2, 200L);
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        bn bnVar;
        TLRPC.Chat chat;
        this.f = k10.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (bnVar = this.H0) != null && (chat = bnVar.e) != null) {
            boolean t6 = v3.t(chat);
            this.i0 = t6;
            if (t6) {
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

    public final void X(bn bnVar) {
        this.H0 = bnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || p10.B(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        a8 a8Var = this.q0;
        if (a8Var != null) {
            org.telegram.messenger.g0.r(a8Var);
            this.q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.y.isEmpty());
        }
    }

    @Override // v4.i0
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (this.G != null) {
            if (i7 < 2) {
                return 6;
            }
            i7 -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.x0 != null && !this.i0) {
            return 3;
        }
        if (this.S == null) {
            ArrayList arrayList = this.N;
            return (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? 0 : 5;
        }
        if (i7 == 0) {
            return (this.U == null && this.V == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t0 t0Var;
        if (i7 == ls.Y1 || i7 == ls.Z1) {
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
        if (i7 == ls.X0) {
            t0 t0Var2 = this.G0;
            if (t0Var2 != null) {
                org.telegram.messenger.g0.g3(t0Var2);
                this.G0 = null;
                return;
            }
            return;
        }
        if (i7 == ls.x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.G0) != null) {
            org.telegram.messenger.g0.g3(t0Var);
            this.G0 = null;
        }
    }

    @Override // v4.i0
    public final void f() {
        oi oiVar;
        String str;
        String str2;
        int i7 = this.N0;
        q90 q90Var = this.W;
        int i10 = 0;
        if (i7 != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            boolean z10 = i7 != K;
            int min = Math.min(i7, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.L0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof kg.u1)) {
                            if (obj != obj2 && ((!(obj instanceof g1) || !(obj2 instanceof g1) || ((g1) obj).a != ((g1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof oi) && (obj2 instanceof oi) && (str = (oiVar = (oi) obj).b) != null) {
                                    oi oiVar2 = (oi) obj2;
                                    if (str.equals(oiVar2.b) && (str2 = oiVar.a) != null && str2.equals(oiVar2.a)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                g(i10);
                z10 = true;
                i10++;
            }
            p(min, i7 - min);
            o(min, K - min);
            if (z10 && q90Var != null) {
                q90Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (q90Var != null) {
            this.N0 = K();
            q90Var.c();
        }
        super.f();
        int K2 = K();
        this.N0 = K2;
        this.L0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.L0;
            if (i10 >= objArr3.length) {
                return;
            }
            objArr3[i10] = J(i10);
            i10++;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        bn bnVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.G;
        int i10 = str != null ? i7 - 2 : i7;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 4) {
            y7 y7Var = (y7) view;
            if (i10 < 0 || i10 >= this.B0.size()) {
                return;
            }
            g1 g1Var = (g1) this.B0.get(i10);
            TLRPC.Document document = g1Var.a;
            Object obj = g1Var.b;
            ug.b1 b1Var = y7Var.n;
            q9 q9Var = y7Var.a;
            y7Var.c = obj;
            boolean X3 = gj.X3(document);
            y7Var.s = X3;
            if (X3) {
                b1Var.setColor(m6.x0(null, m6.d6, false));
                b1Var.I = true;
                b1Var.J = false;
                b1Var.invalidate();
            }
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
            mz f11 = u5.f(document, m6.a7, 1.0f, y7Var.w);
            if (!gj.p(document)) {
                f10 = 1.0f;
                if (f11 == null) {
                    q9Var.k(gc.c(w10, document), null, "webp", null, y7Var.c);
                } else if (w10 != null) {
                    q9Var.k(gc.c(w10, document), null, "webp", f11, y7Var.c);
                } else {
                    q9Var.k(gc.b(document), null, "webp", f11, y7Var.c);
                }
            } else if (f11 != null) {
                q9Var.k(gc.b(document), "80_80", null, f11, y7Var.c);
                f10 = 1.0f;
            } else if (w10 != null) {
                f10 = 1.0f;
                q9Var.l(gc.b(document), "80_80", gc.c(w10, document), null, 0, y7Var.c);
            } else {
                f10 = 1.0f;
                q9Var.k(gc.b(document), "80_80", null, null, y7Var.c);
            }
            y7Var.b = document;
            Drawable background = y7Var.getBackground();
            if (background != null) {
                background.setAlpha(ls.G3);
                t6.x(y7Var, background, m6.tf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (y7Var.s) {
                y7Var.r = true;
            } else {
                y7Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
            if (k10.i(k10.t0).q()) {
                int L = org.telegram.messenger.g0.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                b1Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            } else {
                int L2 = org.telegram.messenger.g0.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            }
            b1Var.setLocked(!k10.i(k10.t0).q());
            org.telegram.messenger.g0.X3(b1Var, y7Var.r, 0.9f, true, false);
            y7Var.invalidate();
            y7Var.setClearsInputField(true);
            return;
        }
        if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!v3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(hd.N0(2131749368, null));
                    return;
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(hd.N0(2131753964, null));
                    return;
                } else {
                    textView.setText(hd.a0("AttachInlineRestricted", null, 2131753965, hd.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i11 == 5) {
            kg.r1 r1Var = (kg.r1) view;
            ArrayList arrayList = this.N;
            if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            r1Var.a((kg.u1) this.N.get(i10), this.M, false);
            return;
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.V == null) ? false : true;
            if (i11 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.h0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.V.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i10--;
                }
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                ((i2) view).e((TLRPC.BotInlineResult) this.S.get(i10), this.x0, this.y0, i10 != this.S.size() - 1, z10 && i10 == 0, "gif".equals(this.r0));
                return;
            }
        }
        if (i11 == 6) {
            f1 f1Var2 = (f1) view;
            int i12 = i10 + 2;
            if (i12 == 0) {
                this.H = f1Var2;
            } else {
                this.I = f1Var2;
            }
            TLRPC.Chat chat2 = this.m0;
            if (chat2 == null && (bnVar = this.H0) != null) {
                chat2 = bnVar.e;
            }
            f1Var2.a(i12, str, chat2);
            return;
        }
        if (i11 == 7) {
            return;
        }
        h5 h5Var = (h5) view;
        ArrayList arrayList3 = this.y;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i10);
            if (tLObject instanceof TLRPC.User) {
                h5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                h5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.J;
            if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.O;
                if (arrayList5 == null || i10 < 0 || i10 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.K;
                    if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                        ArrayList arrayList7 = this.L;
                        String str2 = (arrayList7 == null || i10 < 0 || i10 >= arrayList7.size()) ? null : (String) this.L.get(i10);
                        ArrayList arrayList8 = this.Q;
                        TLRPC.User user = (arrayList8 == null || i10 < 0 || i10 >= arrayList8.size()) ? null : (TLRPC.User) this.Q.get(i10);
                        ArrayList arrayList9 = this.R;
                        boolean booleanValue = ((arrayList9 == null || i10 < 0 || i10 >= arrayList9.size()) ? null : (Boolean) this.R.get(i10)).booleanValue();
                        String str3 = (String) this.K.get(i10);
                        xb xbVar = h5Var.b;
                        TextView textView2 = h5Var.c;
                        b9 b9Var = h5Var.d;
                        q9 q9Var2 = h5Var.a;
                        h5Var.a();
                        if (user != null) {
                            q9Var2.setVisibility(0);
                            b9Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                q9Var2.setImageDrawable(b9Var);
                            } else {
                                q9Var2.f(user, b9Var);
                            }
                        } else {
                            q9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            nq nqVar = new nq(R.drawable.mini_ephemeral_hidden_14, 0);
                            nqVar.a(m6.A6);
                            nqVar.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            xbVar.setText(spannableStringBuilder);
                        } else {
                            xbVar.setText(str3);
                        }
                        textView2.setText(j6.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    h5Var.setEmojiSuggestion((oi) this.O.get(i10));
                }
            } else {
                h5Var.setText((String) this.J.get(i10));
            }
        }
        h5Var.setDivider(false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        h6 h6Var = this.I0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(context);
                    TextView textView = new TextView(context);
                    h0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    t6.U(textView, m6.uf, null);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(hd.a0 ? 5 : 3);
                    h0Var.addView(textView, ma.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view2 = h0Var;
                } else if (i7 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    t6.U(textView2, m6.z6, h6Var);
                    view2 = textView2;
                } else if (i7 != 5) {
                    boolean z10 = this.s;
                    if (i7 == 6) {
                        view2 = new f1(context, h6Var, z10);
                    } else if (i7 != 7) {
                        y7 y7Var = new y7(context);
                        y7Var.w = h6Var;
                        q9 q9Var = new q9(context);
                        y7Var.a = q9Var;
                        q9Var.setAspectFit(true);
                        q9Var.setLayerNum(1);
                        y7Var.addView(q9Var, ma.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        y7Var.setFocusable(true);
                        ug.b1 b1Var = new ug.b1(1, context, null);
                        y7Var.n = b1Var;
                        b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                        b1Var.setImageReceiver(q9Var.getImageReceiver());
                        y7Var.addView(b1Var, ma.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = y7Var;
                    } else {
                        View lnVar = new ln(context, 4);
                        ColorDrawable colorDrawable = new ColorDrawable(z10 ? m6.r1(0.15f, -1) : m6.w0(m6.a7, h6Var));
                        if (!z10) {
                            t6.x(lnVar, colorDrawable, m6.a7, h6Var, PorterDuff.Mode.SRC_IN);
                        }
                        oq oqVar = new oq(colorDrawable, m6.X0(context, R.drawable.greydivider, m6.w0(m6.b7, h6Var)), 0, 0);
                        oqVar.x = true;
                        lnVar.setBackground(oqVar);
                        view = lnVar;
                    }
                } else {
                    view = new kg.r1(context, h6Var, false);
                }
            } else {
                i2 i2Var = new i2(context);
                i2Var.setDelegate(new u0(this));
                view2 = i2Var;
            }
            return new mj0(view2);
        }
        h5 h5Var = new h5(context, h6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        view2 = view;
        return new mj0(view2);
    }
}
