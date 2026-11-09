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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m51(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        qj0 qj0Var;
        int i10 = this.a;
        ArrayList arrayList = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                u51 u51Var = (u51) obj2;
                e2.v0 v0Var = (e2.v0) obj;
                Throwable cause = v0Var.getCause();
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = u51Var.n;
                    if (textureView == null || ((u51Var.E || !(cause instanceof u2.p)) && !(cause instanceof d3.v))) {
                        u51Var.J.onError(u51Var, v0Var);
                        break;
                    } else {
                        u51Var.E = true;
                        if (u51Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(u51Var.n);
                                viewGroup.removeView(u51Var.n);
                                viewGroup.addView(u51Var.n, indexOfChild);
                            }
                            org.telegram.messenger.q5 q5Var = u51Var.b;
                            if (q5Var != null) {
                                q5Var.postRunnable(new kr0(u51Var, 29));
                                break;
                            } else {
                                l2.i0 i0Var = u51Var.d;
                                TextureView textureView2 = u51Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                u51Var.d.z1(u51Var.n);
                                ArrayList arrayList2 = u51Var.N;
                                if (arrayList2 != null) {
                                    u51Var.k0(arrayList2, u51Var.O);
                                } else if (u51Var.U) {
                                    u51Var.l0(u51Var.Q, u51Var.S, u51Var.R, u51Var.T);
                                } else {
                                    u51Var.j0(u51Var.Q, u51Var.S);
                                }
                                u51Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.qp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u51.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = u51Var.N;
                    if (arrayList3 != null) {
                        int i12 = 0;
                        while (i12 < arrayList3.size()) {
                            q51 q51Var = (q51) arrayList3.get(i12);
                            int i13 = 0;
                            while (true) {
                                ArrayList arrayList4 = q51Var.d;
                                if (i13 < arrayList4.size()) {
                                    s51 s51Var = (s51) arrayList4.get(i13);
                                    if (!TextUtils.isEmpty(s51Var.m) && !u51.D0(s51Var.m)) {
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
                    u51Var.N = arrayList;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.O);
                        break;
                    }
                }
                break;
            case 1:
                ((u51) ((li.b6) obj2).f).K.F(true, (float[]) obj);
                break;
            case 2:
                a61 a61Var = (a61) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (a61Var.x != null) {
                        Bitmap bitmap2 = a61Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a61Var.w = a61Var.x;
                    }
                    a61Var.x = bitmap;
                    Bitmap bitmap3 = a61Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a61Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a61Var.L);
                    a61Var.J.setShader(a61Var.G);
                    a61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i7 = (int) (L / width);
                    } else {
                        int i14 = (int) (L * width);
                        i7 = L;
                        L = i14;
                    }
                    ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
                    if (a61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                        layoutParams.width = L;
                        layoutParams.height = i7;
                        a61Var.setVisibility(0);
                        a61Var.requestLayout();
                    }
                }
                a61Var.f = null;
                break;
            case 3:
                final l71 l71Var = (l71) obj2;
                l71Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.k71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        l71 l71Var2 = l71.this;
                        String[] strArr = l71Var2.c;
                        strArr[0] = strArr[0].replace(l71Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        l71Var2.b.countDown();
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
                qj0 qj0Var2 = (qj0) obj2;
                if (qj0Var2 != null) {
                    qj0Var2.setOnItemClickListener((cj0) obj);
                    break;
                }
                break;
            case 8:
                oj ojVar = (oj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i15 = 9;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new m51(i15, ojVar, new ArrayList()));
                    break;
                } else {
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = ojVar.f;
                    int size = arrayList6.size();
                    while (i11 < size) {
                        Object obj3 = arrayList6.get(i11);
                        i11++;
                        org.telegram.ui.os osVar = (org.telegram.ui.os) obj3;
                        String str = osVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.O3(osVar.a).toLowerCase();
                        String str2 = osVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.O3(osVar.b).toLowerCase();
                        String str3 = osVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(osVar);
                        }
                    }
                    org.telegram.messenger.g0.h3(new m51(9, ojVar, arrayList5));
                    break;
                }
                break;
            case 9:
                oj ojVar2 = (oj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) ojVar2.n;
                if (ssVar.f) {
                    ojVar2.e = arrayList7;
                    if (ssVar.e && (qj0Var = ssVar.a) != null) {
                        v4.g0 adapter = qj0Var.getAdapter();
                        oj ojVar3 = ssVar.d;
                        if (adapter != ojVar3) {
                            ssVar.a.setAdapter(ojVar3);
                            ssVar.a.setFastScrollVisible(false);
                        }
                    }
                    ojVar2.f();
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.qp.s1(((org.telegram.ui.us) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 11:
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.st stVar = rtVar.R2;
                hc.x(stVar.getParentActivity(), stVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, rtVar.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, rtVar.I0)).j();
                break;
            case 12:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj2;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.eu(ywVar, 10), 300L);
                break;
            case 13:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj2;
                ywVar2.getMessagesController().e((ArrayList) obj, (ywVar2.X2 == 0 && ywVar2.Z2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 14:
                hi.a3.n(((org.telegram.ui.yw) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yw ywVar3 = ((org.telegram.ui.fv) obj2).a;
                ywVar3.I2 = null;
                qo0 qo0Var = ywVar3.H2;
                if (qo0Var != null && qo0Var.h) {
                    qo0Var.e(charSequence, false);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj;
                ((org.telegram.ui.zv) obj2).b.removeSelfFromStack();
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
                org.telegram.ui.yw ywVar4 = ((org.telegram.ui.pw) obj2).b;
                ywVar4.M4(true, true);
                ywVar4.z3();
                while (i11 < arrayList8.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList8.get(i11)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i11);
                    if (ywVar4.getMessagesController().t2(j3) || ywVar4.getMessagesController().z2(j3)) {
                        org.telegram.messenger.qp messagesController = ywVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController, j3);
                        org.telegram.messenger.p5 p5Var = messagesStorage.a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j3, rlVar, 5);
                        j3 = j3;
                        p5Var.c(a4Var);
                    }
                    ywVar4.getMessagesController().o3(j3, 0L);
                    org.telegram.messenger.qp messagesController2 = ywVar4.getMessagesController();
                    int i16 = dialog.top_message;
                    messagesController2.j3(j3, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                break;
            case 18:
                ((org.telegram.ui.pw) obj2).d((org.telegram.messenger.vo) obj);
                break;
            case 19:
                org.telegram.ui.kx kxVar = (org.telegram.ui.kx) obj2;
                org.telegram.ui.cn cnVar = kxVar.a;
                zv0 zv0Var = new zv0(cnVar.getParentActivity(), kxVar.a, org.telegram.messenger.ij.j1(((org.telegram.messenger.ij) obj).k), null, cnVar.Z, cnVar.getResourceProvider());
                boolean U9 = cnVar.U9();
                zv0Var.h0 = U9;
                zv0Var.n = U9;
                cnVar.showDialog(zv0Var);
                break;
            case 20:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj2;
                gyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                org.telegram.ui.hy hyVar = gyVar.E;
                org.telegram.ui.iy iyVar = hyVar.c;
                org.telegram.messenger.c20 c20Var = iyVar.x;
                if (c20Var != null) {
                    c20Var.a(iyVar.d);
                }
                hyVar.c.finishFragment();
                break;
            case 21:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) obj2;
                org.telegram.ui.iy iyVar2 = new org.telegram.ui.iy(izVar.r, ((org.telegram.ui.az) obj).m);
                iyVar2.y = new org.telegram.ui.my(izVar, 1);
                iyVar2.x = new org.telegram.ui.my(izVar, 2);
                izVar.presentFragment(iyVar2);
                break;
            case 22:
                org.telegram.ui.iz izVar2 = (org.telegram.ui.iz) obj2;
                izVar2.h = false;
                izVar2.s = false;
                izVar2.r.g = izVar2.D;
                izVar2.o0(true);
                izVar2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 23:
                org.telegram.ui.iz izVar3 = (org.telegram.ui.iz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList9 = izVar3.L;
                izVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    izVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    izVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    izVar3.C0();
                }
                izVar3.M = 0;
                break;
            case 24:
                org.telegram.ui.iz izVar4 = (org.telegram.ui.iz) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.vo voVar = izVar4.r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                izVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = izVar4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.zq(i11, messagesStorage2, voVar));
                izVar4.finishFragment();
                break;
            case 25:
                org.telegram.ui.iz izVar5 = (org.telegram.ui.iz) obj2;
                izVar5.getClass();
                izVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 26:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.b00(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 27:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.g00) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                break;
            case 28:
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ((org.telegram.ui.e40) obj2).P3;
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
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj2;
                org.telegram.messenger.qs.f(e40Var.k1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                e40Var.dismiss();
                break;
        }
    }

    public /* synthetic */ m51(org.telegram.ui.rt rtVar, a0.h hVar, int i7) {
        this.a = 11;
        this.b = rtVar;
        this.c = hVar;
    }
}
