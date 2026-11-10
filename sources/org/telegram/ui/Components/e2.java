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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements org.telegram.ui.ActionBar.r1, s4, org.telegram.messenger.bb, org.telegram.ui.Cells.p5, org.telegram.messenger.lc, ji, org.telegram.ui.ActionBar.f1, dj0, org.telegram.messenger.qr, cj0, ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.ij threadMessage;
        switch (this.a) {
            case 4:
                ve veVar = (ve) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = veVar.a;
                long j3 = chatActivityEnterView.Q2;
                org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(str, j3, ijVar, threadMessage, null, false, null, null, null, z9, i7, i10, null, false);
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                b10.K = cnVar != null ? cnVar.X8() : null;
                b10.O = chatActivityEnterView.S4;
                org.telegram.messenger.gz.C(chatActivityEnterView.Q).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                fe feVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                feVar.setEffect(0L);
                break;
            case 5:
                ((uf) this.b).K((qt) this.c, z9, i7, i10);
                break;
            default:
                an anVar = (an) this.b;
                View view = (View) this.c;
                if (!z9) {
                    anVar.getClass();
                    break;
                } else {
                    anVar.V = i7;
                    anVar.U = 0;
                    if (!(view instanceof org.telegram.ui.Cells.m8)) {
                        anVar.r.g(anVar.I0);
                        break;
                    } else {
                        anVar.Z((org.telegram.ui.Cells.m8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void a() {
        ao aoVar = (ao) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (aoVar.c != null) {
            aoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            aoVar.a();
        }
    }

    @Override // org.telegram.messenger.bb
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        Location location;
        vk vkVar = (vk) this.b;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
        ImageView imageView = vkVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = vkVar.O;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = vkVar.a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            vkVar.a0 = animatorSet2;
            animatorSet2.setDuration(200L);
            vkVar.a0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, vkVar.j0 - org.telegram.messenger.g0.L(10.0f)));
            vkVar.a0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = vkVar.a0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            vkVar.G = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            vkVar.a0 = animatorSet4;
            animatorSet4.setDuration(200L);
            vkVar.a0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, vkVar.j0));
            vkVar.a0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!vkVar.l0) {
                int i7 = org.telegram.ui.ActionBar.m6.ij;
                org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i7));
                vkVar.l0 = true;
            }
            org.telegram.messenger.fa faVar = vkVar.D;
            if (faVar != null && (location = vkVar.i0) != null) {
                location.setLatitude(((org.telegram.messenger.cb) faVar.d().b).a);
                vkVar.i0.setLongitude(((org.telegram.messenger.cb) vkVar.D.d().b).b);
            }
            vkVar.K.L(vkVar.i0);
        }
        return iaVar.a(motionEvent).booleanValue();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        q5 q5Var;
        m11 m11Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 14:
                qu quVar = (qu) obj2;
                Context context = (Context) obj;
                if ((view instanceof ju) && (q5Var = ((ju) view).c) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(quVar.getContext(), true, true);
                    z0Var.setItemHeight(48);
                    z0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                    z0Var.setText(org.telegram.messenger.id.M0(2131751767, null));
                    z0Var.getTextView().setTextSize(1, 14.4f);
                    z0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                    z0Var.setOnClickListener(new kk(9, quVar, q5Var));
                    LinearLayout linearLayout = new LinearLayout(context);
                    Drawable mutate = quVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                    org.telegram.ui.ActionBar.t6.x(linearLayout, mutate, org.telegram.ui.ActionBar.m6.G8, quVar.I0, PorterDuff.Mode.MULTIPLY);
                    linearLayout.setBackground(mutate);
                    linearLayout.addView(z0Var);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(linearLayout, -2, -2);
                    quVar.A1 = g1Var;
                    g1Var.setClippingEnabled(true);
                    quVar.A1.g();
                    quVar.A1.setInputMethodMode(2);
                    quVar.A1.setSoftInputMode(0);
                    quVar.A1.setOutsideTouchable(true);
                    quVar.A1.setAnimationStyle(R.style.PopupAnimation);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    quVar.A1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.fk fkVar = (org.telegram.ui.fk) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((p01) ((s01) obj2).s.c.get(i7)).a;
                if (tL_forumTopic != null && (m11Var = fkVar.a.f2) != null && m11Var.o(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.p5
    public void d(org.telegram.ui.Cells.q5 q5Var) {
        TLRPC.Chat chat;
        sl slVar = (sl) this.b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.w;
        boolean z9 = chatAttachAlertPhotoLayout.v0;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        if (z9) {
            int i7 = ciVar.N2;
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            if (i7 != 0 || ciVar.B1) {
                return;
            }
            int intValue = ((Integer) q5Var.getTag()).intValue();
            org.telegram.messenger.gf photoEntry = q5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.a0(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                new gc(ciVar.o3, chatAttachAlertPhotoLayout.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(((org.telegram.messenger.j0) f2Var.getMessagesController().x7.d0.b).c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z10 = !containsKey;
            if (!containsKey && ciVar.P3 >= 0 && hashMap.size() >= ciVar.P3) {
                if (!ciVar.Q3 || !(f2Var instanceof org.telegram.ui.cn) || (chat = ((org.telegram.ui.cn) f2Var).e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.L == 2) {
                    return;
                }
                u4.L(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.L == 1) {
                    chatAttachAlertPhotoLayout.L = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.t1.size() : -1;
            if ((f2Var instanceof org.telegram.ui.cn) && ciVar.Q3) {
                q5Var.b(size, z10, true);
            } else {
                q5Var.b(-1, z10, true);
            }
            chatAttachAlertPhotoLayout.S(photoEntry, intValue);
            sl slVar2 = chatAttachAlertPhotoLayout.w;
            if (slVar == slVar2) {
                sl slVar3 = chatAttachAlertPhotoLayout.G;
                if (slVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                    intValue++;
                }
                if (slVar3.f && intValue >= chatAttachAlertPhotoLayout.M0) {
                    intValue++;
                }
                slVar3.g(intValue);
            } else {
                slVar2.g(intValue);
            }
            ciVar.K1(containsKey ? 2 : 1);
            q5Var2.setHasSpoiler(photoEntry.M);
            q5Var2.setHighQuality(photoEntry.c());
            q5Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.c;
        di.u2 u2Var = (di.u2) this.b;
        if (!arrayList.isEmpty()) {
            c20Var.a(new th.g((org.telegram.messenger.ij) arrayList.get(0)));
        }
        u2Var.a(true);
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 20:
                r41 r41Var = (r41) this.b;
                org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) this.c;
                x31 G = r41Var.f3.G(i7);
                if (G != null) {
                    a20Var.i(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11));
                    break;
                }
                break;
            default:
                DataSettingsActivity.Z((DataSettingsActivity) this.b, (Context) this.c, view, i7, f10);
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        xl xlVar = (xl) this.b;
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.c;
        if (z9 && !z10 && gfVar.M && xlVar.d.n() == null) {
            if (xlVar.d.n() != null && !xlVar.d.n().isRecycled()) {
                xlVar.d.n().recycle();
                xlVar.d.w0(null);
            }
            xlVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                a4 a4Var = (a4) this.b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.c;
                String trim = a4Var.getText().toString().trim();
                if (!(TextUtils.isEmpty(trim) ? false : u4.a.matcher(trim.trim()).matches())) {
                    org.telegram.messenger.g0.F3(a4Var);
                    break;
                } else {
                    c20Var.a(trim);
                    u1Var.dismiss();
                    break;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                hb0 hb0Var = (hb0) this.c;
                int i10 = encryptedChat.ttl;
                int value = hb0Var.getValue();
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
                    org.telegram.messenger.dw.i(org.telegram.messenger.p10.s0).z(encryptedChat, null);
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(org.telegram.messenger.p10.s0);
                    a02.a.c(new org.telegram.messenger.eq(a02, encryptedChat, 0));
                    break;
                }
                break;
            case 2:
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).d7.edit();
                edit.remove("color_" + str);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ((org.telegram.messenger.qr) this.b).k(((boolean[]) this.c)[0]);
                break;
            case 13:
                ((xs) this.b).a(((bi.v) this.c).getText().toString().trim());
                break;
            case 15:
                t20 t20Var = (t20) this.b;
                String str2 = (String) this.c;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(t20Var.a);
                ArrayList arrayList = a10.f;
                int indexOf = arrayList.indexOf(str2);
                if (indexOf != -1) {
                    arrayList.remove(indexOf);
                    a10.d();
                }
                t20Var.f.O(true);
                break;
            case 16:
                fm0 fm0Var = (fm0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                fm0Var.getClass();
                u1Var.dismiss();
                fm0Var.L0.getDownloadController().j(arrayList2);
                fm0Var.R(false);
                break;
            case 18:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.c;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.ui.Z(stickerSet);
                ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_stickers_deleteStickerSet, new di.v5(21));
                break;
            case 23:
                Context context = (Context) this.b;
                File file = (File) this.c;
                Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                context.startActivity(intent);
                break;
            case 24:
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
            case 25:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.yr yrVar = contactsActivity.U;
                if (yrVar != null) {
                    yrVar.b(user2);
                    contactsActivity.U = null;
                    break;
                }
                break;
            case 26:
                ContactsActivity.Z((ContactsActivity) this.b, (String) this.c);
                break;
            default:
                org.telegram.ui.du.Z((org.telegram.ui.du) this.b, (TLRPC.User) this.c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        ys0 ys0Var = (ys0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
        f2Var.finishFragment();
        int i7 = org.telegram.messenger.qs.t;
        f2Var.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, i7);
        f2Var.getNotificationCenter().k(i7, new Object[0]);
        f2Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(ys0Var.l1), user, null, Boolean.valueOf(z9));
        f2Var.getMessagesController().N4(false);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    public /* synthetic */ e2(org.telegram.messenger.c20 c20Var, di.u2 u2Var) {
        this.a = 11;
        this.c = c20Var;
        this.b = u2Var;
    }

    public /* synthetic */ e2(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 25;
        this.b = contactsActivity;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        r41 r41Var = (r41) this.b;
        org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.c;
        x31 G = r41Var.f3.G(i7);
        if (G == null) {
            return false;
        }
        return b20Var.a(G, view, Integer.valueOf(i7), Float.valueOf(f10), Float.valueOf(f11)).booleanValue();
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void h(View view, float f10, float f11) {
    }

    private final /* synthetic */ void j(View view, float f10, float f11) {
    }
}
