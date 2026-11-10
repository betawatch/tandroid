package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h41(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        ArrayList arrayList;
        pj0 pj0Var;
        switch (this.a) {
            case 0:
                ((x31) this.b).D.onClick((org.telegram.ui.Cells.q8) this.c);
                break;
            case 1:
                t51 t51Var = (t51) this.b;
                e2.v0 v0Var = (e2.v0) this.c;
                Throwable cause = v0Var.getCause();
                ArrayList arrayList2 = null;
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = t51Var.n;
                    if (textureView == null || ((t51Var.E || !(cause instanceof u2.p)) && !(cause instanceof d3.v))) {
                        t51Var.J.onError(t51Var, v0Var);
                        break;
                    } else {
                        t51Var.E = true;
                        if (t51Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(t51Var.n);
                                viewGroup.removeView(t51Var.n);
                                viewGroup.addView(t51Var.n, indexOfChild);
                            }
                            org.telegram.messenger.q5 q5Var = t51Var.b;
                            if (q5Var != null) {
                                q5Var.postRunnable(new jr0(t51Var, 29));
                                break;
                            } else {
                                l2.i0 i0Var = t51Var.d;
                                TextureView textureView2 = t51Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                t51Var.d.z1(t51Var.n);
                                ArrayList arrayList3 = t51Var.N;
                                if (arrayList3 != null) {
                                    t51Var.k0(arrayList3, t51Var.O);
                                } else if (t51Var.U) {
                                    t51Var.l0(t51Var.Q, t51Var.S, t51Var.R, t51Var.T);
                                } else {
                                    t51Var.j0(t51Var.Q, t51Var.S);
                                }
                                t51Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.qp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t51.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList4 = t51Var.N;
                    if (arrayList4 != null) {
                        int i10 = 0;
                        while (i10 < arrayList4.size()) {
                            p51 p51Var = (p51) arrayList4.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList5 = p51Var.d;
                                if (i11 < arrayList5.size()) {
                                    r51 r51Var = (r51) arrayList5.get(i11);
                                    if (!TextUtils.isEmpty(r51Var.m) && !t51.D0(r51Var.m)) {
                                        arrayList5.remove(i11);
                                        i11--;
                                    }
                                    i11++;
                                } else {
                                    if (arrayList5.isEmpty()) {
                                        arrayList4.remove(i10);
                                        i10--;
                                    }
                                    i10++;
                                }
                            }
                        }
                        arrayList2 = arrayList4;
                    }
                    t51Var.N = arrayList2;
                    if (arrayList2 != null) {
                        t51Var.k0(arrayList2, t51Var.O);
                        break;
                    }
                }
                break;
            case 2:
                ((t51) ((li.b6) this.b).f).K.F(true, (float[]) this.c);
                break;
            case 3:
                z51 z51Var = (z51) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (z51Var.x != null) {
                        Bitmap bitmap2 = z51Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z51Var.w = z51Var.x;
                    }
                    z51Var.x = bitmap;
                    Bitmap bitmap3 = z51Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    z51Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(z51Var.L);
                    z51Var.J.setShader(z51Var.G);
                    z51Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i7 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i7 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = z51Var.getLayoutParams();
                    if (z51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                        layoutParams.width = L;
                        layoutParams.height = i7;
                        z51Var.setVisibility(0);
                        z51Var.requestLayout();
                    }
                }
                z51Var.f = null;
                break;
            case 4:
                final k71 k71Var = (k71) this.b;
                k71Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.j71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str = (String) obj;
                        k71 k71Var2 = k71.this;
                        String[] strArr = k71Var2.c;
                        strArr[0] = strArr[0].replace(k71Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        k71Var2.b.countDown();
                    }
                });
                break;
            case 5:
                ((org.telegram.ui.Components.voip.q) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 6:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap hashMap2 = yVar.F.h;
                org.telegram.messenger.s3 s3Var = yVar.x;
                boolean z9 = s3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
                hashMap2.put(z9 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 7:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.c;
                k0Var.getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                break;
            case 8:
                pj0 pj0Var2 = (pj0) this.b;
                if (pj0Var2 != null) {
                    pj0Var2.setOnItemClickListener((bj0) this.c);
                    break;
                }
                break;
            case 9:
                nj njVar = (nj) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new h41(10, njVar, new ArrayList()));
                    break;
                } else {
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = njVar.f;
                    int size = arrayList7.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList7.get(i12);
                        i12++;
                        org.telegram.ui.ps psVar = (org.telegram.ui.ps) obj;
                        String str = psVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.O3(psVar.a).toLowerCase();
                        String str2 = psVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.O3(psVar.b).toLowerCase();
                        String str3 = psVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList7;
                        } else {
                            arrayList = arrayList7;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(O3) && !lowerCase3.contains(" ".concat(O3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(O3) && !lowerCase5.contains(" ".concat(O3)) && !str3.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList7 = arrayList;
                            }
                        }
                        arrayList6.add(psVar);
                        arrayList7 = arrayList;
                    }
                    org.telegram.messenger.g0.h3(new h41(10, njVar, arrayList6));
                    break;
                }
                break;
            case 10:
                nj njVar2 = (nj) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) njVar2.n;
                if (tsVar.f) {
                    njVar2.e = arrayList8;
                    if (tsVar.e && (pj0Var = tsVar.a) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        nj njVar3 = tsVar.d;
                        if (adapter != njVar3) {
                            tsVar.a.setAdapter(njVar3);
                            tsVar.a.setFastScrollVisible(false);
                        }
                    }
                    njVar2.f();
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.qp.s1(((org.telegram.ui.vs) this.b).a).O3((TLRPC.Updates) this.c, false);
                break;
            case 12:
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.b;
                a0.h hVar = (a0.h) this.c;
                org.telegram.ui.tt ttVar = stVar.U2;
                gc.x(ttVar.getParentActivity(), ttVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, stVar.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, stVar.I0)).j();
                break;
            case 13:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.c;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.fu(zwVar, 10), 300L);
                break;
            case 14:
                org.telegram.ui.zw zwVar2 = (org.telegram.ui.zw) this.b;
                zwVar2.getMessagesController().e((ArrayList) this.c, (zwVar2.X2 == 0 && zwVar2.Z2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 15:
                hi.a3.n(((org.telegram.ui.zw) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                break;
            case 16:
                org.telegram.ui.gv gvVar = (org.telegram.ui.gv) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.zw zwVar3 = gvVar.a;
                zwVar3.I2 = null;
                po0 po0Var = zwVar3.H2;
                if (po0Var != null && po0Var.h) {
                    po0Var.e(charSequence, false);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.aw awVar = (org.telegram.ui.aw) this.b;
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) this.c;
                awVar.b.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                    break;
                } else {
                    f2VarArr[0].finishFragment();
                    break;
                }
            case 18:
                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                org.telegram.ui.zw zwVar4 = qwVar.b;
                zwVar4.M4(true, true);
                zwVar4.z3();
                for (int i13 = 0; i13 < arrayList9.size(); i13++) {
                    long j3 = ((TLRPC.Dialog) arrayList9.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i13);
                    if (zwVar4.getMessagesController().t2(j3) || zwVar4.getMessagesController().z2(j3)) {
                        org.telegram.messenger.qp messagesController = zwVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController, j3);
                        org.telegram.messenger.p5 p5Var = messagesStorage.a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j3, rlVar, 5);
                        j3 = j3;
                        p5Var.c(a4Var);
                    }
                    zwVar4.getMessagesController().o3(j3, 0L);
                    org.telegram.messenger.qp messagesController2 = zwVar4.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController2.j3(j3, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                }
                break;
            case 19:
                ((org.telegram.ui.qw) this.b).d((org.telegram.messenger.vo) this.c);
                break;
            case 20:
                org.telegram.ui.lx lxVar = (org.telegram.ui.lx) this.b;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.c;
                org.telegram.ui.cn cnVar = lxVar.a;
                yv0 yv0Var = new yv0(cnVar.getParentActivity(), lxVar.a, org.telegram.messenger.ij.j1(ijVar.k), null, cnVar.Z, cnVar.getResourceProvider());
                boolean U9 = cnVar.U9();
                yv0Var.h0 = U9;
                yv0Var.n = U9;
                cnVar.showDialog(yv0Var);
                break;
            case 21:
                org.telegram.ui.hy hyVar = (org.telegram.ui.hy) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                hyVar.getClass();
                u1Var.dismiss();
                org.telegram.ui.iy iyVar = hyVar.E;
                org.telegram.ui.jy jyVar = iyVar.c;
                org.telegram.messenger.c20 c20Var = jyVar.x;
                if (c20Var != null) {
                    c20Var.a(jyVar.d);
                }
                iyVar.c.finishFragment();
                break;
            case 22:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.b;
                org.telegram.ui.jy jyVar2 = new org.telegram.ui.jy(jzVar.r, ((org.telegram.ui.bz) this.c).m);
                jyVar2.y = new org.telegram.ui.ny(jzVar, 1);
                jyVar2.x = new org.telegram.ui.ny(jzVar, 2);
                jzVar.presentFragment(jyVar2);
                break;
            case 23:
                org.telegram.ui.jz jzVar2 = (org.telegram.ui.jz) this.b;
                Runnable runnable = (Runnable) this.c;
                jzVar2.h = false;
                jzVar2.s = false;
                jzVar2.r.g = jzVar2.D;
                jzVar2.o0(true);
                jzVar2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                runnable.run();
                break;
            case 24:
                org.telegram.ui.jz jzVar3 = (org.telegram.ui.jz) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList10 = jzVar3.L;
                jzVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    jzVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    jzVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    jzVar3.C0();
                }
                jzVar3.M = 0;
                break;
            case 25:
                org.telegram.ui.jz jzVar4 = (org.telegram.ui.jz) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.messenger.vo voVar = jzVar4.r;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                jzVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = jzVar4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.zq(0, messagesStorage2, voVar));
                jzVar4.finishFragment();
                break;
            case 26:
                org.telegram.ui.jz jzVar5 = (org.telegram.ui.jz) this.b;
                TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) this.c;
                jzVar5.getClass();
                jzVar5.s0(tL_chatlists_exportedChatlistInvite.invite);
                break;
            case 27:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) this.b;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) this.c).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.c00(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 28:
                org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) this.b;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) this.c;
                FiltersSetupActivity filtersSetupActivity2 = h00Var.e;
                filtersSetupActivity2.getMessagesController().V0.remove(tL_dialogFilterSuggested);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                break;
            default:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = f40Var.S3;
                for (int i15 = 0; i15 < arrayList12.size(); i15++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList12.get(i15)).x != null) {
                        arrayList11.remove(((org.telegram.ui.Components.voip.y) arrayList12.get(i15)).x);
                    }
                }
                for (int i16 = 0; i16 < arrayList11.size(); i16++) {
                    org.telegram.messenger.s3 s3Var2 = (org.telegram.messenger.s3) arrayList11.get(i16);
                    if (s3Var2.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var2.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var2.a, s3Var2.b);
                    }
                }
                break;
        }
    }

    public /* synthetic */ h41(org.telegram.ui.st stVar, a0.h hVar, int i7) {
        this.a = 12;
        this.b = stVar;
        this.c = hVar;
    }
}
