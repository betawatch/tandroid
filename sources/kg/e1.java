package kg;

import ai.f3;
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
import b8.mf;
import ci.ec;
import ci.h3;
import ei.h9;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.gs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.jz;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xp;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e1 extends sj0 implements cs {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public a0.h E;
    public String E0;
    public z0 F;
    public int F0;
    public String G;
    public q0 G0;
    public c1 H;
    public wm H0;
    public c1 I;
    public final e6 I0;
    public ArrayList J;
    public ArrayList K;
    public final za.p K0;
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
    public final x80 W;
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
    public a1 o0;
    public boolean p0;
    public h9 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final v1 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public w0 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = h10.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final v0 J0 = new v0(this, new u0(this));
    public boolean M0 = false;
    public int N0 = -1;

    public e1(Context context, long j10, long j11, x80 x80Var, e6 e6Var, boolean z10) {
        this.I0 = e6Var;
        this.h = context;
        this.W = x80Var;
        this.n = j10;
        this.s = z10;
        this.r = j11;
        v1 v1Var = new v1(true);
        this.x = v1Var;
        v1Var.a = new hi.d(this, 5);
        za.p pVar = (za.p) new gs(hs.f(this.f), this).b;
        pVar.b(hs.X0);
        pVar.b(hs.x0);
        this.K0 = pVar;
        pVar.b(hs.Y1);
        pVar.b(hs.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i3++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return (this.x0 == null || this.i0) && this.B0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (h10.i(this.f).q() || !zi.Y3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new d1(str, document));
                this.C0.put(str2, document);
                a1 a1Var = this.o0;
                if (a1Var != null) {
                    a1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        Object obj = str;
        while (i3 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.C0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (h10.i(this.f).q() || !zi.Y3(document))) {
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
                this.B0.add(new d1(obj, document));
                this.C0.put(str2, document);
            }
            i3++;
            obj = obj;
        }
    }

    public final void G() {
        wm wmVar = this.H0;
        if (wmVar == null || wmVar.getParentActivity() == null) {
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
        this.J0.q();
    }

    public final void H() {
        if (this.B0 == null) {
            return;
        }
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int min = Math.min(6, this.B0.size());
        for (int i3 = 0; i3 < min; i3++) {
            d1 d1Var = (d1) this.B0.get(i3);
            TLRPC.PhotoSize w10 = w7.w(d1Var.a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f);
                if (!w7.K(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f).W(ac.c(w10, d1Var.a), d1Var.b, "webp", 1, 1);
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

    public final Object J(int i3) {
        String str;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i3 >= 2) {
                i3 -= 2;
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
                        if (i3 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i3 >= 0 && i3 < arrayList2.size()) {
                        return this.S.get(i3);
                    }
                } else if (i3 == 0) {
                    return tL_inlineBotWebView;
                }
                i3--;
                if (i3 >= 0) {
                    return this.S.get(i3);
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
                                    if (i3 >= 0 && i3 < arrayList6.size()) {
                                        return this.N.get(i3);
                                    }
                                    ArrayList arrayList7 = this.N;
                                    if (arrayList7 != null) {
                                        i3 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.K;
                                if (arrayList8 != null && i3 >= 0 && i3 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.Q;
                                    if (arrayList9 == null || (this.h0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.K.get(i3);
                                    } else if (arrayList9.get(i3) != null) {
                                        user = (TLRPC.User) this.Q.get(i3);
                                        str = String.format("%s@%s", this.K.get(i3), user != null ? l10.n(user) : "");
                                    } else {
                                        str = String.format("%s", this.K.get(i3));
                                    }
                                    ArrayList arrayList10 = this.R;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i3)).booleanValue()) {
                                        return str;
                                    }
                                    return new b1(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i3 >= 0 && i3 < arrayList5.size()) {
                            return this.O.get(i3);
                        }
                    } else if (i3 >= 0 && i3 < arrayList4.size()) {
                        return this.J.get(i3);
                    }
                } else if (i3 >= 0 && i3 < arrayList3.size()) {
                    return this.y.get(i3);
                }
            }
        } else if (i3 >= 0 && i3 < arrayList.size()) {
            return ((d1) this.B0.get(i3)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i3 = 1;
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
                    i3 = 0;
                }
                return size2 + i3 + i10;
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

    public final Object L(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return null;
            }
            i3 -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i3 < 0 || i3 >= arrayList.size()) {
            return null;
        }
        return ((d1) this.B0.get(i3)).b;
    }

    public final int M(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return 0;
            }
            i3 -= 2;
        }
        return this.S != null ? (this.U == null && this.V == null) ? i3 : i3 - 1 : i3;
    }

    public final boolean N() {
        return this.B0 != null;
    }

    public final void P() {
        v0 v0Var = this.J0;
        if (v0Var != null) {
            v0Var.r();
        }
        w0 w0Var = this.z0;
        if (w0Var != null) {
            org.telegram.messenger.g0.r(w0Var);
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
        wm wmVar;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.r();
        x80 x80Var = this.W;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.x0 = null;
            this.U = null;
            this.i0 = true;
        } else {
            this.x0 = user;
            long j10 = user.id;
            if (j10 != this.T) {
                this.U = null;
                this.T = j10;
            }
            wm wmVar2 = this.H0;
            if (wmVar2 != null && (chat = wmVar2.e) != null) {
                boolean t10 = t3.t(chat);
                this.i0 = t10;
                if (!t10) {
                    f();
                    x80Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                if (hp.s1(this.f).d7.getBoolean("inlinegeo_" + this.x0.id, false) || (wmVar = this.H0) == null || wmVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = bd.M0(2131745433, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = bd.M0(2131745434, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(bd.M0(2131747839, null), new aa.a(this, zArr, user2, 10));
                    alertDialog$Builder.h(bd.M0(2131752589, null), new ai.n(21, this, zArr));
                    this.H0.showDialog(s1Var, new h3(this, zArr, 4));
                }
            }
        }
        if (this.x0 == null) {
            this.w0 = true;
            this.U = null;
        } else {
            if (x80Var != null) {
                x80Var.b(true);
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
            x80 x80Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                } else {
                    x80Var.a(false);
                }
            }
            w0 w0Var = this.z0;
            if (w0Var != null) {
                org.telegram.messenger.g0.r(w0Var);
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
                this.J0.r();
                this.w0 = false;
                if (x80Var != null) {
                    x80Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (x80Var != null) {
                    if (this.x0 != null) {
                        x80Var.b(true);
                    } else if (str.equals("gif")) {
                        this.r0 = "gif";
                        x80Var.b(false);
                    }
                }
                hp s12 = hp.s1(this.f);
                qr a02 = qr.a0(this.f);
                this.s0 = str2;
                w0 w0Var2 = new w0(this, str2, str, s12, a02);
                this.z0 = w0Var2;
                org.telegram.messenger.g0.i3(w0Var2, 400L);
                return;
            }
            if (this.v0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                this.v0 = 0;
            }
            this.s0 = null;
            if (x80Var != null) {
                x80Var.b(false);
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
            x80 x80Var = this.W;
            if (x80Var != null) {
                x80Var.b(false);
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
        final qr a02 = qr.a0(this.f);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: kg.s0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new t0(e1.this, str, z10, tLObject, user, str2, a02, sb3));
            }
        };
        long j10 = user.id;
        if (j10 != this.T) {
            this.U = null;
            this.T = j10;
        }
        if (z10) {
            a02.M(sb3, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = hp.s1(this.f).q1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.A0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.A0.getLongitude());
        }
        if (m5.C(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = hp.s1(this.f).j1(this.n);
        }
        this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0726, code lost:
    
        if (r17.toLowerCase().startsWith(r0) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0739, code lost:
    
        if (r14.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0749, code lost:
    
        if (r15.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06da, code lost:
    
        if (r13.user_id == r11.id) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03f6, code lost:
    
        if (r10 != ':') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0412, code lost:
    
        if (r26.w != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0414, code lost:
    
        if (r13 == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0416, code lost:
    
        r26.a0 = r7;
        r26.d0 = r3;
        r26.e0 = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0420, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0421, code lost:
    
        r26.Y = r13;
        r26.Z = r14.length() + 1;
        r11 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0500  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v40, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v57, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.x80] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, kg.e1, u4.h0] */
    /* JADX WARN: Type inference failed for: r3v24, types: [kg.c1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i3, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        boolean z12;
        String str2;
        int i10;
        ArrayList arrayList2;
        char c2;
        String str3;
        wm wmVar;
        char c10;
        int i11;
        String str4;
        String str5;
        boolean z13;
        char c11;
        int i12;
        ?? r11;
        boolean z14;
        ?? r32;
        c1 c1Var;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j10;
        TLRPC.Chat M0;
        TLRPC.ChatFull chatFull;
        int i13;
        long j11;
        String str8;
        String n4;
        String str9;
        TLRPC.Chat chat;
        long j12;
        boolean z15;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        String str10;
        char c12;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.m0;
        wm wmVar2 = this.H0;
        if (wmVar2 != null) {
            chat3 = wmVar2.e;
            wmVar2.j();
        }
        TLRPC.Chat chat4 = chat3;
        h9 h9Var = this.q0;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.q0 = null;
        }
        if (this.k0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.k0, true);
            this.k0 = 0;
        }
        z0 z0Var = this.F;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.F = null;
        }
        q0 q0Var = this.G0;
        if (q0Var != null) {
            org.telegram.messenger.g0.r(q0Var);
            this.G0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.W;
        if (isEmpty || charSequence2.length() > hp.s1(this.f).u1()) {
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
            a1 a1Var = this.o0;
            if (a1Var != null) {
                a1Var.a();
                return;
            }
            return;
        }
        int i14 = charSequence2.length() > 0 ? i3 - 1 : i3;
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
                    c12 = charSequence3.charAt(i15 + 1);
                } else {
                    str10 = str11;
                    c12 = 0;
                }
                if (i15 < i16 && charAt == 55356 && c12 >= 57339 && c12 <= 57343) {
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
        boolean z17 = (z16 && (i6.h(str2) || i6.h(this.E0))) ? z12 : false;
        if (z17 && (charSequence instanceof Spanned)) {
            p5[] p5VarArr = (p5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), p5.class);
            z17 = (p5VarArr == null || p5VarArr.length == 0) ? z12 : false;
        }
        if (this.c && z17 && (chat4 == null || t3.t(chat4))) {
            ArrayList arrayList5 = this.D0;
            arrayList5.clear();
            int i17 = az.E;
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
            boolean z18 = hp.s1(this.f).b4;
            if (z18) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i10 = i3;
            } else {
                arrayList4 = arrayList5;
                i10 = i3;
                arrayList2 = arrayList;
                this.G0 = new q0((e1) this, charSequence, i10, arrayList, z10, z11);
                li.b0(this.f).V0(0, false, true, false);
                li.b0(this.f).V0(2, false, true, false);
                ArrayList arrayList6 = li.b0(this.f).g0[0];
                ArrayList arrayList7 = li.b0(this.f).g0[2];
                int min = Math.min(20, arrayList6.size());
                int i18 = 0;
                int i19 = 0;
                while (i18 < min) {
                    TLRPC.Document document = (TLRPC.Document) arrayList6.get(i18);
                    int i20 = min;
                    if (O(document, this.E0)) {
                        E(document, "recent");
                        int i21 = i19 + 1;
                        if (i21 >= 5) {
                            break;
                        } else {
                            i19 = i21;
                        }
                    }
                    i18++;
                    min = i20;
                }
                int size = arrayList7.size();
                int i22 = 0;
                while (i22 < size) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList7.get(i22);
                    int i23 = size;
                    if (O(document2, this.E0)) {
                        E(document2, "fav");
                    }
                    i22++;
                    size = i23;
                }
                li.b0(this.f).B(0);
                HashMap hashMap = li.b0(this.f).e0;
                ArrayList arrayList8 = hashMap != null ? (ArrayList) hashMap.get(this.E0) : null;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    F(null, arrayList8);
                }
                ArrayList arrayList9 = this.B0;
                if (arrayList9 != null) {
                    Collections.sort(arrayList9, new x0(arrayList7, arrayList6));
                }
            }
            if (az.E == 0 || z18) {
                String str12 = this.E0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.F0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new f3(20, this, str12));
            }
            ArrayList arrayList10 = this.B0;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                if (az.E != 0 || this.B0.size() >= 5) {
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
            c2 = ' ';
            c10 = 4;
            str3 = null;
        } else {
            i10 = i3;
            arrayList2 = arrayList;
            if (!z10 && this.g0 && charSequence2.charAt(0) == '@') {
                c2 = ' ';
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
                    for (int i24 = 1; i24 < str4.length(); i24++) {
                        char charAt2 = str4.charAt(i24);
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
                c2 = ' ';
                if (!this.c || (wmVar = this.H0) == null || wmVar.h != null || (!(chat4 == null || t3.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c10 = 65535;
        }
        if (this.x0 != null) {
            return;
        }
        hp s12 = hp.s1(this.f);
        String str13 = this.G;
        this.G = str3;
        v1 v1Var = this.x;
        if (!z10) {
            while (true) {
                if (i14 < 0) {
                    z13 = false;
                    c11 = c10;
                    break;
                }
                if (i14 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i14);
                    if (i14 != 0) {
                        int i25 = i14 - 1;
                        if (charSequence2.charAt(i25) != c2) {
                            if (charSequence2.charAt(i25) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z19 = this.n0;
                        if (z19 || this.f0 || (this.g0 && i14 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (t3.V(chat4) && !TextUtils.isEmpty(t3.K(chat4, false))) {
                            String substring2 = charSequence2.substring(i14);
                            this.G = substring2;
                            if (substring2.length() < 4 || !this.G.matches("^[#$][\\p{L}_-]+$")) {
                                this.G = null;
                            }
                        }
                        if (!v1Var.s) {
                            qr.a0(v1Var.m).a.c(new s1(v1Var, 1));
                            this.a0 = charSequence2;
                            this.d0 = i10;
                            this.e0 = arrayList2;
                            return;
                        }
                        this.Y = i14;
                        c11 = 1;
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
                        c11 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i14--;
            }
            this.Y = i14;
            this.Z = sb2.length() + i12;
            c11 = 3;
            z13 = false;
            i14 = -1;
            r11 = z13;
            if (str13 != null && this.G != null) {
                o(r11, 2);
            } else if (str13 == null && this.G == null) {
                p(r11, 2);
            } else {
                r32 = this.H;
                if (r32 != 0) {
                    r32.a(r11, this.G, chat4);
                }
                c1Var = this.I;
                if (c1Var != null) {
                    c1Var.a(1, this.G, chat4);
                }
            }
            if (c11 != 65535) {
                this.y0 = r11;
                this.S = null;
                r12.a(r11);
                return;
            }
            if (c11 != 0) {
                if (c11 == 1) {
                    ArrayList arrayList11 = new ArrayList();
                    String lowerCase = sb2.toString().toLowerCase();
                    ArrayList arrayList12 = v1Var.q;
                    for (int i26 = 0; i26 < arrayList12.size(); i26++) {
                        t1 t1Var = (t1) arrayList12.get(i26);
                        if (t1Var != null && (str7 = t1Var.a) != null && str7.startsWith(lowerCase)) {
                            arrayList11.add(t1Var.a);
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
                if (c11 != 2) {
                    if (c11 == 3) {
                        String[] G0 = org.telegram.messenger.g0.G0();
                        if (!Arrays.equals(G0, this.P)) {
                            li.b0(this.f).M(G0, false);
                        }
                        this.P = G0;
                        li.b0(this.f).U(this.P, sb2.toString(), false, new r0(this), az.F && h10.i(this.f).q());
                        return;
                    }
                    if (c11 == 4) {
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
                for (int i27 = 0; i27 < this.X.m(); i27++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.X.n(i27);
                    for (int i28 = 0; i28 < botInfo.commands.size(); i28++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i28);
                        if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                            arrayList13.add("/" + botCommand.command);
                            arrayList14.add(botCommand.description);
                            arrayList15.add(s12.a2(Long.valueOf(botInfo.user_id)));
                            arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                        }
                    }
                }
                if (this.H0 != null && !m5.C(this.n)) {
                    wm wmVar3 = this.H0;
                    if (wmVar3.g4 == 0 && wmVar3.j() != null && !this.H0.j().bot && !l10.z(this.H0.j()) && !l10.A(this.H0.j().id)) {
                        lg.u1 f10 = lg.u1.f(this.f);
                        ArrayList arrayList17 = f10.b;
                        f10.h();
                        this.M = lowerCase2;
                        this.N = new ArrayList();
                        for (int i29 = 0; i29 < arrayList17.size(); i29++) {
                            lg.t1 t1Var2 = (lg.t1) arrayList17.get(i29);
                            if (!lg.u1.g(t1Var2.b)) {
                                String lowerCase3 = t1Var2.b.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase2) || org.telegram.messenger.g0.O3(lowerCase3).startsWith(lowerCase2)) {
                                    this.N.add(t1Var2);
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
                for (int i30 = 0; i30 < Math.min(100, arrayList2.size()); i30++) {
                    long Z0 = ((zi) arrayList2.get(i30)).Z0();
                    if (Z0 > 0 && !arrayList18.contains(Long.valueOf(Z0))) {
                        arrayList18.add(Long.valueOf(Z0));
                    }
                }
            }
            String lowerCase4 = sb2.toString().toLowerCase();
            boolean z20 = lowerCase4.indexOf(c2) >= 0;
            ArrayList arrayList19 = new ArrayList();
            a0.h hVar = new a0.h();
            a0.h hVar2 = new a0.h();
            ArrayList arrayList20 = new ArrayList();
            arrayList20.addAll(li.b0(this.f).k1);
            if (chat4 == null || (!t3.p0(chat4) && !t3.V(chat4))) {
                arrayList20.addAll(li.b0(this.f).l1);
            }
            List.-EL.sort(arrayList20, new a3.u(23));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList20.size();
            int i31 = 0;
            while (i31 < size2) {
                Object obj = arrayList20.get(i31);
                i31++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(m5.o(tL_topPeer.peer)), tL_topPeer);
            }
            ArrayList arrayList21 = new ArrayList(linkedHashMap.values());
            if (!z10 && this.g0 && i14 == 0 && !arrayList21.isEmpty()) {
                int i32 = 0;
                for (int i33 = 0; i33 < arrayList21.size(); i33++) {
                    TLRPC.User a22 = s12.a2(Long.valueOf(((TLRPC.TL_topPeer) arrayList21.get(i33)).peer.user_id));
                    if (a22 != null) {
                        String n10 = l10.n(a22);
                        if (!TextUtils.isEmpty(n10) && (lowerCase4.length() == 0 || n10.toLowerCase().startsWith(lowerCase4))) {
                            arrayList19.add(a22);
                            hVar.k(a22, a22.id);
                            hVar2.k(a22, a22.id);
                            i32++;
                        }
                        if (i32 == 5) {
                            break;
                        }
                    }
                }
            }
            wm wmVar4 = this.H0;
            if (wmVar4 != null) {
                chat4 = wmVar4.e;
                j10 = wmVar4.s4;
            } else {
                TLRPC.ChatFull chatFull2 = this.w;
                if (chatFull2 != null) {
                    chat4 = s12.M0(Long.valueOf(chatFull2.id));
                }
                j10 = 0;
            }
            ?? f11 = h10.i(this.f).f();
            if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!t3.T(chat4) || chat4.megagroup)) {
                int i34 = -2;
                int i35 = -2;
                while (i35 < this.w.participants.participants.size()) {
                    if (i35 != i34) {
                        i13 = i35;
                        if (i13 == -1) {
                            if (z11) {
                                if (lowerCase4.length() == 0) {
                                    arrayList19.add(chat4);
                                } else {
                                    String str14 = chat4.title;
                                    n4 = t3.K(chat4, false);
                                    j11 = j10;
                                    chat2 = chat4;
                                    chat = f11;
                                    j12 = -chat4.id;
                                    str8 = str14;
                                    str9 = null;
                                    if (TextUtils.isEmpty(n4)) {
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
                            j11 = j10;
                            chat = f11;
                        } else {
                            TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i13);
                            if (f11 != null) {
                                j11 = j10;
                            } else {
                                j11 = j10;
                            }
                            ?? a23 = s12.a2(Long.valueOf(chatParticipant.user_id));
                            if (a23 != 0 && !l10.B(a23) && hVar.h(a23.id) < 0) {
                                if (lowerCase4.length() != 0 || a23.deleted) {
                                    str8 = a23.first_name;
                                    String str15 = a23.last_name;
                                    n4 = l10.n(a23);
                                    str9 = str15;
                                    chat = f11;
                                    j12 = a23.id;
                                    chat2 = a23;
                                    if (TextUtils.isEmpty(n4)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    if (!z15) {
                                    }
                                } else {
                                    arrayList19.add(a23);
                                }
                            }
                            z15 = z20;
                            chat = f11;
                        }
                    } else if (f11 == null || !z10) {
                        z15 = z20;
                        j11 = j10;
                        i13 = i35;
                        chat = f11;
                    } else {
                        str8 = f11.first_name;
                        str9 = f11.last_name;
                        n4 = l10.n(f11);
                        j11 = j10;
                        TLRPC.Chat chat5 = f11;
                        j12 = f11.id;
                        i13 = i35;
                        chat = chat5;
                        chat2 = chat5;
                        if (TextUtils.isEmpty(n4)) {
                            z15 = z20;
                        } else {
                            z15 = z20;
                        }
                        if (!TextUtils.isEmpty(str8)) {
                        }
                        if (!TextUtils.isEmpty(str9)) {
                        }
                        if (!z15) {
                            if (g5.m(0, str8, str9).toLowerCase().startsWith(lowerCase4)) {
                            }
                            arrayList19.add(chat2);
                            hVar2.k(chat2, j12);
                        }
                    }
                    int i36 = i13 + 1;
                    j10 = j11;
                    f11 = chat;
                    i34 = -2;
                    i35 = i36;
                    z20 = z15;
                }
            }
            boolean z21 = z20;
            long j13 = j10;
            if (this.n0) {
                ArrayList arrayList22 = hp.s1(this.f).y;
                for (int i37 = 0; i37 < arrayList22.size(); i37++) {
                    if (((TLRPC.Dialog) arrayList22.get(i37)).id > 0) {
                        TLRPC.User a24 = s12.a2(Long.valueOf(((TLRPC.Dialog) arrayList22.get(i37)).id));
                        if (a24 != null && !l10.B(a24) && hVar.h(a24.id) < 0) {
                            if (lowerCase4.length() != 0 || a24.deleted) {
                                String str16 = a24.first_name;
                                String str17 = a24.last_name;
                                String n11 = l10.n(a24);
                                long j14 = a24.id;
                                if ((!TextUtils.isEmpty(n11) && n11.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z21 && g5.m(0, str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                    arrayList19.add(a24);
                                    hVar2.k(a24, j14);
                                }
                            } else {
                                arrayList19.add(a24);
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase4) && (M0 = s12.M0(Long.valueOf(-((TLRPC.Dialog) arrayList22.get(i37)).id))) != null && M0.username != null && hVar.h(M0.id) < 0) {
                        if (lowerCase4.length() == 0) {
                            arrayList19.add(M0);
                        } else {
                            String str18 = M0.title;
                            String str19 = M0.username;
                            long j15 = M0.id;
                            if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                                arrayList19.add(M0);
                                hVar2.k(M0, j15);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList19, new y0(hVar2, arrayList18));
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
                h9 h9Var2 = new h9((Object) this, arrayList19, (Cloneable) hVar2, 24);
                this.q0 = h9Var2;
                org.telegram.messenger.g0.i3(h9Var2, 1000L);
            } else {
                Y(hVar2, arrayList19, true);
            }
            z0 z0Var2 = new z0(this, chat4, lowerCase4, j13, arrayList19, hVar2, s12);
            this.F = z0Var2;
            org.telegram.messenger.g0.i3(z0Var2, 200L);
            return;
        }
        sb2.append(charSequence2.substring(1));
        this.Y = 0;
        this.Z = sb2.length();
        z14 = false;
        i14 = -1;
        c11 = 0;
        r11 = z14;
        if (str13 != null) {
        }
        if (str13 == null) {
        }
        r32 = this.H;
        if (r32 != 0) {
        }
        c1Var = this.I;
        if (c1Var != null) {
        }
        if (c11 != 65535) {
        }
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        wm wmVar;
        TLRPC.Chat chat;
        this.f = h10.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (wmVar = this.H0) != null && (chat = wmVar.e) != null) {
            boolean t10 = t3.t(chat);
            this.i0 = t10;
            if (t10) {
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

    public final void X(wm wmVar) {
        this.H0 = wmVar;
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
                    if (user.bot || l10.A(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = hVar;
        h9 h9Var = this.q0;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            this.q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z10) {
            f();
            this.W.a(!this.y.isEmpty());
        }
    }

    @Override // u4.h0
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (this.G != null) {
            if (i3 < 2) {
                return 6;
            }
            i3 -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.x0 != null && !this.i0) {
            return 3;
        }
        if (this.S == null) {
            ArrayList arrayList = this.N;
            return (arrayList == null || i3 < 0 || i3 >= arrayList.size()) ? 0 : 5;
        }
        if (i3 == 0) {
            return (this.U == null && this.V == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        q0 q0Var;
        if (i3 == hs.Y1 || i3 == hs.Z1) {
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
        if (i3 == hs.X0) {
            q0 q0Var2 = this.G0;
            if (q0Var2 != null) {
                org.telegram.messenger.g0.h3(q0Var2);
                this.G0 = null;
                return;
            }
            return;
        }
        if (i3 == hs.x0 && ((Integer) objArr[0]).intValue() == 0 && (q0Var = this.G0) != null) {
            org.telegram.messenger.g0.h3(q0Var);
            this.G0 = null;
        }
    }

    @Override // u4.h0
    public final void f() {
        hi hiVar;
        String str;
        String str2;
        int i3 = this.N0;
        x80 x80Var = this.W;
        int i10 = 0;
        if (i3 != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            boolean z10 = i3 != K;
            int min = Math.min(i3, K);
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
                        if (!(obj instanceof lg.t1)) {
                            if (obj != obj2 && ((!(obj instanceof d1) || !(obj2 instanceof d1) || ((d1) obj).a != ((d1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof hi) && (obj2 instanceof hi) && (str = (hiVar = (hi) obj).b) != null) {
                                    hi hiVar2 = (hi) obj2;
                                    if (str.equals(hiVar2.b) && (str2 = hiVar.a) != null && str2.equals(hiVar2.a)) {
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
            p(min, i3 - min);
            o(min, K - min);
            if (z10 && x80Var != null) {
                x80Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (x80Var != null) {
            this.N0 = K();
            x80Var.c();
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

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        wm wmVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.G;
        int i10 = str != null ? i3 - 2 : i3;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 4) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            if (i10 < 0 || i10 >= this.B0.size()) {
                return;
            }
            d1 d1Var2 = (d1) this.B0.get(i10);
            TLRPC.Document document = d1Var2.a;
            Object obj = d1Var2.b;
            vg.y0 y0Var = w7Var.n;
            k9 k9Var = w7Var.a;
            w7Var.c = obj;
            boolean Y3 = zi.Y3(document);
            w7Var.s = Y3;
            if (Y3) {
                y0Var.setColor(k6.x0(null, k6.d6, false));
                y0Var.I = true;
                y0Var.J = false;
                y0Var.invalidate();
            }
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
            jz f11 = t5.f(document, k6.a7, 1.0f, w7Var.w);
            if (!zi.p(document)) {
                f10 = 1.0f;
                if (f11 == null) {
                    k9Var.k(ac.c(w10, document), null, "webp", null, w7Var.c);
                } else if (w10 != null) {
                    k9Var.k(ac.c(w10, document), null, "webp", f11, w7Var.c);
                } else {
                    k9Var.k(ac.b(document), null, "webp", f11, w7Var.c);
                }
            } else if (f11 != null) {
                k9Var.k(ac.b(document), "80_80", null, f11, w7Var.c);
                f10 = 1.0f;
            } else if (w10 != null) {
                f10 = 1.0f;
                k9Var.l(ac.b(document), "80_80", ac.c(w10, document), null, 0, w7Var.c);
            } else {
                f10 = 1.0f;
                k9Var.k(ac.b(document), "80_80", null, null, w7Var.c);
            }
            w7Var.b = document;
            Drawable background = w7Var.getBackground();
            if (background != null) {
                background.setAlpha(hs.G3);
                r6.y(w7Var, background, k6.qf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (w7Var.s) {
                w7Var.r = true;
            } else {
                w7Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y0Var.getLayoutParams();
            if (h10.i(h10.t0).q()) {
                int L = org.telegram.messenger.g0.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                y0Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            } else {
                int L2 = org.telegram.messenger.g0.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            }
            y0Var.setLocked(!h10.i(h10.t0).q());
            org.telegram.messenger.g0.Z3(y0Var, w7Var.r, 0.9f, true, false);
            w7Var.invalidate();
            w7Var.setClearsInputField(true);
            return;
        }
        if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!t3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(bd.M0(2131749552, null));
                    return;
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(bd.M0(2131753967, null));
                    return;
                } else {
                    textView.setText(bd.a0("AttachInlineRestricted", null, 2131753968, bd.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i11 == 5) {
            lg.q1 q1Var = (lg.q1) view;
            ArrayList arrayList = this.N;
            if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            q1Var.a((lg.t1) this.N.get(i10), this.M, false);
            return;
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.V == null) ? false : true;
            if (i11 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.g0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.V.text);
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
                ((h2) view).e((TLRPC.BotInlineResult) this.S.get(i10), this.x0, this.y0, i10 != this.S.size() - 1, z10 && i10 == 0, "gif".equals(this.r0));
                return;
            }
        }
        if (i11 == 6) {
            c1 c1Var = (c1) view;
            int i12 = i10 + 2;
            if (i12 == 0) {
                this.H = c1Var;
            } else {
                this.I = c1Var;
            }
            TLRPC.Chat chat2 = this.m0;
            if (chat2 == null && (wmVar = this.H0) != null) {
                chat2 = wmVar.e;
            }
            c1Var.a(i12, str, chat2);
            return;
        }
        if (i11 == 7) {
            return;
        }
        f5 f5Var = (f5) view;
        ArrayList arrayList3 = this.y;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i10);
            if (tLObject instanceof TLRPC.User) {
                f5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                f5Var.setChat((TLRPC.Chat) tLObject);
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
                        ec ecVar = f5Var.b;
                        TextView textView2 = f5Var.c;
                        u8 u8Var = f5Var.d;
                        k9 k9Var2 = f5Var.a;
                        f5Var.a();
                        if (user != null) {
                            k9Var2.setVisibility(0);
                            u8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                k9Var2.setImageDrawable(u8Var);
                            } else {
                                k9Var2.e(user, u8Var);
                            }
                        } else {
                            k9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            wp wpVar = new wp(R.drawable.mini_ephemeral_hidden_14, 0);
                            wpVar.a(k6.A6);
                            wpVar.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            ecVar.setText(spannableStringBuilder);
                        } else {
                            ecVar.setText(str3);
                        }
                        textView2.setText(i6.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    f5Var.setEmojiSuggestion((hi) this.O.get(i10));
                }
            } else {
                f5Var.setText((String) this.J.get(i10));
            }
        }
        f5Var.setDivider(false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        e6 e6Var = this.I0;
        Context context = this.h;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    org.telegram.ui.Cells.g0 g0Var = new org.telegram.ui.Cells.g0(context);
                    TextView textView = new TextView(context);
                    g0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    r6.V(textView, k6.rf, null);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(bd.a0 ? 5 : 3);
                    g0Var.addView(textView, mf.d(-2, -2.0f, (bd.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view2 = g0Var;
                } else if (i3 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    r6.V(textView2, k6.z6, e6Var);
                    view2 = textView2;
                } else if (i3 != 5) {
                    boolean z10 = this.s;
                    if (i3 == 6) {
                        view2 = new c1(context, e6Var, z10);
                    } else if (i3 != 7) {
                        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context);
                        w7Var.w = e6Var;
                        k9 k9Var = new k9(context);
                        w7Var.a = k9Var;
                        k9Var.setAspectFit(true);
                        k9Var.setLayerNum(1);
                        w7Var.addView(k9Var, mf.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        w7Var.setFocusable(true);
                        vg.y0 y0Var = new vg.y0(1, context, null);
                        w7Var.n = y0Var;
                        y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                        y0Var.setImageReceiver(k9Var.getImageReceiver());
                        w7Var.addView(y0Var, mf.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = w7Var;
                    } else {
                        View smVar = new sm(context, 6);
                        ColorDrawable colorDrawable = new ColorDrawable(z10 ? k6.r1(0.15f, -1) : k6.w0(k6.a7, e6Var));
                        if (!z10) {
                            r6.y(smVar, colorDrawable, k6.a7, e6Var, PorterDuff.Mode.SRC_IN);
                        }
                        xp xpVar = new xp(colorDrawable, k6.X0(context, R.drawable.greydivider, k6.w0(k6.b7, e6Var)), 0, 0);
                        xpVar.x = true;
                        smVar.setBackground(xpVar);
                        view = smVar;
                    }
                } else {
                    view = new lg.q1(context, e6Var, false);
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new r0(this));
                view2 = h2Var;
            }
            return new bj0(view2);
        }
        f5 f5Var = new f5(context, e6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        view2 = view;
        return new bj0(view2);
    }
}
