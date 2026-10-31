package ag;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import bi.b6;
import bi.c4;
import bi.c6;
import bi.d4;
import bi.q4;
import bi.s6;
import bi.t4;
import bi.w6;
import bi.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.ap;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.bp;
import org.telegram.ui.e70;
import org.telegram.ui.fn;
import org.telegram.ui.i00;
import org.telegram.ui.iz;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.qp;
import org.telegram.ui.rx;
import org.telegram.ui.un;
import org.telegram.ui.zg;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:330:0x073d, code lost:
    
        if (r6 == null) goto L322;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c2  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        long cameraFlipElapsedMs;
        ArrayList arrayList;
        int i11;
        org.telegram.messenger.k1 e;
        String str;
        int i12;
        int i13 = 7;
        int i14 = 3;
        SQLiteCursor sQLiteCursor = null;
        r6 = null;
        r6 = null;
        org.telegram.messenger.g1 g1Var = null;
        sQLiteCursor = null;
        int i15 = 1;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.c;
                hs hsVar = (hs) this.d;
                boolean z11 = this.b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = hsVar.b.queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                arrayList2.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            } catch (Exception e7) {
                                e = e7;
                                z10 = true;
                                f8.g(e, z10);
                                break;
                            }
                        }
                        sQLiteCursor.dispose();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        int i16 = 0;
                        while (i16 < arrayList2.size()) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList2.get(i16);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (?? r92 = r7; r92 < tL_businessChatLink.entities.size(); r92++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(r92);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList5.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList5.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                            i16++;
                            r7 = false;
                        }
                        if (!arrayList5.isEmpty()) {
                            hsVar.n0(arrayList5, arrayList3, false);
                        }
                        if (!arrayList6.isEmpty()) {
                            hsVar.Q(TextUtils.join(",", arrayList6), arrayList4);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z10 = true;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.i0.g3(new n0(s0Var, arrayList2, arrayList3, arrayList4, z11, 0));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 1:
                ((ai.a) this.c).d1((q20) this.d, this.b, false);
                return;
            case 2:
                ((j20) this.c).a((Bitmap) this.d, Boolean.valueOf(this.b));
                return;
            case 3:
                d4 d4Var = (d4) this.c;
                z5 z5Var = (z5) this.d;
                boolean z12 = this.b;
                boolean z13 = !z12;
                b6 b6Var = z5Var.w;
                Iterator it = z5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    c6 m10 = b6Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w6.h(pagetablecell));
                        boolean z14 = spannableStringBuilder.length() > 0 && (s6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        w6.l(pagetablecell, z13);
                        if (!z12 && spannableStringBuilder.length() > 0) {
                            s6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z12 && z14) {
                            s6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        w6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z15 = spannableStringBuilder2.length() > 0 && (s6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        w6.l(m10.b, z13);
                        if (z12) {
                            if (z15) {
                                s6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            s6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        w6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                b6Var.invalidate();
                bi.k3 k3Var = z5Var.E;
                if (k3Var != null && z5Var.a != null) {
                    k3Var.a();
                }
                d4Var.P2();
                return;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                c4 c4Var = (c4) this.d;
                boolean z16 = this.b;
                c4Var.f.r3(true);
                t4.k(k2Var, z16, new q4(c4Var, 2));
                return;
            case 5:
                li.v vVar = (li.v) this.c;
                boolean z17 = this.b;
                Runnable runnable = (Runnable) this.d;
                if (vVar.f) {
                    vVar.F = z17;
                    Size size = z17 ? vVar.c : vVar.b;
                    vVar.a = size;
                    int i17 = z17 ? vVar.l : vVar.k;
                    vVar.j = i17;
                    vVar.m = z17 ? vVar.o : vVar.n;
                    li.g0 g0Var = vVar.N;
                    if (g0Var != null) {
                        g0Var.c = size;
                        g0Var.d = i17;
                        g0Var.q = li.g0.j(size, i17, false);
                        g0Var.r = li.g0.j(size, i17, true);
                        g0Var.A = false;
                        g0Var.z = 0L;
                    }
                    vVar.Q = -1L;
                    vVar.u0 = runnable;
                    vVar.i.b("GL dual input selected: input=" + (z17 ? 1 : 0));
                    return;
                }
                return;
            case 6:
                a4.l lVar = (a4.l) this.c;
                li.i iVar = (li.i) this.d;
                boolean z18 = this.b;
                li.x0 x0Var = (li.x0) lVar.b;
                int i18 = x0Var.Z;
                if (i18 == 7 || i18 == 8 || i18 == 9 || i18 == 10) {
                    return;
                }
                li.q0 q0Var = iVar.a;
                li.s0 s0Var2 = iVar.c;
                li.r0 r0Var = iVar.b;
                x0Var.s = q0Var;
                x0Var.t = r0Var;
                x0Var.u = s0Var2;
                x0Var.v = iVar.f;
                if (q0Var != li.q0.a) {
                    if (iVar.g) {
                        i10 = 2;
                        x0Var.a0 = i10;
                        x0Var.n();
                        li.p pVar = x0Var.m;
                        StringBuilder sb2 = new StringBuilder("camera configured: facing=");
                        sb2.append(q0Var);
                        sb2.append(", mode=");
                        sb2.append(r0Var);
                        sb2.append(", preview=");
                        sb2.append(iVar.d);
                        sb2.append(", recording=");
                        sb2.append(iVar.e);
                        sb2.append(", fps=");
                        sb2.append(s0Var2.a);
                        sb2.append(", maxZoom=");
                        sb2.append(x0Var.v);
                        sb2.append(", flash=");
                        int i19 = x0Var.a0;
                        sb2.append(i19 == 1 ? i19 != 2 ? i19 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                        sb2.append(", switch=");
                        sb2.append(z18);
                        pVar.b(sb2.toString());
                        if (z18) {
                        }
                        x0Var.y = false;
                        d50 d50Var = (d50) x0Var.d.a;
                        d50Var.o0 = true;
                        StringBuilder sb3 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb3.append(q0Var);
                        sb3.append(", elapsedMs=");
                        cameraFlipElapsedMs = d50Var.getCameraFlipElapsedMs();
                        sb3.append(cameraFlipElapsedMs);
                        f8.b(sb3.toString());
                        d50.m(d50Var);
                        x0Var.o();
                        return;
                    }
                    i10 = 1;
                    x0Var.a0 = i10;
                    x0Var.n();
                    li.p pVar2 = x0Var.m;
                    StringBuilder sb22 = new StringBuilder("camera configured: facing=");
                    sb22.append(q0Var);
                    sb22.append(", mode=");
                    sb22.append(r0Var);
                    sb22.append(", preview=");
                    sb22.append(iVar.d);
                    sb22.append(", recording=");
                    sb22.append(iVar.e);
                    sb22.append(", fps=");
                    sb22.append(s0Var2.a);
                    sb22.append(", maxZoom=");
                    sb22.append(x0Var.v);
                    sb22.append(", flash=");
                    int i192 = x0Var.a0;
                    sb22.append(i192 == 1 ? i192 != 2 ? i192 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb22.append(", switch=");
                    sb22.append(z18);
                    pVar2.b(sb22.toString());
                    if (z18) {
                    }
                    x0Var.y = false;
                    d50 d50Var2 = (d50) x0Var.d.a;
                    d50Var2.o0 = true;
                    StringBuilder sb32 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                    sb32.append(q0Var);
                    sb32.append(", elapsedMs=");
                    cameraFlipElapsedMs = d50Var2.getCameraFlipElapsedMs();
                    sb32.append(cameraFlipElapsedMs);
                    f8.b(sb32.toString());
                    d50.m(d50Var2);
                    x0Var.o();
                    return;
                }
                if (x0Var.f != null) {
                    i10 = 3;
                    x0Var.a0 = i10;
                    x0Var.n();
                    li.p pVar22 = x0Var.m;
                    StringBuilder sb222 = new StringBuilder("camera configured: facing=");
                    sb222.append(q0Var);
                    sb222.append(", mode=");
                    sb222.append(r0Var);
                    sb222.append(", preview=");
                    sb222.append(iVar.d);
                    sb222.append(", recording=");
                    sb222.append(iVar.e);
                    sb222.append(", fps=");
                    sb222.append(s0Var2.a);
                    sb222.append(", maxZoom=");
                    sb222.append(x0Var.v);
                    sb222.append(", flash=");
                    int i1922 = x0Var.a0;
                    sb222.append(i1922 == 1 ? i1922 != 2 ? i1922 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                    sb222.append(", switch=");
                    sb222.append(z18);
                    pVar22.b(sb222.toString());
                    if (!z18 || x0Var.y) {
                        x0Var.y = false;
                        d50 d50Var22 = (d50) x0Var.d.a;
                        d50Var22.o0 = true;
                        StringBuilder sb322 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                        sb322.append(q0Var);
                        sb322.append(", elapsedMs=");
                        cameraFlipElapsedMs = d50Var22.getCameraFlipElapsedMs();
                        sb322.append(cameraFlipElapsedMs);
                        f8.b(sb322.toString());
                        d50.m(d50Var22);
                        x0Var.o();
                        return;
                    }
                    return;
                }
                i10 = 1;
                x0Var.a0 = i10;
                x0Var.n();
                li.p pVar222 = x0Var.m;
                StringBuilder sb2222 = new StringBuilder("camera configured: facing=");
                sb2222.append(q0Var);
                sb2222.append(", mode=");
                sb2222.append(r0Var);
                sb2222.append(", preview=");
                sb2222.append(iVar.d);
                sb2222.append(", recording=");
                sb2222.append(iVar.e);
                sb2222.append(", fps=");
                sb2222.append(s0Var2.a);
                sb2222.append(", maxZoom=");
                sb2222.append(x0Var.v);
                sb2222.append(", flash=");
                int i19222 = x0Var.a0;
                sb2222.append(i19222 == 1 ? i19222 != 2 ? i19222 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
                sb2222.append(", switch=");
                sb2222.append(z18);
                pVar222.b(sb2222.toString());
                if (z18) {
                }
                x0Var.y = false;
                d50 d50Var222 = (d50) x0Var.d.a;
                d50Var222.o0 = true;
                StringBuilder sb3222 = new StringBuilder("RoundVideo camera flip session ready: facing=");
                sb3222.append(q0Var);
                sb3222.append(", elapsedMs=");
                cameraFlipElapsedMs = d50Var222.getCameraFlipElapsedMs();
                sb3222.append(cameraFlipElapsedMs);
                f8.b(sb3222.toString());
                d50.m(d50Var222);
                x0Var.o();
                return;
            case 7:
                ((CameraController) this.c).lambda$initCamera$4(this.b, (Runnable) this.d);
                return;
            case 8:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$52((ArrayList) this.d, this.b);
                return;
            case 9:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                View view = (View) this.d;
                boolean z19 = this.b;
                if (view instanceof v5) {
                    v5 v5Var = (v5) view;
                    if (v5Var.a) {
                        v5Var.a = false;
                        v5Var.invalidate();
                    }
                }
                if (z19) {
                    x1Var.dismiss();
                    return;
                }
                return;
            case 10:
                o6 o6Var = (o6) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z20 = this.b;
                int i20 = o6Var.a;
                if (arrayList7 != null && (arrayList = t6.I.b0) != null && !arrayList.isEmpty() && arrayList7.contains(t6.I.k(false))) {
                    t6.u1(true);
                }
                if (!z20) {
                    HashMap hashMap = o6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        zs.f(i20).n(o6Var, zs.Y1);
                        zs.f(i20).n(o6Var, zs.Z1);
                        return;
                    }
                    return;
                }
                if (o6Var.b != null) {
                    zs.f(i20).b(o6Var, zs.Y1);
                    zs.f(i20).b(o6Var, zs.Z1);
                    Iterator it2 = o6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        b8.G(i20).W(ic.b(((n6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 11:
                ((un) this.c).Lc((jj) this.d, this.b);
                return;
            case 12:
                fn fnVar = (fn) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z21 = this.b;
                un unVar = fnVar.a;
                unVar.Vb.b();
                if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
                    cc.a0(unVar).Q(R.raw.error, 36, cd.L0(z21 ? 2131754435 : 2131754385, null)).k(true);
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                ui.b0(i11).I1(tL_messages_stickerSet, false);
                if (unVar.getParentActivity() == null || unVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z21) {
                    cx0 cx0Var = new cx0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Z, unVar.xa);
                    boolean J9 = unVar.J9();
                    cx0Var.h0 = J9;
                    cx0Var.n = J9;
                    unVar.showDialog(cx0Var);
                    return;
                }
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add(tL_inputStickerSetID);
                cv cvVar = new cv(unVar, unVar.getParentActivity(), unVar.xa, arrayList8);
                boolean J92 = unVar.J9();
                cvVar.h0 = J92;
                cvVar.n = J92;
                unVar.showDialog(cvVar);
                return;
            case 13:
                zo zoVar = (zo) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                boolean z22 = this.b;
                bp bpVar = zoVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bpVar.getContext(), bpVar.n2);
                alertDialog$Builder.a.R = cd.L0(2131743698, null);
                alertDialog$Builder.a.T = cd.L0(2131743699, null);
                alertDialog$Builder.k(cd.L0(2131747847, null), new v0(zoVar, tL_username, z22, i14));
                alertDialog$Builder.p();
                return;
            case 14:
                mp mpVar = (mp) this.c;
                boolean z23 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                qp qpVar = mpVar.y.d;
                qpVar.O = false;
                if (z23 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                qpVar.P = true;
                qpVar.getMessagesController().Z4(chat.id, 0L, false, false, false, new lp(mpVar, i15), new zg(21, mpVar, chat));
                return;
            case 15:
                AnimatedPhoneNumberEditText.A((AnimatedPhoneNumberEditText) this.c, this.b, (String) this.d);
                return;
            case 16:
                bi biVar = (bi) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.b;
                if (!biVar.I && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    biVar.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.cd(i13, biVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((j00) this.c).e1((g00) this.d, !this.b);
                return;
            case 18:
                n90 n90Var = (n90) this.c;
                n90Var.getMessagesController().O1().r0(n90Var.e, (ArrayList) this.d, this.b, null);
                return;
            case 19:
                zc0 zc0Var = (zc0) this.c;
                boolean z25 = this.b;
                jb0 jb0Var = (jb0) this.d;
                if (z25) {
                    jb0Var.w(true);
                } else {
                    jb0Var.x();
                }
                zc0Var.b(jb0Var);
                return;
            case 20:
                a1 a1Var = (a1) this.c;
                boolean z26 = this.b;
                jb0 jb0Var2 = (jb0) this.d;
                if (z26) {
                    jb0Var2.w(true);
                } else {
                    jb0Var2.x();
                }
                ((zc0) a1Var.b).b(jb0Var2);
                return;
            case 21:
                cg0 cg0Var = (cg0) this.c;
                u51 u51Var = cg0Var.c;
                boolean z27 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                if (z27) {
                    arrayList9 = cg0Var.e;
                }
                if (arrayList9.isEmpty()) {
                    return;
                }
                if (u51Var.canScrollVertically(1)) {
                    for (int i21 = 0; i21 < u51Var.getChildCount(); i21++) {
                        if (!(u51Var.getChildAt(i21) instanceof zz)) {
                        }
                    }
                    return;
                }
                cg0Var.a(false);
                return;
            case 22:
                Runnable runnable2 = (Runnable) this.c;
                boolean z28 = this.b;
                z60 z60Var = (z60) this.d;
                runnable2.run();
                if (z28) {
                    z60Var.u();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.c;
                boolean z29 = this.b;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.d;
                if (z29) {
                    rVar.y.removeView(rVar2);
                }
                rVar2.setVisibility(8);
                rVar.C0 = null;
                return;
            case 24:
                ((rx) this.c).b.presentFragment(this.b ? new FiltersSetupActivity() : new i00((ap) this.d, null));
                return;
            case 25:
                rx rxVar = (rx) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                boolean z30 = this.b;
                ay ayVar = rxVar.b;
                int i22 = 0;
                for (int i23 = 0; i23 < arrayList10.size(); i23++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList10.get(i23);
                    if (dialog != null) {
                        ayVar.getNotificationsController().T(dialog.id, z30 ? 3 : 4, 0L);
                        i22++;
                    }
                }
                eb ebVar = new eb(ayVar.getParentActivity(), null);
                ebVar.b.setText(z30 ? cd.G(i22, "NotificationsMutedHintChats", new Object[0]) : cd.G(i22, "NotificationsUnmutedHintChats", new Object[0]));
                if (z30) {
                    ebVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ebVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                wb.g(ayVar, ebVar, 1500).j();
                return;
            case 26:
                ((iz) this.c).d0((g00) this.d, !this.b);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.c;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.d;
                boolean z31 = this.b;
                x1Var2.dismiss();
                if (z31) {
                    return;
                }
                org.telegram.messenger.i0.h3(new e70(languageSelectActivity, 1), 10L);
                return;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.d;
                boolean z32 = this.b;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.u0(k2Var2, z32, false);
                return;
            default:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                boolean z33 = this.b;
                org.telegram.messenger.g1 g1Var2 = (org.telegram.messenger.g1) this.d;
                Pattern pattern2 = LaunchActivity.D1;
                if (((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() && (str = (e = org.telegram.messenger.k1.e()).a) != null && (i12 = e.b) != 0) {
                    g1Var = new org.telegram.messenger.g1(str, i12, e.c);
                }
                if (g1Var != null) {
                    if (((ApplicationLoaderImpl) org.telegram.messenger.w0.a).q() ? org.telegram.messenger.k1.e().j : false) {
                        return;
                    }
                    if (z33 || g1Var2 == null || (tz.U(g1Var.a, g1Var2.a) && g1Var.c > g1Var2.c)) {
                        ((ApplicationLoaderImpl) org.telegram.messenger.w0.a).getClass();
                        try {
                            new a61(launchActivity2, g1Var).show();
                            return;
                        } catch (Exception e11) {
                            f8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ j0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
