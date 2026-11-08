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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l51(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        pj0 pj0Var;
        int i10 = this.a;
        ArrayList arrayList = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                t51 t51Var = (t51) obj2;
                e2.v0 v0Var = (e2.v0) obj;
                Throwable cause = v0Var.getCause();
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
                                q5Var.postRunnable(new ir0(t51Var, 29));
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
                                ArrayList arrayList2 = t51Var.N;
                                if (arrayList2 != null) {
                                    t51Var.k0(arrayList2, t51Var.O);
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
                    ArrayList arrayList3 = t51Var.N;
                    if (arrayList3 != null) {
                        int i12 = 0;
                        while (i12 < arrayList3.size()) {
                            p51 p51Var = (p51) arrayList3.get(i12);
                            int i13 = 0;
                            while (true) {
                                ArrayList arrayList4 = p51Var.d;
                                if (i13 < arrayList4.size()) {
                                    r51 r51Var = (r51) arrayList4.get(i13);
                                    if (!TextUtils.isEmpty(r51Var.m) && !t51.D0(r51Var.m)) {
                                        arrayList4.remove(i13);
                                        i13--;
                                    }
                                    i13++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i12);
                                        i12--;
                                    }
                                    i12++;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                    t51Var.N = arrayList;
                    if (arrayList != null) {
                        t51Var.k0(arrayList, t51Var.O);
                        break;
                    }
                }
                break;
            case 1:
                ((t51) ((li.b6) obj2).f).K.F(true, (float[]) obj);
                break;
            case 2:
                z51 z51Var = (z51) obj2;
                Bitmap bitmap = (Bitmap) obj;
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
                        int i14 = (int) (L * width);
                        i7 = L;
                        L = i14;
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
            case 3:
                final k71 k71Var = (k71) obj2;
                k71Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.j71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        k71 k71Var2 = k71.this;
                        String[] strArr = k71Var2.c;
                        strArr[0] = strArr[0].replace(k71Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        k71Var2.b.countDown();
                    }
                });
                break;
            case 4:
                ((org.telegram.ui.Components.voip.q) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 5:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap hashMap2 = yVar.F.h;
                org.telegram.messenger.s3 s3Var = yVar.x;
                boolean z9 = s3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
                hashMap2.put(z9 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 6:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                break;
            case 7:
                pj0 pj0Var2 = (pj0) obj2;
                if (pj0Var2 != null) {
                    pj0Var2.setOnItemClickListener((bj0) obj);
                    break;
                }
                break;
            case 8:
                oj ojVar = (oj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i15 = 9;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new l51(i15, ojVar, new ArrayList()));
                    break;
                } else {
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = ojVar.f;
                    int size = arrayList6.size();
                    while (i11 < size) {
                        Object obj3 = arrayList6.get(i11);
                        i11++;
                        org.telegram.ui.ms msVar = (org.telegram.ui.ms) obj3;
                        String str = msVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.O3(msVar.a).toLowerCase();
                        String str2 = msVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.O3(msVar.b).toLowerCase();
                        String str3 = msVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(msVar);
                        }
                    }
                    org.telegram.messenger.g0.h3(new l51(9, ojVar, arrayList5));
                    break;
                }
                break;
            case 9:
                oj ojVar2 = (oj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) ojVar2.n;
                if (qsVar.f) {
                    ojVar2.e = arrayList7;
                    if (qsVar.e && (pj0Var = qsVar.a) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        oj ojVar3 = qsVar.d;
                        if (adapter != ojVar3) {
                            qsVar.a.setAdapter(ojVar3);
                            qsVar.a.setFastScrollVisible(false);
                        }
                    }
                    ojVar2.f();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.qp.s1(((org.telegram.ui.ss) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 11:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.qt qtVar = ptVar.R2;
                hc.x(qtVar.getParentActivity(), qtVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, ptVar.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, ptVar.I0)).j();
                break;
            case 12:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj2;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.cu(wwVar, 10), 300L);
                break;
            case 13:
                org.telegram.ui.ww wwVar2 = (org.telegram.ui.ww) obj2;
                wwVar2.getMessagesController().e((ArrayList) obj, (wwVar2.W2 == 0 && wwVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 14:
                hi.a3.n(((org.telegram.ui.ww) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.ww wwVar3 = ((org.telegram.ui.dv) obj2).a;
                wwVar3.H2 = null;
                po0 po0Var = wwVar3.G2;
                if (po0Var != null && po0Var.h) {
                    po0Var.e(charSequence, false);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj;
                ((org.telegram.ui.xv) obj2).b.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                    break;
                } else {
                    f2VarArr[0].finishFragment();
                    break;
                }
            case 17:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.ww wwVar4 = ((org.telegram.ui.nw) obj2).b;
                wwVar4.M4(true, true);
                wwVar4.z3();
                while (i11 < arrayList8.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList8.get(i11)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i11);
                    if (wwVar4.getMessagesController().t2(j3) || wwVar4.getMessagesController().z2(j3)) {
                        org.telegram.messenger.qp messagesController = wwVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController, j3);
                        org.telegram.messenger.p5 p5Var = messagesStorage.a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j3, rlVar, 5);
                        j3 = j3;
                        p5Var.c(a4Var);
                    }
                    wwVar4.getMessagesController().o3(j3, 0L);
                    org.telegram.messenger.qp messagesController2 = wwVar4.getMessagesController();
                    int i16 = dialog.top_message;
                    messagesController2.j3(j3, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                break;
            case 18:
                ((org.telegram.ui.nw) obj2).d((org.telegram.messenger.vo) obj);
                break;
            case 19:
                org.telegram.ui.ix ixVar = (org.telegram.ui.ix) obj2;
                org.telegram.ui.an anVar = ixVar.a;
                yv0 yv0Var = new yv0(anVar.getParentActivity(), ixVar.a, org.telegram.messenger.ij.k1(((org.telegram.messenger.ij) obj).k), null, anVar.Z, anVar.getResourceProvider());
                boolean T9 = anVar.T9();
                yv0Var.h0 = T9;
                yv0Var.n = T9;
                anVar.showDialog(yv0Var);
                break;
            case 20:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj2;
                eyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                org.telegram.ui.fy fyVar = eyVar.E;
                org.telegram.ui.gy gyVar = fyVar.c;
                org.telegram.messenger.c20 c20Var = gyVar.x;
                if (c20Var != null) {
                    c20Var.a(gyVar.d);
                }
                fyVar.c.finishFragment();
                break;
            case 21:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) obj2;
                org.telegram.ui.gy gyVar2 = new org.telegram.ui.gy(gzVar.r, ((org.telegram.ui.yy) obj).m);
                gyVar2.y = new org.telegram.ui.ky(gzVar, 1);
                gyVar2.x = new org.telegram.ui.ky(gzVar, 2);
                gzVar.presentFragment(gyVar2);
                break;
            case 22:
                org.telegram.ui.gz gzVar2 = (org.telegram.ui.gz) obj2;
                gzVar2.h = false;
                gzVar2.s = false;
                gzVar2.r.g = gzVar2.D;
                gzVar2.o0(true);
                gzVar2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 23:
                org.telegram.ui.gz gzVar3 = (org.telegram.ui.gz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList9 = gzVar3.L;
                gzVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    gzVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    gzVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    gzVar3.C0();
                }
                gzVar3.M = 0;
                break;
            case 24:
                org.telegram.ui.gz gzVar4 = (org.telegram.ui.gz) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.vo voVar = gzVar4.r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                gzVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = gzVar4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.zq(i11, messagesStorage2, voVar));
                gzVar4.finishFragment();
                break;
            case 25:
                org.telegram.ui.gz gzVar5 = (org.telegram.ui.gz) obj2;
                gzVar5.getClass();
                gzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 26:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.zz(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 27:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.e00) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                break;
            case 28:
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ((org.telegram.ui.c40) obj2).P3;
                for (int i17 = 0; i17 < arrayList11.size(); i17++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList11.get(i17)).x != null) {
                        arrayList10.remove(((org.telegram.ui.Components.voip.y) arrayList11.get(i17)).x);
                    }
                }
                while (i11 < arrayList10.size()) {
                    org.telegram.messenger.s3 s3Var2 = (org.telegram.messenger.s3) arrayList10.get(i11);
                    if (s3Var2.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var2.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var2.a, s3Var2.b);
                    }
                    i11++;
                }
                break;
            default:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj2;
                org.telegram.messenger.qs.f(c40Var.k1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                c40Var.dismiss();
                break;
        }
    }

    public /* synthetic */ l51(org.telegram.ui.pt ptVar, a0.h hVar, int i7) {
        this.a = 11;
        this.b = ptVar;
        this.c = hVar;
    }
}
