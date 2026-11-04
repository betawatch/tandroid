package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p11(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        tj0 tj0Var;
        int i10 = this.a;
        ArrayList arrayList = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                f21 f21Var = (f21) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.st stVar = f21Var.q1;
                f21Var.j1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        f21Var.M1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (stVar != null) {
                            stVar.set(richMessage);
                            f21Var.F1.D(stVar);
                            break;
                        }
                    }
                }
                if (!f21Var.M1) {
                    org.telegram.messenger.k5.p(null, 2131743956, new fc((FrameLayout) f21Var.b, f21Var.J0), null);
                    b21 b21Var = f21Var.u1.e;
                    String str = f21Var.t1;
                    f21Var.s1 = str;
                    b21Var.setText(f21.O0(str, null, null));
                    break;
                } else {
                    f21Var.dismiss();
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.P4, 1, org.telegram.messenger.bd.M0(2131743956, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.xj xjVar = (org.telegram.ui.xj) obj2;
                ((org.telegram.ui.ActionBar.f1) obj).d(true);
                v21.a(xjVar.getContext(), xjVar.d);
                break;
            case 2:
                ((org.telegram.messenger.x00) obj).J(((org.telegram.ui.xj) obj2).b, false, false);
                break;
            case 3:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject2 instanceof TLRPC.PaymentReceipt)) {
                    int i12 = UndoView.j0;
                    undoView.getClass();
                    break;
                } else {
                    undoView.s.presentFragment(new org.telegram.ui.dl0((TLRPC.PaymentReceipt) tLObject2));
                    break;
                }
            case 4:
                ((r31) obj2).D.onClick((org.telegram.ui.Cells.p8) obj);
                break;
            case 5:
                m51 m51Var = (m51) obj2;
                d2.x0 x0Var = (d2.x0) obj;
                Throwable cause = x0Var.getCause();
                if (!(cause instanceof t2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = m51Var.n;
                    if (textureView != null && ((!m51Var.F && (cause instanceof t2.p)) || (cause instanceof c3.v))) {
                        m51Var.F = true;
                        if (m51Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(m51Var.n);
                                viewGroup.removeView(m51Var.n);
                                viewGroup.addView(m51Var.n, indexOfChild);
                            }
                            org.telegram.messenger.q5 q5Var = m51Var.b;
                            if (q5Var == null) {
                                k2.i0 i0Var = m51Var.d;
                                TextureView textureView2 = m51Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                m51Var.d.z1(m51Var.n);
                                ArrayList arrayList2 = m51Var.O;
                                if (arrayList2 != null) {
                                    m51Var.k0(arrayList2, m51Var.P);
                                } else if (m51Var.V) {
                                    m51Var.l0(m51Var.R, m51Var.T, m51Var.S, m51Var.U);
                                } else {
                                    m51Var.j0(m51Var.R, m51Var.T);
                                }
                                m51Var.h0();
                                break;
                            } else {
                                q5Var.postRunnable(new f51(m51Var, i11));
                                break;
                            }
                        }
                    } else {
                        m51Var.K.onError(m51Var, x0Var);
                        break;
                    }
                } else {
                    org.telegram.messenger.a8.g(x0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.hp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = m51.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = m51Var.O;
                    if (arrayList3 != null) {
                        int i13 = 0;
                        while (i13 < arrayList3.size()) {
                            j51 j51Var = (j51) arrayList3.get(i13);
                            int i14 = 0;
                            while (true) {
                                ArrayList arrayList4 = j51Var.d;
                                if (i14 < arrayList4.size()) {
                                    l51 l51Var = (l51) arrayList4.get(i14);
                                    if (!TextUtils.isEmpty(l51Var.m) && !m51.D0(l51Var.m)) {
                                        arrayList4.remove(i14);
                                        i14--;
                                    }
                                    i14++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i13);
                                        i13--;
                                    }
                                    i13++;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                    m51Var.O = arrayList;
                    if (arrayList != null) {
                        m51Var.k0(arrayList, m51Var.P);
                        break;
                    }
                }
                break;
            case 6:
                ((m51) ((mi.c6) obj2).f).L.r(true, (float[]) obj);
                break;
            case 7:
                s51 s51Var = (s51) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (s51Var.x != null) {
                        Bitmap bitmap2 = s51Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        s51Var.w = s51Var.x;
                    }
                    s51Var.x = bitmap;
                    Bitmap bitmap3 = s51Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    s51Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(s51Var.M);
                    s51Var.K.setShader(s51Var.H);
                    s51Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i3 = (int) (L / width);
                    } else {
                        int i15 = (int) (L * width);
                        i3 = L;
                        L = i15;
                    }
                    ViewGroup.LayoutParams layoutParams = s51Var.getLayoutParams();
                    if (s51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                        layoutParams.width = L;
                        layoutParams.height = i3;
                        s51Var.setVisibility(0);
                        s51Var.requestLayout();
                    }
                }
                s51Var.f = null;
                break;
            case 8:
                final c71 c71Var = (c71) obj2;
                c71Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.b71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        c71 c71Var2 = c71.this;
                        String[] strArr = c71Var2.c;
                        strArr[0] = strArr[0].replace(c71Var2.d, "/signature/" + str2.substring(1, str2.length() - 1));
                        c71Var2.b.countDown();
                    }
                });
                break;
            case 9:
                ((org.telegram.ui.Components.voip.j) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 10:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap hashMap2 = rVar.G.h;
                org.telegram.messenger.s3 s3Var = rVar.x;
                boolean z10 = s3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.a;
                hashMap2.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 11:
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) obj;
                ((org.telegram.ui.Components.voip.x) obj2).getClass();
                rVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.p(rVar2, 4)).setDuration(150L).start();
                break;
            case 12:
                tj0 tj0Var2 = (tj0) obj2;
                if (tj0Var2 != null) {
                    tj0Var2.setOnItemClickListener((fj0) obj);
                    break;
                }
                break;
            case 13:
                nj njVar = (nj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i16 = 14;
                if (lowerCase.length() != 0) {
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = njVar.f;
                    int size = arrayList6.size();
                    while (i11 < size) {
                        Object obj3 = arrayList6.get(i11);
                        i11++;
                        org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj3;
                        String str2 = ksVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase2 = str2.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.O3(ksVar.a).toLowerCase();
                        String str3 = ksVar.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase4 = str3.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.O3(ksVar.b).toLowerCase();
                        String str4 = ksVar.c;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String concat = TextUtils.isEmpty(str4) ? "" : "+".concat(str4);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str4.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(ksVar);
                        }
                    }
                    org.telegram.messenger.g0.h3(new p11(14, njVar, arrayList5));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new p11(i16, njVar, new ArrayList()));
                    break;
                }
                break;
            case 14:
                nj njVar2 = (nj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.os osVar = (org.telegram.ui.os) njVar2.n;
                if (osVar.f) {
                    njVar2.e = arrayList7;
                    if (osVar.e && (tj0Var = osVar.a) != null) {
                        u4.h0 adapter = tj0Var.getAdapter();
                        nj njVar3 = osVar.d;
                        if (adapter != njVar3) {
                            osVar.a.setAdapter(njVar3);
                            osVar.a.setFastScrollVisible(false);
                        }
                    }
                    njVar2.f();
                    break;
                }
                break;
            case 15:
                org.telegram.messenger.hp.s1(((org.telegram.ui.qs) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 16:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.ot otVar = ntVar.S2;
                fc.x(otVar.getParentActivity(), otVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, ntVar.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, ntVar.J0)).j();
                break;
            case 17:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj2;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj;
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.au(uwVar, 10), 300L);
                break;
            case 18:
                org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) obj2;
                uwVar2.getMessagesController().e((ArrayList) obj, (uwVar2.X2 == 0 && uwVar2.Z2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 19:
                ii.a3.n(((org.telegram.ui.uw) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 20:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.uw uwVar3 = ((org.telegram.ui.av) obj2).a;
                uwVar3.I2 = null;
                ro0 ro0Var = uwVar3.H2;
                if (ro0Var != null && ro0Var.h) {
                    ro0Var.e(charSequence, false);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                ((org.telegram.ui.uv) obj2).b.removeSelfFromStack();
                if (d2VarArr[1] == null) {
                    d2VarArr[0].finishFragment();
                    break;
                } else {
                    d2VarArr[0].removeSelfFromStack();
                    d2VarArr[1].finishFragment();
                    break;
                }
            case 22:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.uw uwVar4 = ((org.telegram.ui.kw) obj2).b;
                uwVar4.M4(true, true);
                uwVar4.z3();
                while (i11 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i11)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i11);
                    if (uwVar4.getMessagesController().t2(j10) || uwVar4.getMessagesController().z2(j10)) {
                        org.telegram.messenger.hp messagesController = uwVar4.getMessagesController();
                        org.telegram.messenger.qr messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.hl hlVar = new org.telegram.messenger.hl(messagesController, j10);
                        org.telegram.messenger.p5 p5Var = messagesStorage.a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, hlVar, 5);
                        j10 = j10;
                        p5Var.c(a4Var);
                    }
                    uwVar4.getMessagesController().o3(j10, 0L);
                    org.telegram.messenger.hp messagesController2 = uwVar4.getMessagesController();
                    int i17 = dialog.top_message;
                    messagesController2.j3(j10, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                break;
            case 23:
                ((org.telegram.ui.kw) obj2).d((org.telegram.messenger.mo) obj);
                break;
            case 24:
                org.telegram.ui.fx fxVar = (org.telegram.ui.fx) obj2;
                org.telegram.ui.wm wmVar = fxVar.a;
                xv0 xv0Var = new xv0(wmVar.getParentActivity(), fxVar.a, org.telegram.messenger.zi.k1(((org.telegram.messenger.zi) obj).k), null, wmVar.a0, wmVar.getResourceProvider());
                boolean T9 = wmVar.T9();
                xv0Var.i0 = T9;
                xv0Var.n = T9;
                wmVar.showDialog(xv0Var);
                break;
            case 25:
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) obj2;
                zxVar.getClass();
                ((org.telegram.ui.ActionBar.s1) obj).dismiss();
                org.telegram.ui.ay ayVar = zxVar.F;
                org.telegram.ui.cy cyVar = ayVar.c;
                org.telegram.messenger.u10 u10Var = cyVar.x;
                if (u10Var != null) {
                    u10Var.a(cyVar.d);
                }
                ayVar.c.finishFragment();
                break;
            case 26:
                org.telegram.ui.ez ezVar = (org.telegram.ui.ez) obj2;
                org.telegram.ui.cy cyVar2 = new org.telegram.ui.cy(ezVar.r, ((org.telegram.ui.vy) obj).m);
                cyVar2.y = new org.telegram.ui.gy(ezVar, 1);
                cyVar2.x = new org.telegram.ui.gy(ezVar, 2);
                ezVar.presentFragment(cyVar2);
                break;
            case 27:
                org.telegram.ui.ez ezVar2 = (org.telegram.ui.ez) obj2;
                ezVar2.h = false;
                ezVar2.s = false;
                ezVar2.r.g = ezVar2.E;
                ezVar2.o0(true);
                ezVar2.getNotificationCenter().k(org.telegram.messenger.hs.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 28:
                org.telegram.ui.ez ezVar3 = (org.telegram.ui.ez) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList9 = ezVar3.M;
                ezVar3.O = false;
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject3;
                    ezVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    ezVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    ezVar3.C0();
                }
                ezVar3.N = 0;
                break;
            default:
                org.telegram.ui.ez ezVar4 = (org.telegram.ui.ez) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                org.telegram.messenger.mo moVar = ezVar4.r;
                if (s1Var != null) {
                    try {
                        s1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                ezVar4.getMessagesController().h4(moVar);
                org.telegram.messenger.qr messagesStorage2 = ezVar4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.pq(i11, messagesStorage2, moVar));
                ezVar4.finishFragment();
                break;
        }
    }

    public /* synthetic */ p11(org.telegram.ui.nt ntVar, a0.h hVar, int i3) {
        this.a = 16;
        this.b = ntVar;
        this.c = hVar;
    }
}
