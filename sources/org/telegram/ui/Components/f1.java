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
import android.widget.EditText;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements org.telegram.ui.ActionBar.q1, r4, org.telegram.messenger.ab, org.telegram.ui.Cells.p5, org.telegram.messenger.kc, si, org.telegram.ui.ActionBar.f1, ij0, org.telegram.messenger.nr, hj0, jj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fm fmVar = (fm) this.b;
        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.c;
        if (z10 && !z11 && ffVar.M && fmVar.d.n() == null) {
            if (fmVar.d.n() != null && !fmVar.d.n().isRecycled()) {
                fmVar.d.n().recycle();
                fmVar.d.w0(null);
            }
            fmVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        org.telegram.messenger.gj threadMessage;
        switch (this.a) {
            case 8:
                we weVar = (we) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = weVar.a;
                long j3 = chatActivityEnterView.y3;
                org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(str, j3, gjVar, threadMessage, null, false, null, null, null, z10, i7, i10, null, false);
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                b10.K = anVar != null ? anVar.Y8() : null;
                b10.O = chatActivityEnterView.n6;
                org.telegram.messenger.ez.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                he heVar = chatActivityEnterView.K0;
                chatActivityEnterView.n6 = 0L;
                heVar.setEffect(0L);
                break;
            case 9:
                ((bg) this.b).L((ff) this.c, z10, i7, i10);
                break;
            default:
                jn jnVar = (jn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    jnVar.getClass();
                    break;
                } else {
                    jnVar.W = i7;
                    jnVar.V = 0;
                    if (!(view instanceof org.telegram.ui.Cells.l8)) {
                        jnVar.r.g(jnVar.J0);
                        break;
                    } else {
                        jnVar.Z((org.telegram.ui.Cells.l8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void a() {
        lo loVar = (lo) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (loVar.c != null) {
            loVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            loVar.a();
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        p5 p5Var;
        p11 p11Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 18:
                wu wuVar = (wu) obj2;
                Context context = (Context) obj;
                if ((view instanceof pu) && (p5Var = ((pu) view).c) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(wuVar.getContext(), true, true);
                    z0Var.setItemHeight(48);
                    z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                    z0Var.setText(org.telegram.messenger.hd.M0(2131751767, null));
                    z0Var.getTextView().setTextSize(1, 14.4f);
                    z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                    z0Var.setOnClickListener(new n2(16, wuVar, p5Var));
                    LinearLayout linearLayout = new LinearLayout(context);
                    Drawable mutate = wuVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                    org.telegram.ui.ActionBar.q6.x(linearLayout, mutate, org.telegram.ui.ActionBar.j6.G8, wuVar.J0, PorterDuff.Mode.MULTIPLY);
                    linearLayout.setBackground(mutate);
                    linearLayout.addView(z0Var);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    wuVar.B1 = g1Var;
                    g1Var.setClippingEnabled(true);
                    wuVar.B1.g();
                    wuVar.B1.setInputMethodMode(2);
                    wuVar.B1.setSoftInputMode(0);
                    wuVar.B1.setOutsideTouchable(true);
                    wuVar.B1.setAnimationStyle(R.style.PopupAnimation);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    wuVar.B1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((s01) ((v01) obj2).s.c.get(i7)).a;
                if (tL_forumTopic != null && (p11Var = dkVar.a.g2) != null && p11Var.o(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.messenger.ab
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        Location location;
        dl dlVar = (dl) this.b;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
        ImageView imageView = dlVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = dlVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = dlVar.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            dlVar.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            dlVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, dlVar.k0 - org.telegram.messenger.g0.L(10.0f)));
            dlVar.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = dlVar.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            dlVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            dlVar.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            dlVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, dlVar.k0));
            dlVar.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!dlVar.m0) {
                int i7 = org.telegram.ui.ActionBar.j6.lj;
                org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                dlVar.m0 = true;
            }
            org.telegram.messenger.ea eaVar = dlVar.E;
            if (eaVar != null && (location = dlVar.j0) != null) {
                location.setLatitude(((org.telegram.messenger.bb) eaVar.d().b).a);
                dlVar.j0.setLongitude(((org.telegram.messenger.bb) dlVar.E.d().b).b);
            }
            dlVar.L.L(dlVar.j0);
        }
        return haVar.a(motionEvent).booleanValue();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.p5
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        TLRPC.Chat chat;
        am amVar = (am) this.b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.w;
        boolean z10 = chatAttachAlertPhotoLayout.w0;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i7 = kiVar.O2;
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
            if (i7 != 0 || kiVar.C1) {
                return;
            }
            int intValue = ((Integer) q5Var.getTag()).intValue();
            org.telegram.messenger.ff photoEntry = q5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.a0(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                new cc(kiVar.p3, chatAttachAlertPhotoLayout.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(((org.telegram.messenger.j0) e2Var.getMessagesController().y7.d0.b).c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z11 = !containsKey;
            if (!containsKey && kiVar.Q3 >= 0 && hashMap.size() >= kiVar.Q3) {
                if (!kiVar.R3 || !(e2Var instanceof org.telegram.ui.an) || (chat = ((org.telegram.ui.an) e2Var).e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.M == 2) {
                    return;
                }
                t4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745303, null), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.M == 1) {
                    chatAttachAlertPhotoLayout.M = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.u1.size() : -1;
            if ((e2Var instanceof org.telegram.ui.an) && kiVar.R3) {
                q5Var.b(size, z11, true);
            } else {
                q5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.T(photoEntry, intValue);
            am amVar2 = chatAttachAlertPhotoLayout.w;
            if (amVar == amVar2) {
                am amVar3 = chatAttachAlertPhotoLayout.H;
                if (amVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    intValue++;
                }
                if (amVar3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                    intValue++;
                }
                amVar3.g(intValue);
            } else {
                amVar2.g(intValue);
            }
            kiVar.K1(containsKey ? 2 : 1);
            q5Var2.setHasSpoiler(photoEntry.M);
            q5Var2.setHighQuality(photoEntry.c());
            q5Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        u41 u41Var = (u41) this.b;
        org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.c;
        b41 G = u41Var.g3.G(i7);
        if (G == null) {
            return;
        }
        x10Var.m(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                li.v vVar = (li.v) this.b;
                EditText editText = (EditText) this.c;
                t1Var.dismiss();
                vVar.a(editText.getText().toString());
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                org.telegram.messenger.pr prVar = (org.telegram.messenger.pr) this.c;
                int i10 = iArr[0];
                prVar.a(i10 == 0 ? 900 : i10 == 1 ? 3600 : i10 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 3:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.g5.r(e2Var.getCurrentAccount()).s(1));
                    e2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 4:
                z3 z3Var = (z3) this.b;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.c;
                String trim = z3Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : t4.a.matcher(trim.trim()).matches())) {
                    org.telegram.messenger.g0.E3(z3Var);
                    break;
                } else {
                    z10Var.a(trim);
                    t1Var.dismiss();
                    break;
                }
            case 5:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                ib0 ib0Var = (ib0) this.c;
                int i11 = encryptedChat.ttl;
                int value = ib0Var.getValue();
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
                if (i11 != encryptedChat.ttl) {
                    org.telegram.messenger.bw.i(org.telegram.messenger.m10.t0).z(encryptedChat, null);
                    org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(org.telegram.messenger.m10.t0);
                    a02.a.c(new org.telegram.messenger.bq(a02, encryptedChat, 0));
                    break;
                }
                break;
            case 6:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e7.edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((org.telegram.messenger.nr) this.b).j(((boolean[]) this.c)[0]);
                break;
            case 17:
                ((et) this.b).a(((di.q) this.c).getText().toString().trim());
                break;
            case 19:
                w20 w20Var = (w20) this.b;
                String str3 = (String) this.c;
                org.telegram.messenger.na a10 = org.telegram.messenger.na.a(w20Var.a);
                ArrayList arrayList = a10.f;
                int indexOf = arrayList.indexOf(str3);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                w20Var.f.O(true);
                break;
            case 20:
                jm0 jm0Var = (jm0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                jm0Var.getClass();
                t1Var.dismiss();
                jm0Var.M0.getDownloadController().j(arrayList2);
                jm0Var.Q(false);
                break;
            case 22:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.si.Z(stickerSet);
                ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_stickers_deleteStickerSet, new fi.m5(21));
                break;
            case 27:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent2);
                break;
            case 28:
                org.telegram.ui.pr prVar2 = (org.telegram.ui.pr) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                prVar2.getClass();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                prVar2.getContactsController().i(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                prVar2.finishFragment();
                break;
            default:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.yr yrVar = contactsActivity.V;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.V = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        ys0 ys0Var = (ys0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        e2Var.finishFragment();
        int i7 = org.telegram.messenger.ns.t;
        e2Var.getNotificationCenter().n((org.telegram.messenger.is) e2Var, i7);
        e2Var.getNotificationCenter().k(i7, new Object[0]);
        e2Var.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(ys0Var.m1), user, null, Boolean.valueOf(z10));
        e2Var.getMessagesController().O4(false);
    }

    @Override // org.telegram.ui.Components.si
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.b;
        fi.p2 p2Var = (fi.p2) this.c;
        if (!arrayList.isEmpty()) {
            z10Var.a(new th.g((org.telegram.messenger.gj) arrayList.get(0)));
        }
        p2Var.a(true);
    }

    public /* synthetic */ f1(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 29;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.jj0
    public boolean f(float f10, float f11, int i7, View view) {
        u41 u41Var = (u41) this.b;
        org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.c;
        b41 G = u41Var.g3.G(i7);
        if (G == null) {
            return false;
        }
        return y10Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.jj0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.jj0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
