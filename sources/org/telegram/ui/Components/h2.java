package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements org.telegram.ui.ActionBar.q1, a5, org.telegram.messenger.za, org.telegram.ui.Cells.r5, org.telegram.messenger.jc, bj, org.telegram.ui.ActionBar.f1, sj0, org.telegram.messenger.lr, rj0, tj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        org.telegram.messenger.fj threadMessage;
        switch (this.a) {
            case 7:
                ff ffVar = (ff) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = ffVar.a;
                long j3 = chatActivityEnterView.G3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(str, j3, fjVar, threadMessage, null, false, null, null, null, z10, i7, i10, null, false);
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                b10.K = bnVar != null ? bnVar.Y8() : null;
                b10.O = chatActivityEnterView.P6;
                org.telegram.messenger.zy.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                re reVar = chatActivityEnterView.K0;
                chatActivityEnterView.P6 = 0L;
                reVar.setEffect(0L);
                break;
            case 8:
                ((mg) this.b).L((qf) this.c, z10, i7, i10);
                break;
            default:
                tn tnVar = (tn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    tnVar.getClass();
                    break;
                } else {
                    tnVar.W = i7;
                    tnVar.V = 0;
                    if (!(view instanceof org.telegram.ui.Cells.n8)) {
                        tnVar.r.g(tnVar.J0);
                        break;
                    } else {
                        tnVar.Z((org.telegram.ui.Cells.n8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void a() {
        uo uoVar = (uo) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (uoVar.c != null) {
            uoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            uoVar.a();
        }
    }

    @Override // org.telegram.messenger.za
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        Location location;
        ml mlVar = (ml) this.b;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
        ImageView imageView = mlVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = mlVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = mlVar.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            mlVar.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            mlVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, mlVar.k0 - org.telegram.messenger.g0.L(10.0f)));
            mlVar.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = mlVar.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            mlVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            mlVar.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            mlVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, mlVar.k0));
            mlVar.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!mlVar.m0) {
                int i7 = org.telegram.ui.ActionBar.m6.lj;
                org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                mlVar.m0 = true;
            }
            org.telegram.messenger.da daVar = mlVar.E;
            if (daVar != null && (location = mlVar.j0) != null) {
                location.setLatitude(((org.telegram.messenger.ab) daVar.d().b).a);
                mlVar.j0.setLongitude(((org.telegram.messenger.ab) mlVar.E.d().b).b);
            }
            mlVar.L.L(mlVar.j0);
        }
        return gaVar.a(motionEvent).booleanValue();
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        y5 y5Var;
        b21 b21Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 17:
                ev evVar = (ev) obj2;
                Context context = (Context) obj;
                if ((view instanceof xu) && (y5Var = ((xu) view).c) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(evVar.getContext(), true, true);
                    y0Var.setItemHeight(48);
                    y0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                    y0Var.setText(org.telegram.messenger.gd.N0(2131751755, null));
                    y0Var.getTextView().setTextSize(1, 14.4f);
                    y0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                    y0Var.setOnClickListener(new m8(11, evVar, y5Var));
                    LinearLayout linearLayout = new LinearLayout(context);
                    Drawable mutate = evVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                    org.telegram.ui.ActionBar.t6.x(linearLayout, mutate, org.telegram.ui.ActionBar.m6.G8, evVar.J0, PorterDuff.Mode.MULTIPLY);
                    linearLayout.setBackground(mutate);
                    linearLayout.addView(y0Var);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    evVar.B1 = g1Var;
                    g1Var.setClippingEnabled(true);
                    evVar.B1.g();
                    evVar.B1.setInputMethodMode(2);
                    evVar.B1.setSoftInputMode(0);
                    evVar.B1.setOutsideTouchable(true);
                    evVar.B1.setAnimationStyle(R.style.PopupAnimation);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    evVar.B1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.ek ekVar = (org.telegram.ui.ek) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((d11) ((h11) obj2).s.c.get(i7)).a;
                if (tL_forumTopic != null && (b21Var = ekVar.a.g2) != null && b21Var.o(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        jt0 jt0Var = (jt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        g2Var.finishFragment();
        int i7 = org.telegram.messenger.ks.t;
        g2Var.getNotificationCenter().n((org.telegram.messenger.fs) g2Var, i7);
        g2Var.getNotificationCenter().k(i7, new Object[0]);
        g2Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(jt0Var.m1), user, null, Boolean.valueOf(z10));
        g2Var.getMessagesController().Z4(false);
    }

    @Override // org.telegram.ui.Cells.r5
    public void e(org.telegram.ui.Cells.s5 s5Var) {
        TLRPC.Chat chat;
        jm jmVar = (jm) this.b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.w;
        boolean z10 = chatAttachAlertPhotoLayout.w0;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i7 = uiVar.O2;
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
            if (i7 != 0 || uiVar.C1) {
                return;
            }
            int intValue = ((Integer) s5Var.getTag()).intValue();
            org.telegram.messenger.ef photoEntry = s5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.a0(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                new lc(uiVar.p3, chatAttachAlertPhotoLayout.a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(((org.telegram.messenger.j0) g2Var.getMessagesController().A7.j0.b).c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z11 = !containsKey;
            if (!containsKey && uiVar.Q3 >= 0 && hashMap.size() >= uiVar.Q3) {
                if (!uiVar.R3 || !(g2Var instanceof org.telegram.ui.bn) || (chat = ((org.telegram.ui.bn) g2Var).e) == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.M == 2) {
                    return;
                }
                c5.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745107, null), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.M == 1) {
                    chatAttachAlertPhotoLayout.M = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.u1.size() : -1;
            if ((g2Var instanceof org.telegram.ui.bn) && uiVar.R3) {
                s5Var.b(size, z11, true);
            } else {
                s5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.T(photoEntry, intValue);
            jm jmVar2 = chatAttachAlertPhotoLayout.w;
            if (jmVar == jmVar2) {
                jm jmVar3 = chatAttachAlertPhotoLayout.H;
                if (jmVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    intValue++;
                }
                if (jmVar3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                    intValue++;
                }
                jmVar3.g(intValue);
            } else {
                jmVar2.g(intValue);
            }
            uiVar.L1(containsKey ? 2 : 1);
            s5Var2.setHasSpoiler(photoEntry.M);
            s5Var2.setHighQuality(photoEntry.c());
            s5Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        h51 h51Var = (h51) this.b;
        org.telegram.messenger.v10 v10Var = (org.telegram.messenger.v10) this.c;
        o41 G = h51Var.g3.G(i7);
        if (G == null) {
            return;
        }
        v10Var.l(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 1:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.i5.r(g2Var.getCurrentAccount()).s(1));
                    g2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                i4 i4Var = (i4) this.b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.c;
                String trim = i4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : c5.a.matcher(trim.trim()).matches())) {
                    org.telegram.messenger.g0.D3(i4Var);
                    break;
                } else {
                    x10Var.a(trim);
                    t1Var.dismiss();
                    break;
                }
            case 3:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                tb0 tb0Var = (tb0) this.c;
                int i10 = encryptedChat.ttl;
                int value = tb0Var.getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i10 != encryptedChat.ttl) {
                    org.telegram.messenger.xv.i(org.telegram.messenger.j10.t0).z(encryptedChat, null);
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(org.telegram.messenger.j10.t0);
                    a02.a.c(new org.telegram.messenger.zp(a02, encryptedChat, 0));
                    break;
                }
                break;
            case 4:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g7.edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((org.telegram.messenger.lr) this.b).d(((boolean[]) this.c)[0]);
                break;
            case 16:
                ((nt) this.b).a(((di.q) this.c).getText().toString().trim());
                break;
            case 18:
                h30 h30Var = (h30) this.b;
                String str3 = (String) this.c;
                org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(h30Var.a);
                ArrayList arrayList = a10.f;
                int indexOf = arrayList.indexOf(str3);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                h30Var.f.O(true);
                break;
            case 19:
                um0 um0Var = (um0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                um0Var.getClass();
                t1Var.dismiss();
                um0Var.M0.getDownloadController().j(arrayList2);
                um0Var.N(false);
                break;
            case 21:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ri.b0(stickerSet);
                ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).sendRequest(tL_stickers_deleteStickerSet, new fi.l5(21));
                break;
            case 26:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 27:
                org.telegram.ui.qr qrVar = (org.telegram.ui.qr) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qrVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                qrVar.getContactsController().i(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                qrVar.finishFragment();
                break;
            case 28:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    break;
                }
                break;
            default:
                ContactsActivity.Z((ContactsActivity) this.b, (String) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.b;
        fi.n2 n2Var = (fi.n2) this.c;
        if (!arrayList.isEmpty()) {
            x10Var.a(new th.g((org.telegram.messenger.fj) arrayList.get(0)));
        }
        n2Var.a(true);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        om omVar = (om) this.b;
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.c;
        if (z10 && !z11 && efVar.M && omVar.d.n() == null) {
            if (omVar.d.n() != null && !omVar.d.n().isRecycled()) {
                omVar.d.n().recycle();
                omVar.d.w0(null);
            }
            omVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    public /* synthetic */ h2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 28;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean f(float f10, float f11, int i7, View view) {
        h51 h51Var = (h51) this.b;
        org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.c;
        o41 G = h51Var.g3.G(i7);
        if (G == null) {
            return false;
        }
        return w10Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
