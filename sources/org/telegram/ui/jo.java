package org.telegram.ui;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements org.telegram.messenger.lr, ca1, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.r4, org.telegram.messenger.ua, org.telegram.ui.Cells.p5, org.telegram.messenger.ec, org.telegram.ui.Components.ki, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.hj0, org.telegram.messenger.ir {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jo(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        org.telegram.messenger.zi threadMessage;
        switch (this.a) {
            case 14:
                org.telegram.ui.Components.ue ueVar = (org.telegram.ui.Components.ue) this.b;
                String str = (String) this.c;
                ChatActivityEnterView chatActivityEnterView = ueVar.a;
                long j10 = chatActivityEnterView.R2;
                org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(str, j10, ziVar, threadMessage, null, false, null, null, null, z10, i3, i10, null, false);
                wm wmVar = chatActivityEnterView.Q2;
                b10.K = wmVar != null ? wmVar.W8() : null;
                b10.O = chatActivityEnterView.T4;
                org.telegram.messenger.yy.C(chatActivityEnterView.R).r0(b10);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                org.telegram.ui.Components.ee eeVar = chatActivityEnterView.K0;
                chatActivityEnterView.T4 = 0L;
                eeVar.setEffect(0L);
                break;
            case 15:
                ((org.telegram.ui.Components.tf) this.b).K((org.telegram.ui.Components.y00) this.c, z10, i3, i10);
                break;
            default:
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) this.b;
                View view = (View) this.c;
                if (!z10) {
                    anVar.getClass();
                    break;
                } else {
                    anVar.W = i3;
                    anVar.V = 0;
                    if (!(view instanceof org.telegram.ui.Cells.l8)) {
                        anVar.r.g(anVar.J0);
                        break;
                    } else {
                        anVar.Z((org.telegram.ui.Cells.l8) view, true);
                        break;
                    }
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void a() {
        org.telegram.ui.Components.ao aoVar = (org.telegram.ui.Components.ao) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (aoVar.c != null) {
            aoVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            aoVar.a();
        }
    }

    @Override // org.telegram.messenger.ua
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ca caVar) {
        Location location;
        org.telegram.ui.Components.uk ukVar = (org.telegram.ui.Components.uk) this.b;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
        ImageView imageView = ukVar.n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = ukVar.P;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = ukVar.b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ukVar.b0 = animatorSet2;
            animatorSet2.setDuration(200L);
            ukVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ukVar.k0 - org.telegram.messenger.g0.L(10.0f)));
            ukVar.b0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = ukVar.b0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            ukVar.H = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            ukVar.b0 = animatorSet4;
            animatorSet4.setDuration(200L);
            ukVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ukVar.k0));
            ukVar.b0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!ukVar.m0) {
                int i3 = org.telegram.ui.ActionBar.k6.ij;
                org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i3));
                ukVar.m0 = true;
            }
            org.telegram.messenger.z9 z9Var = ukVar.E;
            if (z9Var != null && (location = ukVar.j0) != null) {
                location.setLatitude(((org.telegram.messenger.va) z9Var.d().b).a);
                ukVar.j0.setLongitude(((org.telegram.messenger.va) ukVar.E.d().b).b);
            }
            ukVar.L.L(ukVar.j0);
        }
        return caVar.a(motionEvent).booleanValue();
    }

    @Override // org.telegram.ui.Cells.p5
    public void c(org.telegram.ui.Cells.q5 q5Var) {
        TLRPC.Chat chat;
        org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) this.b;
        org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.w;
        boolean z10 = chatAttachAlertPhotoLayout.w0;
        org.telegram.ui.Components.bi biVar = chatAttachAlertPhotoLayout.b;
        if (z10) {
            int i3 = biVar.L2;
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (i3 != 0 || biVar.z1) {
                return;
            }
            int intValue = ((Integer) q5Var.getTag()).intValue();
            org.telegram.messenger.ye photoEntry = q5Var.getPhotoEntry();
            if (chatAttachAlertPhotoLayout.a0(photoEntry)) {
                return;
            }
            HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
            if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                new org.telegram.ui.Components.fc(biVar.m3, chatAttachAlertPhotoLayout.a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(((org.telegram.messenger.j0) d2Var.getMessagesController().x7.d0.b).c, "BusinessRepliesToastLimit", new Object[0])), null).j();
                return;
            }
            boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.C));
            boolean z11 = !containsKey;
            if (!containsKey && biVar.N3 >= 0 && hashMap.size() >= biVar.N3) {
                if (!biVar.O3 || !(d2Var instanceof wm) || (chat = ((wm) d2Var).e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || chatAttachAlertPhotoLayout.M == 2) {
                    return;
                }
                org.telegram.ui.Components.t4.N(chatAttachAlertPhotoLayout.getContext(), org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745313, null), null, null, chatAttachAlertPhotoLayout.a).p();
                if (chatAttachAlertPhotoLayout.M == 1) {
                    chatAttachAlertPhotoLayout.M = 2;
                    return;
                }
                return;
            }
            int size = !containsKey ? ChatAttachAlertPhotoLayout.u1.size() : -1;
            if ((d2Var instanceof wm) && biVar.O3) {
                q5Var.b(size, z11, true);
            } else {
                q5Var.b(-1, z11, true);
            }
            chatAttachAlertPhotoLayout.S(photoEntry, intValue);
            org.telegram.ui.Components.sl slVar2 = chatAttachAlertPhotoLayout.w;
            if (slVar == slVar2) {
                org.telegram.ui.Components.sl slVar3 = chatAttachAlertPhotoLayout.H;
                if (slVar3.d && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                    intValue++;
                }
                if (slVar3.f && intValue >= chatAttachAlertPhotoLayout.N0) {
                    intValue++;
                }
                slVar3.g(intValue);
            } else {
                slVar2.g(intValue);
            }
            biVar.K1(containsKey ? 2 : 1);
            q5Var2.setHasSpoiler(photoEntry.M);
            q5Var2.setHighQuality(photoEntry.c());
            q5Var2.f(photoEntry.N, hashMap.size() > 1);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        org.telegram.ui.Components.p5 p5Var;
        org.telegram.ui.Components.g11 g11Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 24:
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) obj2;
                Context context = (Context) obj;
                if ((view instanceof org.telegram.ui.Components.iu) && (p5Var = ((org.telegram.ui.Components.iu) view).c) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(puVar.getContext(), true, true);
                    y0Var.setItemHeight(48);
                    y0Var.setPadding(org.telegram.messenger.g0.L(26.0f), 0, org.telegram.messenger.g0.L(26.0f), 0);
                    y0Var.setText(org.telegram.messenger.bd.M0(2131751767, null));
                    y0Var.getTextView().setTextSize(1, 14.4f);
                    y0Var.getTextView().setTypeface(org.telegram.messenger.g0.o());
                    y0Var.setOnClickListener(new org.telegram.ui.Components.q2(15, puVar, p5Var));
                    LinearLayout linearLayout = new LinearLayout(context);
                    Drawable mutate = puVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                    org.telegram.ui.ActionBar.r6.y(linearLayout, mutate, org.telegram.ui.ActionBar.k6.G8, puVar.J0, PorterDuff.Mode.MULTIPLY);
                    linearLayout.setBackground(mutate);
                    linearLayout.addView(y0Var);
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(linearLayout, -2, -2);
                    puVar.y1 = f1Var;
                    f1Var.setClippingEnabled(true);
                    puVar.y1.g();
                    puVar.y1.setInputMethodMode(2);
                    puVar.y1.setSoftInputMode(0);
                    puVar.y1.setOutsideTouchable(true);
                    puVar.y1.setAnimationStyle(R.style.PopupAnimation);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    puVar.y1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - org.telegram.messenger.g0.L(49.0f)), iArr[1] - org.telegram.messenger.g0.L(52.0f));
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            default:
                zj zjVar = (zj) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((org.telegram.ui.Components.l01) ((org.telegram.ui.Components.n01) obj2).s.c.get(i3)).a;
                if (tL_forumTopic != null && (g11Var = zjVar.a.g2) != null && g11Var.o(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(e0Var.a).sendRequestTyped(deletetone, new c3.b(1), new ai.n0(e0Var, h, tL_aiComposeTone, 5));
                break;
            case 3:
                ((cg.e0) this.b).o(((boolean[]) this.c)[0]);
                break;
            case 4:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                org.telegram.messenger.yc G0 = org.telegram.messenger.bd.E0().G0(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (G0 == null) {
                    G0 = new org.telegram.messenger.yc();
                    G0.a = tL_langPackLanguage.native_name;
                    G0.b = tL_langPackLanguage.name;
                    G0.c = tL_langPackLanguage.lang_code;
                    G0.e = tL_langPackLanguage.base_lang_code;
                    G0.f = tL_langPackLanguage.plural_code;
                    G0.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        G0.d = "remote";
                    } else {
                        G0.d = "unofficial";
                    }
                }
                org.telegram.messenger.bd.E0().c(G0, true, false, false, true, org.telegram.messenger.h10.t0, null);
                launchActivity.y0(true);
                break;
            case 5:
                org.telegram.ui.Components.i41 i41Var = (org.telegram.ui.Components.i41) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                uw uwVar = (uw) i41Var.b;
                ArrayList arrayList = (ArrayList) i41Var.c;
                uwVar.getClass();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Long l10 = (Long) arrayList.get(i10);
                    long longValue = l10.longValue();
                    if (z10) {
                        uwVar.getMessagesController().o4(longValue, uwVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z11) {
                        uwVar.getMessagesController().X(0, longValue, true);
                    }
                    uwVar.getMessagesController().w(longValue);
                }
                uwVar.n4(false);
                break;
            case 6:
                mi.f fVar = (mi.f) this.b;
                EditText editText = (EditText) this.c;
                s1Var.dismiss();
                fVar.a(editText.getText().toString());
                break;
            case 7:
                int[] iArr = (int[]) this.b;
                org.telegram.messenger.kr krVar = (org.telegram.messenger.kr) this.c;
                int i11 = iArr[0];
                krVar.a(i11 == 0 ? 900 : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            case 9:
                String str = (String) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", org.telegram.messenger.g5.r(d2Var.getCurrentAccount()).s(1));
                    d2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.c;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim) ? false : org.telegram.ui.Components.t4.a.matcher(trim.trim()).matches()) {
                    u10Var.a(trim);
                    s1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(z3Var);
                    break;
                }
            case 11:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.b;
                org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) this.c;
                int i12 = encryptedChat.ttl;
                int value = cb0Var.getValue();
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
                if (i12 != encryptedChat.ttl) {
                    org.telegram.messenger.vv.i(org.telegram.messenger.h10.t0).z(encryptedChat, null);
                    org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(org.telegram.messenger.h10.t0);
                    a02.a.c(new org.telegram.messenger.vp(a02, encryptedChat, 0));
                    break;
                }
                break;
            case 12:
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.c;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).d7.edit();
                edit.remove("color_" + str2);
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                ((org.telegram.messenger.ir) this.b).o(((boolean[]) this.c)[0]);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            default:
                Runnable runnable2 = (Runnable) this.c;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) this.b;
                runnable2.run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = org.telegram.messenger.li.Z(stickerSet);
                ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_stickers_deleteStickerSet, new ei.u5(21));
                break;
            case 23:
                ((org.telegram.ui.Components.ws) this.b).a(((ci.s) this.c).getText().toString().trim());
                break;
            case 25:
                org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) this.b;
                String str3 = (String) this.c;
                org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(p20Var.a);
                ArrayList arrayList2 = a10.f;
                int indexOf = arrayList2.indexOf(str3);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a10.d();
                }
                p20Var.f.O(true);
                break;
            case 26:
                org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                im0Var.getClass();
                s1Var.dismiss();
                im0Var.M0.getDownloadController().j(arrayList3);
                im0Var.R(false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ki
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.b;
        ei.x2 x2Var = (ei.x2) this.c;
        if (!arrayList.isEmpty()) {
            u10Var.a(new uh.g((org.telegram.messenger.zi) arrayList.get(0)));
        }
        x2Var.a(true);
    }

    @Override // org.telegram.ui.ca1
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ip) this.b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.xl xlVar = (org.telegram.ui.Components.xl) this.b;
        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.c;
        if (z10 && !z11 && yeVar.M && xlVar.d.n() == null) {
            if (xlVar.d.n() != null && !xlVar.d.n().isRecycled()) {
                xlVar.d.n().recycle();
                xlVar.d.w0(null);
            }
            xlVar.d.v0(Utilities.D(imageReceiver.n(), false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        d2Var.finishFragment();
        int i3 = org.telegram.messenger.hs.t;
        d2Var.getNotificationCenter().n((org.telegram.messenger.cs) d2Var, i3);
        d2Var.getNotificationCenter().k(i3, new Object[0]);
        d2Var.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(ws0Var.m1), user, null, Boolean.valueOf(z10));
        d2Var.getMessagesController().N4(false);
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        mo moVar = (mo) this.b;
        Runnable runnable = (Runnable) this.c;
        if (j10 == 0) {
            moVar.getClass();
            return;
        }
        qo qoVar = moVar.y.d;
        if (qoVar.s) {
            qoVar.w.set(0, qoVar.getMessagesController().M0(Long.valueOf(j10)));
        } else {
            qoVar.F = j10;
            qoVar.f = qoVar.getMessagesController().M0(Long.valueOf(j10));
        }
        runnable.run();
    }

    public /* synthetic */ jo(Runnable runnable, TLRPC.StickerSet stickerSet) {
        this.a = 28;
        this.c = runnable;
        this.b = stickerSet;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
