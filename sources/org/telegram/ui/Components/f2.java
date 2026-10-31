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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements org.telegram.ui.ActionBar.u1, q4, org.telegram.messenger.bb, org.telegram.ui.Cells.u5, org.telegram.messenger.mc, ji, org.telegram.ui.ActionBar.j1, ik0, org.telegram.messenger.zr, hk0, jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        org.telegram.messenger.jj threadMessage;
        switch (this.a) {
            case 4:
                re reVar = (re) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = reVar.a;
                long j10 = chatActivityEnterView.Q2;
                org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(str, j10, jjVar, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                b10.K = unVar != null ? unVar.P8() : null;
                b10.O = chatActivityEnterView.S4;
                org.telegram.messenger.qz.C(chatActivityEnterView.Q).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                be beVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                beVar.setEffect(0L);
                break;
            case 5:
                ((rf) this.b).K((m2.t) this.c, z10, i10, i11);
                break;
            case 6:
            default:
                jn jnVar = (jn) this.b;
                View view = (View) this.c;
                if (!z10) {
                    jnVar.getClass();
                    break;
                } else {
                    jnVar.V = i10;
                    jnVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.p8)) {
                        jnVar.r.g(jnVar.I0);
                        break;
                    } else {
                        jnVar.X((org.telegram.ui.Cells.p8) view, true);
                        break;
                    }
                }
            case 7:
                yk ykVar = (yk) this.b;
                al alVar = (al) this.c;
                bl blVar = ykVar.b;
                blVar.u0.d(alVar.c, blVar.v0, z10, i10, 0L);
                blVar.b.a(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.j1
    public void a() {
        ko koVar = (ko) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (koVar.c != null) {
            koVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            koVar.a();
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 21:
                u51 u51Var = (u51) this.b;
                org.telegram.messenger.o20 o20Var = (org.telegram.messenger.o20) this.c;
                a51 G = u51Var.f3.G(i10);
                if (G != null) {
                    o20Var.k(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
                    break;
                }
                break;
            default:
                DataSettingsActivity.Y((DataSettingsActivity) this.b, (Context) this.c, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.messenger.bb
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ja jaVar) {
        Location location;
        bl blVar = (bl) this.b;
        org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.c;
        ImageView imageView = blVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = blVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = blVar.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            blVar.d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            blVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, blVar.p0 - org.telegram.messenger.i0.L(10.0f)));
            blVar.d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = blVar.d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            blVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            blVar.d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            blVar.d0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, blVar.p0));
            blVar.d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!blVar.r0) {
                int i10 = org.telegram.ui.ActionBar.t6.ij;
                org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                blVar.r0 = true;
            }
            org.telegram.messenger.ga gaVar = blVar.F;
            if (gaVar != null && (location = blVar.o0) != null) {
                location.setLatitude(((org.telegram.messenger.cb) gaVar.d().b).a);
                blVar.o0.setLongitude(((org.telegram.messenger.cb) blVar.F.d().b).b);
            }
            blVar.M.M(blVar.o0);
        }
        return jaVar.a(motionEvent).booleanValue();
    }

    @Override // org.telegram.ui.Cells.u5
    public void d(org.telegram.ui.Cells.v5 v5Var) {
        TLRPC.Chat chat;
        bm bmVar = (bm) this.b;
        org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.w;
        boolean z10 = chatAttachAlertPhotoLayout.v0;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i10 = biVar.K2;
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (i10 != 0 || biVar.y1) {
                return;
            }
            int intValue = ((Integer) v5Var.getTag()).intValue();
            org.telegram.messenger.ef photoEntry = v5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.Y(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                new cc(biVar.l3, chatAttachAlertPhotoLayout.a).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(((org.telegram.messenger.l0) k2Var.getMessagesController().y7.d0.a).c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z11 = !containsKey;
            if (!containsKey && biVar.M3 >= 0 && hashMap.size() >= biVar.M3) {
                if (!biVar.N3 || !(k2Var instanceof org.telegram.ui.un) || (chat = ((org.telegram.ui.un) k2Var).e) == null || org.telegram.messenger.w3.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                s4.N(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.cd.L0(2131745328, null), org.telegram.messenger.cd.L0(2131745321, null), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((k2Var instanceof org.telegram.ui.un) && biVar.N3) {
                v5Var.b(size, z11, true);
            } else {
                v5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.R(photoEntry, intValue);
            bm bmVar2 = chatAttachAlertPhotoLayout.w;
            if (bmVar == bmVar2) {
                bm bmVar3 = chatAttachAlertPhotoLayout.G;
                if (bmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (bmVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                bmVar3.g(intValue);
            } else {
                bmVar2.g(intValue);
            }
            biVar.J1(containsKey ? 2 : 1);
            v5Var2.setHasSpoiler(photoEntry.M);
            v5Var2.setHighQuality(photoEntry.c());
            v5Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        o5 o5Var;
        o21 o21Var;
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 15:
                cv cvVar = (cv) obj2;
                Context context = (Context) obj;
                if ((view instanceof vu) && (o5Var = ((vu) view).c) != null) {
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(cvVar.getContext(), true, true);
                    b1Var.setItemHeight(48);
                    b1Var.setPadding(org.telegram.messenger.i0.L(26.0f), 0, org.telegram.messenger.i0.L(26.0f), 0);
                    b1Var.setText(org.telegram.messenger.cd.L0(2131751767, null));
                    b1Var.getTextView().setTextSize(1, 14.4f);
                    b1Var.getTextView().setTypeface(org.telegram.messenger.i0.o());
                    b1Var.setOnClickListener(new sr(2, cvVar, o5Var));
                    LinearLayout linearLayout = new LinearLayout(context);
                    Drawable mutate = cvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                    org.telegram.ui.ActionBar.a7.y(linearLayout, mutate, org.telegram.ui.ActionBar.t6.G8, cvVar.I0, PorterDuff.Mode.MULTIPLY);
                    linearLayout.setBackground(mutate);
                    linearLayout.addView(b1Var);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(linearLayout, -2, -2);
                    cvVar.x1 = k1Var;
                    k1Var.setClippingEnabled(true);
                    cvVar.x1.g();
                    cvVar.x1.setInputMethodMode(2);
                    cvVar.x1.setSoftInputMode(0);
                    cvVar.x1.setOutsideTouchable(true);
                    cvVar.x1.setAnimationStyle(R.style.PopupAnimation);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    cvVar.x1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.i0.L(49.0f)), iArr[1] - org.telegram.messenger.i0.L(52.0f));
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.al alVar = (org.telegram.ui.al) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((r11) ((t11) obj2).w.c.get(i10)).a;
                if (tL_forumTopic != null && (o21Var = alVar.a.f2) != null && o21Var.o(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                y3 y3Var = (y3) this.b;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.c;
                String trim = y3Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : s4.a.matcher(trim.trim()).matches())) {
                    org.telegram.messenger.i0.E3(y3Var);
                    break;
                } else {
                    q20Var.a(trim);
                    x1Var.dismiss();
                    break;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                ac0 ac0Var = (ac0) this.c;
                int i11 = encryptedChat.ttl;
                int value = ac0Var.getValue();
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
                    org.telegram.messenger.ow.i(org.telegram.messenger.d20.s0).z(encryptedChat, null);
                    org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(org.telegram.messenger.d20.s0);
                    a02.a.c(new org.telegram.messenger.kq(a02, encryptedChat, 0));
                    break;
                }
                break;
            case 2:
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).e7.edit();
                edit.remove("color_" + str);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ((org.telegram.messenger.zr) this.b).i(((boolean[]) this.c)[0]);
                break;
            case 14:
                ((lt) this.b).a(((org.telegram.ui.zd) this.c).getText().toString().trim());
                break;
            case 16:
                l30 l30Var = (l30) this.b;
                String str2 = (String) this.c;
                org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(l30Var.a);
                ArrayList arrayList = a2.f;
                int indexOf = arrayList.indexOf(str2);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a2.d();
                }
                l30Var.f.O(true);
                break;
            case 17:
                gn0 gn0Var = (gn0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                gn0Var.getClass();
                x1Var.dismiss();
                gn0Var.L0.getDownloadController().j(arrayList2);
                gn0Var.R(false);
                break;
            case 19:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ui.Z(stickerSet);
                ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_stickers_deleteStickerSet, new ag.c3(16));
                break;
            case 24:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 25:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                nsVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                nsVar.getContactsController().i(arrayList3, true);
                if (user != null) {
                    user.contact = false;
                }
                nsVar.finishFragment();
                break;
            case 26:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.vs vsVar = contactsActivity.U;
                if (vsVar != null) {
                    vsVar.c(user2);
                    contactsActivity.U = null;
                    break;
                }
                break;
            case 27:
                ContactsActivity.Y((ContactsActivity) this.b, (String) this.c);
                break;
            default:
                org.telegram.ui.dv.Y((org.telegram.ui.dv) this.b, (TLRPC.User) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        zt0 zt0Var = (zt0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        k2Var.finishFragment();
        int i10 = org.telegram.messenger.zs.t;
        k2Var.getNotificationCenter().n((org.telegram.messenger.us) k2Var, i10);
        k2Var.getNotificationCenter().k(i10, new Object[0]);
        k2Var.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(zt0Var.l1), user, null, Boolean.valueOf(z10));
        k2Var.getMessagesController().K4(false);
    }

    @Override // org.telegram.ui.Components.ji
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.c;
        ag.v vVar = (ag.v) this.b;
        if (!arrayList.isEmpty()) {
            q20Var.a(new jh.i((org.telegram.messenger.jj) arrayList.get(0)));
        }
        vVar.a(true);
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        gm gmVar = (gm) this.b;
        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.c;
        if (z10 && !z11 && efVar.M && gmVar.d.n() == null) {
            if (gmVar.d.n() != null && !gmVar.d.n().isRecycled()) {
                gmVar.d.n().recycle();
                gmVar.d.w0(null);
            }
            gmVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    public /* synthetic */ f2(org.telegram.messenger.q20 q20Var, ag.v vVar) {
        this.a = 12;
        this.c = q20Var;
        this.b = vVar;
    }

    public /* synthetic */ f2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 26;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        u51 u51Var = (u51) this.b;
        org.telegram.messenger.p20 p20Var = (org.telegram.messenger.p20) this.c;
        a51 G = u51Var.f3.G(i10);
        if (G == null) {
            return false;
        }
        return p20Var.a(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10)).booleanValue();
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.jk0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void k(View view, float f7, float f10) {
    }
}
