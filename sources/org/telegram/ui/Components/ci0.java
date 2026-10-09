package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        boolean z10;
        boolean z11;
        int indexOf;
        int L;
        int i10;
        int i11;
        boolean z12 = false;
        float f10 = 1.0f;
        ArrayList arrayList = null;
        boolean z13 = false;
        Object[] objArr = 0;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                di0 di0Var = (di0) this.b;
                TLObject tLObject = (TLObject) this.c;
                di0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    di0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        di0Var.a(false);
                        break;
                    } else {
                        di0Var.d();
                        di0Var.c.W2.N(true);
                        break;
                    }
                }
                break;
            case 1:
                ii0 ii0Var = (ii0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = ii0Var.a;
                int i12 = ii0Var.x;
                int size = arrayList2.size();
                ii0Var.x = size;
                if (i12 != size && ii0Var.S != null) {
                    ii0Var.g();
                }
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    fi0 fi0Var = (fi0) arrayList3.get(i13);
                    if (fi0Var.o && !fi0Var.p) {
                        arrayList2.add(fi0Var);
                    } else if (ii0.j(fi0Var.a, arrayList2) == null) {
                        ii0 ii0Var2 = fi0Var.y;
                        float f11 = ii0Var2.N;
                        RectF rectF = fi0Var.c;
                        f7 = f10;
                        RectF rectF2 = fi0Var.f;
                        ia0 ia0Var = fi0Var.r;
                        if (ia0Var != null) {
                            ia0Var.a();
                            fi0Var.t = z13;
                            fi0Var.s = z13;
                        }
                        fi0Var.o = z14;
                        boolean z15 = rectF.left - f7 <= f11 ? z14 : z13;
                        boolean z16 = rectF.right + f7 >= ((float) ii0Var2.getMeasuredWidth()) - f11;
                        if (z15 && z16) {
                            z15 = false;
                            z16 = false;
                        }
                        fi0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z15) {
                            rectF2.right = rectF2.left;
                        } else if (z16) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = fi0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z10 = true;
                                if (ii0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z11 = false;
                                    fi0Var.e.d(0.0f, z10);
                                    arrayList2.add(fi0Var);
                                    i13++;
                                    z12 = z11;
                                    f10 = f7;
                                    z13 = false;
                                    z14 = true;
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z11 = false;
                            fi0Var.e.d(0.0f, z10);
                            arrayList2.add(fi0Var);
                            i13++;
                            z12 = z11;
                            f10 = f7;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = true;
                        z11 = false;
                        fi0Var.e.d(0.0f, z10);
                        arrayList2.add(fi0Var);
                        i13++;
                        z12 = z11;
                        f10 = f7;
                        z13 = false;
                        z14 = true;
                    }
                    f7 = f10;
                    z11 = z12;
                    i13++;
                    z12 = z11;
                    f10 = f7;
                    z13 = false;
                    z14 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                ii0Var.invalidate();
                break;
            case 2:
                ii0 ii0Var3 = (ii0) this.b;
                fi0 fi0Var2 = (fi0) this.c;
                hi0 hi0Var = ii0Var3.F;
                int i15 = fi0Var2.a;
                RectF rectF3 = fi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.jy0) hi0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 3:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                ViewParent viewParent = (ViewParent) this.c;
                u1Var.invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    break;
                }
                break;
            case 4:
                RLottieNative rLottieNative = (RLottieNative) this.b;
                RLottieNative rLottieNative2 = (RLottieNative) this.c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    break;
                }
                break;
            case 5:
                kk0 kk0Var = (kk0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = kk0Var.r;
                kk0Var.n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    jk0 jk0Var = (jk0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList5.size()) {
                            arrayList5.add(jk0Var);
                        } else if (MessageObject.getObjectPeerId(((jk0) arrayList5.get(i17)).a) != MessageObject.getObjectPeerId(jk0Var.a)) {
                            i17++;
                        } else if (jk0Var.c > 0) {
                            ((jk0) arrayList5.get(i17)).c = jk0Var.c;
                        }
                    }
                }
                q0.a aVar = kk0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                kk0Var.a();
                break;
            case 6:
                wo0 wo0Var = (wo0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList6 = wo0Var.K;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = wo0Var.L()) < wo0Var.h()) {
                    arrayList6.remove(indexOf);
                    wo0Var.u(L + 1 + indexOf);
                    int size4 = wo0Var.j0.e.size();
                    int size5 = arrayList6.size();
                    if (wo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        wo0Var.u(L);
                        break;
                    }
                }
                break;
            case 7:
                wo0 wo0Var2 = (wo0) this.b;
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.c;
                wo0Var2.T();
                ad.a0(tyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 8:
                ((hp0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 9:
                hf hfVar = (hf) this.b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    hfVar.dismiss();
                    break;
                }
                break;
            case 10:
                ((WindowManager) this.c).removeView(((hf) this.b).B);
                break;
            case 11:
                mr0 mr0Var = (mr0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    mr0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mr0Var.a1();
                    if (mr0Var.m0) {
                        mr0Var.N0();
                    }
                }
                mr0Var.l0 = false;
                break;
            case 12:
                uu0 uu0Var = (uu0) this.b;
                tr0 tr0Var = (tr0) this.c;
                uu0Var.G = null;
                uu0Var.H = null;
                tr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new vd0(tr0Var, 14)).start();
                break;
            case 13:
                bw0 bw0Var = (bw0) this.b;
                ai.f9 f9Var = (ai.f9) this.c;
                ws0 ws0Var = bw0Var.W;
                if (ws0Var != null) {
                    int i18 = f9Var.a;
                    ws0Var.n.d(i18, ws0Var.s.i(i18));
                    break;
                }
                break;
            case 14:
                ad.a0(((ku0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 15:
                xu0 xu0Var = (xu0) this.b;
                String str = (String) this.c;
                if (!xu0Var.v.t1[xu0Var.r].a.isEmpty() && ((i10 = xu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, xu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    bw0 bw0Var2 = xu0Var.v;
                    xu0Var.F(id2, str, dialogId, bw0Var2.j1 == bw0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (xu0Var.r == 3) {
                    bw0 bw0Var3 = xu0Var.v;
                    xu0Var.F(0, str, bw0Var3.j1, bw0Var3.F);
                }
                int i19 = xu0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList7 = new ArrayList(xu0Var.v.t1[xu0Var.r].a);
                    xu0Var.s++;
                    Utilities.searchQueue.postRunnable(new og0(xu0Var, str, arrayList7, 10));
                    break;
                }
                break;
            case 16:
                xu0 xu0Var2 = (xu0) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                bw0 bw0Var4 = xu0Var2.v;
                boolean z17 = bw0Var4.V0;
                uu0[] uu0VarArr = bw0Var4.k0;
                if (z17) {
                    xu0Var2.s--;
                    int h = xu0Var2.h();
                    xu0Var2.d = arrayList8;
                    int h10 = xu0Var2.h();
                    if (xu0Var2.s == 0 || h10 != 0) {
                        bw0Var4.m1(false);
                    }
                    for (int i20 = 0; i20 < uu0VarArr.length; i20++) {
                        uu0 uu0Var2 = uu0VarArr[i20];
                        if (uu0Var2.F == xu0Var2.r) {
                            if (xu0Var2.s == 0 && h10 == 0) {
                                uu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                uu0VarArr[i20].w.f.setVisibility(8);
                                uu0VarArr[i20].w.e(false, true);
                            } else if (h == 0) {
                                bw0Var4.z(uu0Var2.h, 0, null);
                            }
                        }
                    }
                    xu0Var2.l();
                    break;
                }
                break;
            case 17:
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.b;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, tLObject3, document, null, bool);
                break;
            case 18:
                MessagesController.getInstance(((jz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 19:
                c41 c41Var = (c41) this.b;
                MessagesController.getInstance(c41Var.b).getTopicsController().deleteTopics(-c41Var.c, (ArrayList) this.c);
                int i22 = c41.f0;
                break;
            case 20:
                c41 c41Var2 = (c41) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                c41Var2.getClass();
                MessagesController.getInstance(c41Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 21:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.g0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 22:
                b51.q((b51) this.b, (TLObject) this.c);
                break;
            case 23:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                s51.a(alVar.getContext(), alVar.d);
                break;
            case 24:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.al) this.b).b, false);
                break;
            case 25:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.vo0((TLRPC.PaymentReceipt) tLObject4));
                    break;
                } else {
                    int i23 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 26:
                ((p61) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 27:
                k81 k81Var = (k81) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.o) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = k81Var.n;
                    if (textureView == null || ((k81Var.E || !(cause instanceof r2.q)) && !(cause instanceof a3.x))) {
                        k81Var.J.onError(k81Var, u0Var);
                        break;
                    } else {
                        k81Var.E = true;
                        if (k81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(k81Var.n);
                                viewGroup.removeView(k81Var.n);
                                viewGroup.addView(k81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = k81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new c81(k81Var, objArr == true ? 1 : 0));
                                break;
                            } else {
                                i2.f0 f0Var = k81Var.d;
                                TextureView textureView2 = k81Var.n;
                                f0Var.D1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.D1();
                                    f0Var.q1();
                                    f0Var.v1(null);
                                    f0Var.o1(0, 0);
                                }
                                k81Var.d.x1(k81Var.n);
                                ArrayList arrayList9 = k81Var.N;
                                if (arrayList9 != null) {
                                    k81Var.F(arrayList9, k81Var.O);
                                } else if (k81Var.U) {
                                    k81Var.G(k81Var.Q, k81Var.S, k81Var.R, k81Var.T);
                                } else {
                                    k81Var.D(k81Var.Q, k81Var.S);
                                }
                                k81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = k81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList10 = k81Var.N;
                    if (arrayList10 != null) {
                        int i24 = 0;
                        while (i24 < arrayList10.size()) {
                            g81 g81Var = (g81) arrayList10.get(i24);
                            int i25 = 0;
                            while (true) {
                                ArrayList arrayList11 = g81Var.d;
                                if (i25 < arrayList11.size()) {
                                    i81 i81Var = (i81) arrayList11.get(i25);
                                    if (!TextUtils.isEmpty(i81Var.m) && !k81.Y(i81Var.m)) {
                                        arrayList11.remove(i25);
                                        i25--;
                                    }
                                    i25++;
                                } else {
                                    if (arrayList11.isEmpty()) {
                                        arrayList10.remove(i24);
                                        i24--;
                                    }
                                    i24++;
                                }
                            }
                        }
                        arrayList = arrayList10;
                    }
                    k81Var.N = arrayList;
                    if (arrayList != null) {
                        k81Var.F(arrayList, k81Var.O);
                        break;
                    }
                }
                break;
            case 28:
                ((j81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            default:
                s81 s81Var = (s81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (s81Var.w != null) {
                        Bitmap bitmap2 = s81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        s81Var.v = s81Var.w;
                    }
                    s81Var.w = bitmap;
                    Bitmap bitmap3 = s81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    s81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(s81Var.L);
                    s81Var.J.setShader(s81Var.G);
                    s81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = s81Var.getLayoutParams();
                    if (s81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        s81Var.setVisibility(0);
                        s81Var.requestLayout();
                    }
                }
                s81Var.f = null;
                break;
        }
    }

    public /* synthetic */ ci0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ci0(TLObject tLObject, TLRPC.Document document) {
        this.a = 17;
        this.c = tLObject;
        this.b = document;
    }
}
