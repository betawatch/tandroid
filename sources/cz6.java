// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cz6 implements lz6, fu2, ee, ac7, g59, ke3, zy2, i7b, a78, OnFailureListener, gk, ku4, hk3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz6(cg8 cg8Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = (byte) 23;
        this.b = cg8Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    public final File a() {
        byte b = this.a;
        Object obj = this.c;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        switch (b) {
            case 18:
                Drawable[] drawableArr = PhotoViewer.d9;
                bc4.G(photoViewer.U);
                return bc4.J((TLObject) obj, null, true, true);
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                bc4.G(photoViewer.U);
                return bc4.M((TLRPC.Message) obj, false, true);
        }
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                sw6 sw6Var = (sw6) obj2;
                tx6 tx6Var = (tx6) ((oz6) obj3).a.get();
                if (tx6Var != null && !tx6Var.i()) {
                    ao5 c = kke.c(Boolean.TRUE);
                    px6 px6Var = new px6(tx6Var, sw6Var, false);
                    c.b(new us4((Object) c, (Object) px6Var, (byte) 0), new rf2(tx6Var, (byte) 3));
                    break;
                }
                break;
            default:
                kq kqVar = (kq) obj3;
                ((vz6) obj).j(kqVar.b, (rz6) kqVar.c, (ft6) obj2);
                break;
        }
    }

    @Override // ac7
    public final boolean b(TLRPC.TL_error tL_error) {
        gu2 gu2Var = (gu2) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (gu2Var != null) {
            gu2Var.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    @Override // i7b
    public final void c(y7b y7bVar, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, b7b b7bVar, nsa nsaVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                a58 a58Var = (a58) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = oc7.r1(a58Var.s2).i1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = y7bVar.b;
                ConnectionsManager.getInstance(a58Var.s2).sendRequest(tL_stories_editStory, new av0((Object) a58Var, (Object) b7bVar, (Object) storyItem, (Object) y7bVar, (byte) 14));
                break;
            default:
                v48 v48Var = (v48) obj2;
                a8b a8bVar = (a8b) obj;
                a58 a58Var2 = v48Var.x;
                z48 z48Var = a58Var2.E1;
                TL_stories.StoryItem storyItem2 = z48Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z3) {
                    oc7.r1(a58Var2.s2).N1().r0(a58Var2.r1, a58Var2.l1, z3, null);
                }
                TL_stories.StoryItem storyItem3 = z48Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(a58Var2.s2).sendRequest(togglegroupcallsettings, new jl7(v48Var, a8bVar, (byte) 6));
                        break;
                    }
                }
                break;
        }
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        ((NotificationsCustomSettingsActivity) this.b).k0((Context) this.c, view, i, f, f2);
    }

    @Override // a78
    public final void e(int i, int i2) {
        z68 z68Var = (z68) this.b;
        a78 a78Var = (a78) this.c;
        ei7 ei7Var = z68Var.e;
        a78Var.e(i, i2);
        TextView textView = z68Var.b;
        if (i2 > 0) {
            textView.setText("+" + i2);
        } else {
            textView.setText(String.valueOf(i2));
        }
        if (textView.getTag() != null) {
            gm.r(ei7Var);
            gm.d3(ei7Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = z68Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        z68Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(z68Var.a, (Property<TextView, Float>) property, 0.0f));
        z68Var.d.setDuration(250L);
        z68Var.d.setInterpolator(new DecelerateInterpolator());
        z68Var.d.addListener(new s38(z68Var, (byte) 4));
        z68Var.d.start();
    }

    @Override // ke3
    public final void f(nv8 nv8Var) {
        ke3 ke3Var = (ke3) this.b;
        ke3 ke3Var2 = (ke3) this.c;
        ke3Var.f(nv8Var);
        ke3Var2.f(nv8Var);
    }

    @Override // zy2
    public final void g(wy2 wy2Var) {
        xz7 xz7Var = (xz7) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = xz7Var.Z[intValue];
        String str = wy2Var.d;
        if (intValue == 5) {
            xz7Var.s = str;
        } else {
            xz7Var.w = str;
        }
        editTextBoldCursor.setText(wy2Var.a);
    }

    @Override // ku4
    public final Object l(Object obj) {
        fk8 fk8Var = (fk8) this.b;
        ek8 ek8Var = (ek8) this.c;
        PremiumPreviewFragment premiumPreviewFragment = fk8Var.d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, ek8Var.getMeasuredWidth(), -ek8Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        g88 g88Var = (g88) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        g88Var.D0 = false;
        fc4.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof dg7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && g88Var.isAttachedToWindow()) {
            gm.d3(new a18(g88Var, bitmap, (byte) 4), 2000L);
        } else {
            g88Var.E0 = true;
        }
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        lk8 lk8Var = (lk8) this.b;
        String str = (String) this.c;
        lk8Var.getClass();
        long j = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j = ((bf7) arrayList.get(i3)).a;
            lk8Var.r1.getSendMessagesHelper().q0(y5a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        nk3Var.finishFragment();
        yn0.h(j);
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i2;
        byte b = this.a;
        int i3 = 1;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                ((boolean[]) obj)[0] = true;
                ((k17) obj2).Q();
                break;
            case 8:
                xz7 xz7Var = (xz7) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!xz7Var.w0) {
                    xz7Var.t1.clear();
                }
                xz7Var.u1.clear();
                ez7 ez7Var = xz7Var.C1;
                ez7Var.d.c1(xz7Var.F, xz7Var.G, xz7Var.H, zArr[0], null, null, ez7Var.b);
                xz7Var.finishFragment();
                break;
            case 9:
                int[] iArr = ((xz7) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(jb6.M0(2131747227, null));
                break;
            case 11:
                ((xz7) obj2).u1((TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 12:
                p pVar = (p) obj2;
                pVar.c0 = true;
                pVar.b0.email_unconfirmed_pattern = (String) obj;
                pVar.P0();
                break;
            case 15:
                v48 v48Var = (v48) obj2;
                s96 s96Var = ((oab) obj).B0;
                if (s96Var == null) {
                    v48Var.x.u0();
                    break;
                } else if (!s96Var.w) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = s96Var.f;
                    ConnectionsManager.getInstance(s96Var.e).sendRequest(discardgroupcall, new r96(s96Var, b2));
                    s96Var.h();
                    break;
                }
                break;
            case 20:
                PhotoViewer photoViewer = ((r98) obj2).b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.j2((ArrayList) obj);
                break;
            case 21:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer2 = ((r98) obj2).b;
                pb8 pb8Var = photoViewer2.d;
                ArrayList arrayList2 = photoViewer2.Z6;
                ArrayList arrayList3 = photoViewer2.c7;
                ArrayList arrayList4 = photoViewer2.X6;
                ArrayList arrayList5 = photoViewer2.d7;
                ArrayList arrayList6 = photoViewer2.e7;
                if (!pb8Var.O()) {
                    photoViewer2.A(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i4 = photoViewer2.O4;
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        k47 k47Var = (k47) arrayList4.get(photoViewer2.O4);
                        if (k47Var.p4()) {
                            photoViewer2.A(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i5 = photoViewer2.w;
                            if (i5 != 0) {
                                arrayList7.add(Integer.valueOf(i5));
                            } else {
                                arrayList7.add(Integer.valueOf(k47Var.e1()));
                            }
                            if (!pg3.B(k47.B0(k47Var.k)) || k47Var.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(k47Var.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = oc7.r1(photoViewer2.U).Z0(Integer.valueOf((int) (k47.B0(k47Var.k) & 4294967295L)));
                            }
                            oc7 r1 = oc7.r1(photoViewer2.U);
                            long B0 = k47.B0(k47Var.k);
                            int I1 = k47.I1(k47Var.k);
                            boolean z = zArr2[0];
                            if (!k47Var.r1) {
                                if (!k47.c5(k47Var.k)) {
                                    if (!k47.a4(k47Var.k)) {
                                        i2 = 0;
                                        r1.V(arrayList7, arrayList, encryptedChat, B0, I1, z, i2);
                                        break;
                                    } else {
                                        i3 = 5;
                                    }
                                } else {
                                    i3 = 9;
                                }
                            }
                            i2 = i3;
                            r1.V(arrayList7, arrayList, encryptedChat, B0, I1, z, i2);
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i6 = photoViewer2.O4;
                    if (i6 >= 0 && i6 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer2.O4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            oc7.r1(photoViewer2.U).V(arrayList9, null, null, k47.B0(message), message.quick_reply_shortcut_id, true, 0);
                            nm7.f(photoViewer2.U).k(40, new Object[0]);
                        }
                        if (!photoViewer2.L0()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer2.O4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer2.y5 > 0) {
                                    oc7.r1(photoViewer2.U).h0(tL_inputPhoto);
                                }
                                cf7 Y = cf7.Y(photoViewer2.U);
                                Y.a.c(new tc7(Y, photoViewer2.y5, photo.id, (byte) 4));
                                arrayList2.remove(photoViewer2.O4);
                                photoViewer2.b7.remove(photoViewer2.O4);
                                photoViewer2.a7.remove(photoViewer2.O4);
                                arrayList3.remove(photoViewer2.O4);
                                arrayList6.remove(photoViewer2.O4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer2.A(false, false);
                                } else {
                                    int i7 = photoViewer2.O4;
                                    if (i7 >= arrayList6.size()) {
                                        i7 = arrayList6.size() - 1;
                                    }
                                    photoViewer2.O4 = -1;
                                    photoViewer2.K1(i7);
                                }
                                if (message == null) {
                                    nm7.f(photoViewer2.U).k(40, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            long j = photoViewer2.y5;
                            int i8 = photoViewer2.U;
                            if (j > 0) {
                                oc7.r1(i8).h0(null);
                            } else {
                                oc7.r1(i8).x(-photoViewer2.y5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer2.A(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer2.d != null) {
                    arrayList5.remove(photoViewer2.O4);
                    photoViewer2.d.B(photoViewer2.O4);
                    if (!arrayList5.isEmpty()) {
                        int i9 = photoViewer2.O4;
                        if (i9 >= arrayList5.size()) {
                            i9 = arrayList5.size() - 1;
                        }
                        photoViewer2.O4 = -1;
                        photoViewer2.K1(i9);
                        break;
                    } else {
                        photoViewer2.A(false, false);
                        break;
                    }
                }
                break;
            case 26:
                ((PrivacyControlActivity) obj2).x0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new jl7(privacySettingsActivity, (bjb) obj, (byte) 10));
                break;
            case 28:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj2).z2((oh2[]) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = ((sp8) obj2).b;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity.getContactsController().i(arrayList10, true);
                user.contact = false;
                profileActivity.c4(false, false);
                break;
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override // lz6
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        byte b = this.a;
        Object obj = this.c;
        lz6 lz6Var = (lz6) this.b;
        switch (b) {
            case 0:
                return tx6Var.i() ? kke.c(new q8a(-100)) : hac.h0((t76) lz6Var.t(tx6Var, sw6Var, i), new wu2((Object) tx6Var, (Object) sw6Var, obj, (byte) 16));
            default:
                return tx6Var.i() ? kke.c(new q8a(-100)) : hac.h0((t76) lz6Var.t(tx6Var, sw6Var, i), new wu2((Object) tx6Var, (Object) sw6Var, obj, (byte) 17));
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        cg8 cg8Var = (cg8) this.b;
        switch (b) {
            case 22:
                kg8 kg8Var = cg8Var.a;
                kg8Var.f0.c((TLRPC.TL_messageMediaToDo) obj);
                kg8Var.finishFragment();
                break;
            default:
                kg8 kg8Var2 = cg8Var.a;
                kg8Var2.f0.c((TLRPC.TL_messageMediaPoll) obj);
                kg8Var2.finishFragment();
                break;
        }
    }

    public /* synthetic */ cz6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
