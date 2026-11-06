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
import bi.md;
import bi.u3;
import c8.ha;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.ps;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i1 extends oj0 implements ls {
    public ArrayList A0;
    public HashMap B0;
    public a0.h D;
    public String D0;
    public d1 E;
    public int E0;
    public String F;
    public t0 F0;
    public g1 G;
    public an G0;
    public g1 H;
    public final f6 H0;
    public ArrayList I;
    public ArrayList J;
    public final ab.b0 J0;
    public ArrayList K;
    public Object[] K0;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final b90 V;
    public a0.h W;
    public int X;
    public int Y;
    public String Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public ArrayList d0;
    public int g0;
    public final Context h;
    public int i0;
    public int j0;
    public boolean k0;
    public TLRPC.Chat l0;
    public long n;
    public e1 n0;
    public boolean o0;
    public fi.x1 p0;
    public String q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public int t0;
    public int u0;
    public boolean v0;
    public TLRPC.ChatFull w;
    public TLRPC.User w0;
    public final z1 x;
    public boolean x0;
    public ArrayList y;
    public z0 y0;
    public Location z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = p10.s0;
    public boolean e0 = true;
    public boolean f0 = true;
    public boolean h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final y0 I0 = new y0(this, new x0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public i1(Context context, long j3, long j10, b90 b90Var, f6 f6Var, boolean z9) {
        this.H0 = f6Var;
        this.h = context;
        this.V = b90Var;
        this.n = j3;
        this.s = z9;
        this.r = j10;
        z1 z1Var = new z1(true);
        this.x = z1Var;
        z1Var.a = new h9.f1(this, 3);
        ab.b0 b0Var = (ab.b0) new ps(qs.f(this.f), this).b;
        b0Var.c(qs.X0);
        b0Var.c(qs.x0);
        this.J0 = b0Var;
        b0Var.c(qs.Y1);
        b0Var.c(qs.Z1);
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

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return (this.w0 == null || this.h0) && this.A0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (p10.i(this.f).q() || !ij.Y3(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new h1(str, document));
                this.B0.put(str2, document);
                e1 e1Var = this.n0;
                if (e1Var != null) {
                    e1Var.a();
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
            HashMap hashMap = this.B0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (p10.i(this.f).q() || !ij.Y3(document))) {
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
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new h1(obj, document));
                this.B0.put(str2, document);
            }
            i7++;
            obj = obj;
        }
    }

    public final void G() {
        an anVar = this.G0;
        if (anVar == null || anVar.getParentActivity() == null) {
            return;
        }
        if (this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.I0.o();
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i7 = 0; i7 < min; i7++) {
            h1 h1Var = (h1) this.A0.get(i7);
            TLRPC.PhotoSize w10 = w7.w(h1Var.a.thumbs, 90, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
                w7.G(this.f);
                if (!w7.J(w10, "webp", true, true).exists()) {
                    arrayList.add(w7.r("webp", w10));
                    w7.G(this.f).V(hc.c(w10, h1Var.a), h1Var.b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.w0;
        if (user == null || user.id == this.S) {
            return this.T;
        }
        return null;
    }

    public final Object J(int i7) {
        String str;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i7 >= 2) {
                i7 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i7 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i7 >= 0 && i7 < arrayList2.size()) {
                        return this.R.get(i7);
                    }
                } else if (i7 == 0) {
                    return tL_inlineBotWebView;
                }
                i7--;
                if (i7 >= 0) {
                    return this.R.get(i7);
                }
            } else {
                ArrayList arrayList3 = this.y;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i7 >= 0 && i7 < arrayList6.size()) {
                                        return this.M.get(i7);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i7 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i7 >= 0 && i7 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 == null || (this.g0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.J.get(i7);
                                    } else if (arrayList9.get(i7) != null) {
                                        user = (TLRPC.User) this.P.get(i7);
                                        str = String.format("%s@%s", this.J.get(i7), user != null ? t10.n(user) : "");
                                    } else {
                                        str = String.format("%s", this.J.get(i7));
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i7)).booleanValue()) {
                                        return str;
                                    }
                                    return new f1(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i7 >= 0 && i7 < arrayList5.size()) {
                            return this.N.get(i7);
                        }
                    } else if (i7 >= 0 && i7 < arrayList4.size()) {
                        return this.I.get(i7);
                    }
                } else if (i7 >= 0 && i7 < arrayList3.size()) {
                    return this.y.get(i7);
                }
            }
        } else if (i7 >= 0 && i7 < arrayList.size()) {
            return ((h1) this.A0.get(i7)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i7 = 1;
        if (this.w0 != null && !this.h0) {
            return 1;
        }
        int i10 = this.F != null ? 2 : 0;
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i7 = 0;
                }
                return size2 + i7 + i10;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 == null) {
                        return i10;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.M;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.J;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i10;
    }

    public final Object L(int i7) {
        if (this.F != null) {
            if (i7 < 2) {
                return null;
            }
            i7 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i7 < 0 || i7 >= arrayList.size()) {
            return null;
        }
        return ((h1) this.A0.get(i7)).b;
    }

    public final int M(int i7) {
        if (this.F != null) {
            if (i7 < 2) {
                return 0;
            }
            i7 -= 2;
        }
        return this.R != null ? (this.T == null && this.U == null) ? i7 : i7 - 1 : i7;
    }

    public final boolean N() {
        return this.A0 != null;
    }

    public final void P() {
        y0 y0Var = this.I0;
        if (y0Var != null) {
            y0Var.p();
        }
        z0 z0Var = this.y0;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.y0 = null;
        }
        if (this.t0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
            this.t0 = 0;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        this.w0 = null;
        this.T = null;
        this.h0 = true;
        this.q0 = null;
        this.r0 = null;
        this.v0 = false;
        this.J0.b();
    }

    public final void Q() {
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.z0 = location;
        location.setLatitude(-1000.0d);
        this.z0.setLongitude(-1000.0d);
        T(true, this.w0, this.r0, "");
    }

    public final void R(TLRPC.User user) {
        an anVar;
        TLRPC.Chat chat;
        this.t0 = 0;
        this.I0.p();
        b90 b90Var = this.V;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.w0 = null;
            this.T = null;
            this.h0 = true;
        } else {
            this.w0 = user;
            long j3 = user.id;
            if (j3 != this.S) {
                this.T = null;
                this.S = j3;
            }
            an anVar2 = this.G0;
            if (anVar2 != null && (chat = anVar2.e) != null) {
                boolean t6 = t3.t(chat);
                this.h0 = t6;
                if (!t6) {
                    f();
                    b90Var.a(true);
                    return;
                }
            }
            if (this.w0.bot_inline_geo) {
                if (qp.s1(this.f).d7.getBoolean("inlinegeo_" + this.w0.id, false) || (anVar = this.G0) == null || anVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    String M0 = hd.M0(2131745424, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = hd.M0(2131745425, null);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(hd.M0(2131747830, null), new a3.h(this, zArr, user2, 13));
                    alertDialog$Builder.h(hd.M0(2131752589, null), new ab.g(17, this, zArr));
                    this.G0.showDialog(u1Var, new u3(this, zArr, 4));
                }
            }
        }
        if (this.w0 == null) {
            this.v0 = true;
            this.T = null;
        } else {
            if (b90Var != null) {
                b90Var.b(true);
            }
            T(true, this.w0, this.r0, "");
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
        TLRPC.User user = this.w0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.r0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.w0;
            b90 b90Var = this.V;
            if (user2 != null) {
                if (!this.h0 && str != null && str2 != null) {
                    return;
                } else {
                    b90Var.a(false);
                }
            }
            z0 z0Var = this.y0;
            if (z0Var != null) {
                org.telegram.messenger.g0.r(z0Var);
                this.y0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.q0) != null && !str3.equals(str))) {
                if (this.t0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
                    this.t0 = 0;
                }
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                this.w0 = null;
                this.T = null;
                this.h0 = true;
                this.q0 = null;
                this.r0 = null;
                this.I0.p();
                this.v0 = false;
                if (b90Var != null) {
                    b90Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (b90Var != null) {
                    if (this.w0 != null) {
                        b90Var.b(true);
                    } else if (str.equals("gif")) {
                        this.q0 = "gif";
                        b90Var.b(false);
                    }
                }
                qp s12 = qp.s1(this.f);
                yr a02 = yr.a0(this.f);
                this.r0 = str2;
                z0 z0Var2 = new z0(this, str2, str, s12, a02);
                this.y0 = z0Var2;
                org.telegram.messenger.g0.i3(z0Var2, 400L);
                return;
            }
            if (this.u0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                this.u0 = 0;
            }
            this.r0 = null;
            if (b90Var != null) {
                b90Var.b(false);
            }
        }
    }

    public final void T(final boolean z9, final TLRPC.User user, final String str, final String str2) {
        Location location;
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (!this.h0 || !this.d) {
            b90 b90Var = this.V;
            if (b90Var != null) {
                b90Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.r0 = null;
            return;
        }
        if (user.bot_inline_geo && this.z0 == null) {
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
        sb2.append((!user.bot_inline_geo || this.z0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.z0.getLongitude() + this.z0.getLatitude()));
        final String sb3 = sb2.toString();
        final yr a02 = yr.a0(this.f);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: jg.v0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new w0(i1.this, str, z9, tLObject, user, str2, a02, sb3));
            }
        };
        long j3 = user.id;
        if (j3 != this.S) {
            this.T = null;
            this.S = j3;
        }
        if (z9) {
            a02.M(sb3, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = qp.s1(this.f).q1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.z0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = org.telegram.messenger.g0.b0(this.z0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.g0.b0(this.z0.getLongitude());
        }
        if (m5.C(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = qp.s1(this.f).j1(this.n);
        }
        this.u0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
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
    
        r27.Z = r7;
        r27.c0 = r3;
        r27.d0 = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0416, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04bb, code lost:
    
        r27.X = r13;
        r27.Y = r14.length() + r15;
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
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.b90] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, jg.i1, v4.g0] */
    /* JADX WARN: Type inference failed for: r3v24, types: [jg.g1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i7, ArrayList arrayList, boolean z9, boolean z10) {
        String str;
        boolean z11;
        String str2;
        int i10;
        ArrayList arrayList2;
        char c10;
        String str3;
        an anVar;
        char c11;
        int i11;
        String str4;
        String str5;
        boolean z12;
        char c12;
        int i12;
        ?? r11;
        boolean z13;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j3;
        TLRPC.Chat M0;
        TLRPC.ChatFull chatFull;
        int i13;
        long j10;
        String str8;
        String n10;
        String str9;
        TLRPC.Chat chat;
        long j11;
        boolean z14;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        String str10;
        char c13;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.l0;
        an anVar2 = this.G0;
        if (anVar2 != null) {
            chat3 = anVar2.e;
            anVar2.j();
        }
        TLRPC.Chat chat4 = chat3;
        fi.x1 x1Var = this.p0;
        if (x1Var != null) {
            org.telegram.messenger.g0.r(x1Var);
            this.p0 = null;
        }
        if (this.j0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.j0, true);
            this.j0 = 0;
        }
        d1 d1Var = this.E;
        if (d1Var != null) {
            org.telegram.messenger.g0.r(d1Var);
            this.E = null;
        }
        t0 t0Var = this.F0;
        if (t0Var != null) {
            org.telegram.messenger.g0.r(t0Var);
            this.F0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.V;
        if (isEmpty || charSequence2.length() > qp.s1(this.f).u1()) {
            S(null, null);
            r12.a(false);
            this.Z = null;
            this.D0 = null;
            this.A0 = null;
            this.B0 = null;
            f();
            this.o0 = false;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, true);
                this.E0 = 0;
            }
            e1 e1Var = this.n0;
            if (e1Var != null) {
                e1Var.a();
                return;
            }
            return;
        }
        int i14 = charSequence2.length() > 0 ? i7 - 1 : i7;
        this.Z = null;
        this.b0 = z9;
        this.a0 = z10;
        StringBuilder sb2 = new StringBuilder();
        boolean z15 = !z9 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z15) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            z11 = true;
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
            this.D0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            z11 = true;
            str2 = str;
        }
        boolean z16 = (z15 && (i6.h(str2) || i6.h(this.D0))) ? z11 : false;
        if (z16 && (charSequence instanceof Spanned)) {
            r5[] r5VarArr = (r5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), r5.class);
            z16 = (r5VarArr == null || r5VarArr.length == 0) ? z11 : false;
        }
        if (this.c && z16 && (chat4 == null || t3.t(chat4))) {
            ArrayList arrayList5 = this.C0;
            arrayList5.clear();
            int i17 = iz.E;
            if (i17 == 2 || !z16) {
                if (this.o0 && i17 == 2) {
                    this.o0 = false;
                    r12.a(false);
                    f();
                    return;
                }
                return;
            }
            this.A0 = null;
            this.B0 = null;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, z11);
                this.E0 = 0;
            }
            boolean z17 = qp.s1(this.f).a4;
            if (z17) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i10 = i7;
            } else {
                arrayList4 = arrayList5;
                i10 = i7;
                arrayList2 = arrayList;
                this.F0 = new t0((i1) this, charSequence, i10, arrayList, z9, z10);
                ui.b0(this.f).V0(0, false, true, false);
                ui.b0(this.f).V0(2, false, true, false);
                ArrayList arrayList6 = ui.b0(this.f).f0[0];
                ArrayList arrayList7 = ui.b0(this.f).f0[2];
                int min = Math.min(20, arrayList6.size());
                int i18 = 0;
                for (int i19 = 0; i19 < min; i19++) {
                    TLRPC.Document document = (TLRPC.Document) arrayList6.get(i19);
                    if (O(document, this.D0)) {
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
                    if (O(document2, this.D0)) {
                        E(document2, "fav");
                    }
                }
                ui.b0(this.f).B(0);
                HashMap hashMap = ui.b0(this.f).d0;
                ArrayList arrayList8 = hashMap != null ? (ArrayList) hashMap.get(this.D0) : null;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    F(null, arrayList8);
                }
                ArrayList arrayList9 = this.A0;
                if (arrayList9 != null) {
                    Collections.sort(arrayList9, new a1(arrayList7, arrayList6));
                }
            }
            if (iz.E == 0 || z17) {
                String str12 = this.D0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.E0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new bi.j(17, this, str12));
            }
            ArrayList arrayList10 = this.A0;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                if (iz.E != 0 || this.A0.size() >= 5) {
                    H();
                    r12.a(arrayList4.isEmpty());
                    this.o0 = true;
                } else {
                    r12.a(false);
                    this.o0 = false;
                }
                f();
            } else if (this.o0) {
                r12.a(false);
                this.o0 = false;
            }
            c10 = ' ';
            c11 = 4;
            str3 = null;
        } else {
            i10 = i7;
            arrayList2 = arrayList;
            if (!z9 && this.f0 && charSequence2.charAt(0) == '@') {
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
                if (!this.c || (anVar = this.G0) == null || anVar.h != null || (!(chat4 == null || t3.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c11 = 65535;
        }
        if (this.w0 != null) {
            return;
        }
        qp s12 = qp.s1(this.f);
        String str13 = this.F;
        this.F = str3;
        z1 z1Var = this.x;
        if (z9) {
            sb2.append(charSequence2.substring(1));
            this.X = 0;
            this.Y = sb2.length();
            z13 = false;
            i14 = -1;
        } else {
            while (true) {
                if (i14 < 0) {
                    z12 = false;
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
                        boolean z18 = this.m0;
                        if (z18 || this.e0 || (this.f0 && i14 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (t3.V(chat4) && !TextUtils.isEmpty(t3.K(chat4, false))) {
                            String substring2 = charSequence2.substring(i14);
                            this.F = substring2;
                            if (substring2.length() < 4 || !this.F.matches("^[#$][\\p{L}_-]+$")) {
                                this.F = null;
                            }
                        }
                        if (!z1Var.s) {
                            yr.a0(z1Var.m).a.c(new w1(z1Var, 1));
                            this.Z = charSequence2;
                            this.c0 = i10;
                            this.d0 = arrayList2;
                            return;
                        }
                        this.X = i14;
                        c12 = 1;
                        this.Y = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        z12 = false;
                    } else if (i14 != 0 || this.W == null || charAt3 != '/') {
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
                        this.X = i14;
                        this.Y = sb2.length() + 1;
                        r11 = 0;
                        i14 = -1;
                        c12 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i14--;
            }
            this.X = i14;
            this.Y = sb2.length() + 1;
            z13 = false;
        }
        c12 = 0;
        r11 = z13;
        if (str13 == null && this.F != null) {
            o(r11, 2);
        } else if (str13 == null || this.F != null) {
            ?? r32 = this.G;
            if (r32 != 0) {
                r32.a(r11, this.F, chat4);
            }
            g1 g1Var = this.H;
            if (g1Var != null) {
                g1Var.a(1, this.F, chat4);
            }
        } else {
            p(r11, 2);
        }
        if (c12 == 65535) {
            this.x0 = r11;
            this.R = null;
            r12.a(r11);
            return;
        }
        if (c12 != 0) {
            if (c12 == 1) {
                ArrayList arrayList11 = new ArrayList();
                String lowerCase = sb2.toString().toLowerCase();
                ArrayList arrayList12 = z1Var.q;
                for (int i24 = 0; i24 < arrayList12.size(); i24++) {
                    x1 x1Var2 = (x1) arrayList12.get(i24);
                    if (x1Var2 != null && (str7 = x1Var2.a) != null && str7.startsWith(lowerCase)) {
                        arrayList11.add(x1Var2.a);
                    }
                }
                this.I = arrayList11;
                this.A0 = null;
                this.y = null;
                this.D = null;
                this.M = null;
                this.J = null;
                this.Q = null;
                this.K = null;
                this.P = null;
                this.N = null;
                this.x0 = false;
                this.R = null;
                f();
                r12.a((this.I.isEmpty() && this.F == null) ? false : true);
                return;
            }
            if (c12 != 2) {
                if (c12 == 3) {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    if (!Arrays.equals(G0, this.O)) {
                        ui.b0(this.f).M(G0, false);
                    }
                    this.O = G0;
                    ui.b0(this.f).U(this.O, sb2.toString(), false, new u0(this), iz.F && p10.i(this.f).q());
                    return;
                }
                if (c12 == 4) {
                    this.I = null;
                    this.y = null;
                    this.D = null;
                    this.N = null;
                    this.J = null;
                    this.Q = null;
                    this.M = null;
                    this.K = null;
                    this.P = null;
                    return;
                }
                return;
            }
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            String lowerCase2 = sb2.toString().toLowerCase();
            for (int i25 = 0; i25 < this.W.m(); i25++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.W.n(i25);
                for (int i26 = 0; i26 < botInfo.commands.size(); i26++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i26);
                    if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                        arrayList13.add("/" + botCommand.command);
                        arrayList14.add(botCommand.description);
                        arrayList15.add(s12.a2(Long.valueOf(botInfo.user_id)));
                        arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            if (this.G0 != null && !m5.C(this.n)) {
                an anVar3 = this.G0;
                if (anVar3.f4 == 0 && anVar3.j() != null && !this.G0.j().bot && !t10.z(this.G0.j()) && !t10.A(this.G0.j().id)) {
                    kg.t1 f10 = kg.t1.f(this.f);
                    ArrayList arrayList17 = f10.b;
                    f10.h();
                    this.L = lowerCase2;
                    this.M = new ArrayList();
                    for (int i27 = 0; i27 < arrayList17.size(); i27++) {
                        kg.s1 s1Var = (kg.s1) arrayList17.get(i27);
                        if (!kg.t1.g(s1Var.b)) {
                            String lowerCase3 = s1Var.b.toLowerCase();
                            if (lowerCase3.startsWith(lowerCase2) || org.telegram.messenger.g0.O3(lowerCase3).startsWith(lowerCase2)) {
                                this.M.add(s1Var);
                            }
                        }
                    }
                    r62 = 0;
                    this.I = r62;
                    this.A0 = r62;
                    this.y = r62;
                    this.D = r62;
                    this.N = r62;
                    this.J = arrayList13;
                    this.K = arrayList14;
                    this.P = arrayList15;
                    this.Q = arrayList16;
                    this.x0 = false;
                    this.R = r62;
                    f();
                    r12.a(arrayList13.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
                    return;
                }
            }
            r62 = 0;
            this.L = null;
            this.M = null;
            this.I = r62;
            this.A0 = r62;
            this.y = r62;
            this.D = r62;
            this.N = r62;
            this.J = arrayList13;
            this.K = arrayList14;
            this.P = arrayList15;
            this.Q = arrayList16;
            this.x0 = false;
            this.R = r62;
            f();
            r12.a(arrayList13.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
            return;
        }
        this.x0 = r11;
        this.R = null;
        ArrayList arrayList18 = new ArrayList();
        if (arrayList2 != null) {
            for (int i28 = 0; i28 < Math.min(100, arrayList2.size()); i28++) {
                long Z0 = ((ij) arrayList2.get(i28)).Z0();
                if (Z0 > 0 && !arrayList18.contains(Long.valueOf(Z0))) {
                    arrayList18.add(Long.valueOf(Z0));
                }
            }
        }
        String lowerCase4 = sb2.toString().toLowerCase();
        boolean z19 = lowerCase4.indexOf(c10) >= 0;
        ArrayList arrayList19 = new ArrayList();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        ArrayList arrayList20 = new ArrayList();
        arrayList20.addAll(ui.b0(this.f).j1);
        if (chat4 == null || (!t3.p0(chat4) && !t3.V(chat4))) {
            arrayList20.addAll(ui.b0(this.f).k1);
        }
        List.-EL.sort(arrayList20, new x(1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList20.size();
        int i29 = 0;
        while (i29 < size2) {
            Object obj = arrayList20.get(i29);
            i29++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(m5.o(tL_topPeer.peer)), tL_topPeer);
        }
        ArrayList arrayList21 = new ArrayList(linkedHashMap.values());
        if (!z9 && this.f0 && i14 == 0 && !arrayList21.isEmpty()) {
            int i30 = 0;
            for (int i31 = 0; i31 < arrayList21.size(); i31++) {
                TLRPC.User a22 = s12.a2(Long.valueOf(((TLRPC.TL_topPeer) arrayList21.get(i31)).peer.user_id));
                if (a22 != null) {
                    String n11 = t10.n(a22);
                    if (!TextUtils.isEmpty(n11) && (lowerCase4.length() == 0 || n11.toLowerCase().startsWith(lowerCase4))) {
                        arrayList19.add(a22);
                        hVar.k(a22, a22.id);
                        hVar2.k(a22, a22.id);
                        i30++;
                    }
                    if (i30 == 5) {
                        break;
                    }
                }
            }
        }
        an anVar4 = this.G0;
        if (anVar4 != null) {
            chat4 = anVar4.e;
            j3 = anVar4.r4;
        } else {
            TLRPC.ChatFull chatFull2 = this.w;
            if (chatFull2 != null) {
                chat4 = s12.M0(Long.valueOf(chatFull2.id));
            }
            j3 = 0;
        }
        ?? f11 = p10.i(this.f).f();
        if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!t3.T(chat4) || chat4.megagroup)) {
            int i32 = -2;
            int i33 = -2;
            while (i33 < this.w.participants.participants.size()) {
                if (i33 != i32) {
                    i13 = i33;
                    if (i13 == -1) {
                        if (z10) {
                            if (lowerCase4.length() == 0) {
                                arrayList19.add(chat4);
                            } else {
                                String str14 = chat4.title;
                                n10 = t3.K(chat4, false);
                                j10 = j3;
                                chat2 = chat4;
                                chat = f11;
                                j11 = -chat4.id;
                                str8 = str14;
                                str9 = null;
                                if (TextUtils.isEmpty(n10)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z14) {
                                }
                            }
                        }
                        z14 = z19;
                        j10 = j3;
                        chat = f11;
                    } else {
                        TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i13);
                        if (f11 != null) {
                            j10 = j3;
                        } else {
                            j10 = j3;
                        }
                        ?? a23 = s12.a2(Long.valueOf(chatParticipant.user_id));
                        if (a23 != 0 && !t10.B(a23) && hVar.h(a23.id) < 0) {
                            if (lowerCase4.length() != 0 || a23.deleted) {
                                str8 = a23.first_name;
                                String str15 = a23.last_name;
                                n10 = t10.n(a23);
                                str9 = str15;
                                chat = f11;
                                j11 = a23.id;
                                chat2 = a23;
                                if (TextUtils.isEmpty(n10)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z14) {
                                }
                            } else {
                                arrayList19.add(a23);
                            }
                        }
                        z14 = z19;
                        chat = f11;
                    }
                } else if (f11 == null || !z9) {
                    z14 = z19;
                    j10 = j3;
                    i13 = i33;
                    chat = f11;
                } else {
                    str8 = f11.first_name;
                    str9 = f11.last_name;
                    n10 = t10.n(f11);
                    j10 = j3;
                    TLRPC.Chat chat5 = f11;
                    j11 = f11.id;
                    i13 = i33;
                    chat = chat5;
                    chat2 = chat5;
                    if (TextUtils.isEmpty(n10)) {
                        z14 = z19;
                    } else {
                        z14 = z19;
                    }
                    if (!TextUtils.isEmpty(str8)) {
                    }
                    if (!TextUtils.isEmpty(str9)) {
                    }
                    if (!z14) {
                        if (g5.m(0, str8, str9).toLowerCase().startsWith(lowerCase4)) {
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
                z19 = z14;
            }
        }
        boolean z20 = z19;
        long j12 = j3;
        if (this.m0) {
            ArrayList arrayList22 = qp.s1(this.f).y;
            for (int i35 = 0; i35 < arrayList22.size(); i35++) {
                if (((TLRPC.Dialog) arrayList22.get(i35)).id > 0) {
                    TLRPC.User a24 = s12.a2(Long.valueOf(((TLRPC.Dialog) arrayList22.get(i35)).id));
                    if (a24 != null && !t10.B(a24) && hVar.h(a24.id) < 0) {
                        if (lowerCase4.length() != 0 || a24.deleted) {
                            String str16 = a24.first_name;
                            String str17 = a24.last_name;
                            String n12 = t10.n(a24);
                            long j13 = a24.id;
                            if ((!TextUtils.isEmpty(n12) && n12.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z20 && g5.m(0, str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                arrayList19.add(a24);
                                hVar2.k(a24, j13);
                            }
                        } else {
                            arrayList19.add(a24);
                        }
                    }
                } else if (!TextUtils.isEmpty(lowerCase4) && (M0 = s12.M0(Long.valueOf(-((TLRPC.Dialog) arrayList22.get(i35)).id))) != null && M0.username != null && hVar.h(M0.id) < 0) {
                    if (lowerCase4.length() == 0) {
                        arrayList19.add(M0);
                    } else {
                        String str18 = M0.title;
                        String str19 = M0.username;
                        long j14 = M0.id;
                        if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                            arrayList19.add(M0);
                            hVar2.k(M0, j14);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList19, new b1(hVar2, arrayList18));
        this.I = null;
        this.A0 = null;
        this.M = null;
        this.J = null;
        this.Q = null;
        this.K = null;
        this.P = null;
        this.N = null;
        if (((chat4 == null || !chat4.megagroup) && !this.m0) || lowerCase4.length() <= 0) {
            Y(hVar2, arrayList19, true);
            return;
        }
        if (arrayList19.size() < 5) {
            fi.x1 x1Var3 = new fi.x1(this, arrayList19, hVar2, 19);
            this.p0 = x1Var3;
            org.telegram.messenger.g0.i3(x1Var3, 1000L);
        } else {
            Y(hVar2, arrayList19, true);
        }
        d1 d1Var2 = new d1(this, chat4, lowerCase4, j12, arrayList19, hVar2, s12);
        this.E = d1Var2;
        org.telegram.messenger.g0.i3(d1Var2, 200L);
    }

    public final void V(boolean z9) {
        this.c = z9;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        an anVar;
        TLRPC.Chat chat;
        this.f = p10.s0;
        this.w = chatFull;
        if (!this.h0 && this.w0 != null && (anVar = this.G0) != null && (chat = anVar.e) != null) {
            boolean t6 = t3.t(chat);
            this.h0 = t6;
            if (t6) {
                this.y = null;
                f();
                this.V.a(false);
                R(this.w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.c0, this.d0, this.b0, this.a0);
        }
    }

    public final void X(an anVar) {
        this.G0 = anVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z9) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || t10.A(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.D = hVar;
        fi.x1 x1Var = this.p0;
        if (x1Var != null) {
            org.telegram.messenger.g0.r(x1Var);
            this.p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z9) {
            f();
            this.V.a(!this.y.isEmpty());
        }
    }

    @Override // v4.g0
    public final int b() {
        int K = K();
        this.M0 = K;
        return K;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (this.F != null) {
            if (i7 < 2) {
                return 6;
            }
            i7 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.w0 != null && !this.h0) {
            return 3;
        }
        if (this.R == null) {
            ArrayList arrayList = this.M;
            return (arrayList == null || i7 < 0 || i7 >= arrayList.size()) ? 0 : 5;
        }
        if (i7 == 0) {
            return (this.T == null && this.U == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t0 t0Var;
        if (i7 == qs.Y1 || i7 == qs.Z1) {
            ArrayList arrayList = this.A0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.C0;
            if (arrayList2.isEmpty() || !this.o0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.V.a(K() > 0);
                return;
            }
            return;
        }
        if (i7 == qs.X0) {
            t0 t0Var2 = this.F0;
            if (t0Var2 != null) {
                org.telegram.messenger.g0.h3(t0Var2);
                this.F0 = null;
                return;
            }
            return;
        }
        if (i7 == qs.x0 && ((Integer) objArr[0]).intValue() == 0 && (t0Var = this.F0) != null) {
            org.telegram.messenger.g0.h3(t0Var);
            this.F0 = null;
        }
    }

    @Override // v4.g0
    public final void f() {
        qi qiVar;
        String str;
        String str2;
        int i7 = this.M0;
        b90 b90Var = this.V;
        int i10 = 0;
        if (i7 != -1 && this.K0 != null) {
            int K = K();
            this.M0 = K;
            boolean z9 = i7 != K;
            int min = Math.min(i7, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.K0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof kg.s1)) {
                            if (obj != obj2 && ((!(obj instanceof h1) || !(obj2 instanceof h1) || ((h1) obj).a != ((h1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof qi) && (obj2 instanceof qi) && (str = (qiVar = (qi) obj).b) != null) {
                                    qi qiVar2 = (qi) obj2;
                                    if (str.equals(qiVar2.b) && (str2 = qiVar.a) != null && str2.equals(qiVar2.a)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                g(i10);
                z9 = true;
                i10++;
            }
            p(min, i7 - min);
            o(min, K - min);
            if (z9 && b90Var != null) {
                b90Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (b90Var != null) {
            this.M0 = K();
            b90Var.c();
        }
        super.f();
        int K2 = K();
        this.M0 = K2;
        this.K0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.K0;
            if (i10 >= objArr3.length) {
                return;
            }
            objArr3[i10] = J(i10);
            i10++;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        an anVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.F;
        int i10 = str != null ? i7 - 2 : i7;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 4) {
            x7 x7Var = (x7) view;
            if (i10 < 0 || i10 >= this.A0.size()) {
                return;
            }
            h1 h1Var = (h1) this.A0.get(i10);
            TLRPC.Document document = h1Var.a;
            Object obj = h1Var.b;
            ug.z0 z0Var = x7Var.n;
            l9 l9Var = x7Var.a;
            x7Var.c = obj;
            boolean Y3 = ij.Y3(document);
            x7Var.s = Y3;
            if (Y3) {
                z0Var.setColor(k6.x0(null, k6.d6, false));
                z0Var.H = true;
                z0Var.I = false;
                z0Var.invalidate();
            }
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 90, false, null, false);
            rz f11 = t5.f(document, k6.a7, 1.0f, x7Var.w);
            if (!ij.p(document)) {
                f10 = 1.0f;
                if (f11 == null) {
                    l9Var.k(hc.c(w10, document), null, "webp", null, x7Var.c);
                } else if (w10 != null) {
                    l9Var.k(hc.c(w10, document), null, "webp", f11, x7Var.c);
                } else {
                    l9Var.k(hc.b(document), null, "webp", f11, x7Var.c);
                }
            } else if (f11 != null) {
                l9Var.k(hc.b(document), "80_80", null, f11, x7Var.c);
                f10 = 1.0f;
            } else if (w10 != null) {
                f10 = 1.0f;
                l9Var.l(hc.b(document), "80_80", hc.c(w10, document), null, 0, x7Var.c);
            } else {
                f10 = 1.0f;
                l9Var.k(hc.b(document), "80_80", null, null, x7Var.c);
            }
            x7Var.b = document;
            Drawable background = x7Var.getBackground();
            if (background != null) {
                background.setAlpha(qs.G3);
                r6.y(x7Var, background, k6.qf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (x7Var.s) {
                x7Var.r = true;
            } else {
                x7Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z0Var.getLayoutParams();
            if (p10.i(p10.s0).q()) {
                int L = org.telegram.messenger.g0.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                z0Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
            } else {
                int L2 = org.telegram.messenger.g0.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            }
            z0Var.setLocked(!p10.i(p10.s0).q());
            org.telegram.messenger.g0.Z3(z0Var, x7Var.r, 0.9f, true, false);
            x7Var.invalidate();
            x7Var.setClearsInputField(true);
            return;
        }
        if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.e;
            if (chat != null) {
                if (!t3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(hd.M0(2131749543, null));
                    return;
                } else if (org.telegram.messenger.g0.D1(chat.banned_rights)) {
                    textView.setText(hd.M0(2131753967, null));
                    return;
                } else {
                    textView.setText(hd.a0("AttachInlineRestricted", null, 2131753968, hd.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i11 == 5) {
            kg.p1 p1Var = (kg.p1) view;
            ArrayList arrayList = this.M;
            if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            p1Var.a((kg.s1) this.M.get(i10), this.L, false);
            return;
        }
        ArrayList arrayList2 = this.R;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
            boolean z9 = (tL_inlineBotSwitchPM == null && this.U == null) ? false : true;
            if (i11 == 2) {
                if (z9) {
                    ((org.telegram.ui.Cells.g0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.U.text);
                    return;
                }
                return;
            } else {
                if (z9) {
                    i10--;
                }
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                ((h2) view).e((TLRPC.BotInlineResult) this.R.get(i10), this.w0, this.x0, i10 != this.R.size() - 1, z9 && i10 == 0, "gif".equals(this.q0));
                return;
            }
        }
        if (i11 == 6) {
            g1 g1Var = (g1) view;
            int i12 = i10 + 2;
            if (i12 == 0) {
                this.G = g1Var;
            } else {
                this.H = g1Var;
            }
            TLRPC.Chat chat2 = this.l0;
            if (chat2 == null && (anVar = this.G0) != null) {
                chat2 = anVar.e;
            }
            g1Var.a(i12, str, chat2);
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
            ArrayList arrayList4 = this.I;
            if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.N;
                if (arrayList5 == null || i10 < 0 || i10 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.J;
                    if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                        ArrayList arrayList7 = this.K;
                        String str2 = (arrayList7 == null || i10 < 0 || i10 >= arrayList7.size()) ? null : (String) this.K.get(i10);
                        ArrayList arrayList8 = this.P;
                        TLRPC.User user = (arrayList8 == null || i10 < 0 || i10 >= arrayList8.size()) ? null : (TLRPC.User) this.P.get(i10);
                        ArrayList arrayList9 = this.Q;
                        boolean booleanValue = ((arrayList9 == null || i10 < 0 || i10 >= arrayList9.size()) ? null : (Boolean) this.Q.get(i10)).booleanValue();
                        String str3 = (String) this.J.get(i10);
                        md mdVar = f5Var.b;
                        TextView textView2 = f5Var.c;
                        w8 w8Var = f5Var.d;
                        l9 l9Var2 = f5Var.a;
                        f5Var.a();
                        if (user != null) {
                            l9Var2.setVisibility(0);
                            w8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                l9Var2.setImageDrawable(w8Var);
                            } else {
                                l9Var2.e(user, w8Var);
                            }
                        } else {
                            l9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            wp wpVar = new wp(R.drawable.mini_ephemeral_hidden_14, 0);
                            wpVar.a(k6.A6);
                            wpVar.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            mdVar.setText(spannableStringBuilder);
                        } else {
                            mdVar.setText(str3);
                        }
                        textView2.setText(i6.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    f5Var.setEmojiSuggestion((qi) this.N.get(i10));
                }
            } else {
                f5Var.setText((String) this.I.get(i10));
            }
        }
        f5Var.setDivider(false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        f6 f6Var = this.H0;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    org.telegram.ui.Cells.g0 g0Var = new org.telegram.ui.Cells.g0(context);
                    TextView textView = new TextView(context);
                    g0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    r6.V(textView, k6.rf, null);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(hd.a0 ? 5 : 3);
                    g0Var.addView(textView, ha.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view2 = g0Var;
                } else if (i7 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    r6.V(textView2, k6.z6, f6Var);
                    view2 = textView2;
                } else if (i7 != 5) {
                    boolean z9 = this.s;
                    if (i7 == 6) {
                        view2 = new g1(context, f6Var, z9);
                    } else if (i7 != 7) {
                        x7 x7Var = new x7(context);
                        x7Var.w = f6Var;
                        l9 l9Var = new l9(context);
                        x7Var.a = l9Var;
                        l9Var.setAspectFit(true);
                        l9Var.setLayerNum(1);
                        x7Var.addView(l9Var, ha.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        x7Var.setFocusable(true);
                        ug.z0 z0Var = new ug.z0(1, context, null);
                        x7Var.n = z0Var;
                        z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                        z0Var.setImageReceiver(l9Var.getImageReceiver());
                        x7Var.addView(z0Var, ha.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = x7Var;
                    } else {
                        View tmVar = new tm(context, 5);
                        ColorDrawable colorDrawable = new ColorDrawable(z9 ? k6.r1(0.15f, -1) : k6.w0(k6.a7, f6Var));
                        if (!z9) {
                            r6.y(tmVar, colorDrawable, k6.a7, f6Var, PorterDuff.Mode.SRC_IN);
                        }
                        xp xpVar = new xp(colorDrawable, k6.X0(context, R.drawable.greydivider, k6.w0(k6.b7, f6Var)), 0, 0);
                        xpVar.x = true;
                        tmVar.setBackground(xpVar);
                        view = tmVar;
                    }
                } else {
                    view = new kg.p1(context, f6Var, false);
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new u0(this));
                view2 = h2Var;
            }
            return new xi0(view2);
        }
        f5 f5Var = new f5(context, f6Var);
        f5Var.setIsDarkTheme(false);
        view = f5Var;
        view2 = view;
        return new xi0(view2);
    }
}
