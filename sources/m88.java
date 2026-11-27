// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m88 implements p88, OnFailureListener, fd, hj, nu4, oj3, ita, ncc, CameraView.CameraViewDelegate, Continuation, s69, vt3, bj9, ti7, lz0, NativeLifecycleLock.NativePointerRunnable, bs9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m88(oh8 oh8Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = (byte) 7;
        this.b = oh8Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // oj3
    public final boolean E() {
        return false;
    }

    @Override // ti7
    public final void a(Canvas canvas) {
        al9 al9Var = (al9) this.b;
        View view = (View) this.c;
        gl9 gl9Var = al9Var.X;
        AtomicReference atomicReference = gl9Var.E;
        StaticLayout staticLayout = gl9Var.b;
        ArrayList arrayList = gl9Var.x;
        npa.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // bs9
    public final Object apply(Object obj) {
        ds9 ds9Var = (ds9) this.b;
        ta0 ta0Var = (ta0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s90 s90Var = ds9Var.d;
        ArrayList d = ds9Var.d(sQLiteDatabase, ta0Var, s90Var.b);
        for (pm8 pm8Var : pm8.values()) {
            if (pm8Var != ta0Var.c) {
                int size = s90Var.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(ds9Var.d(sQLiteDatabase, ta0Var.b(pm8Var), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((ga0) d.get(i)).a);
            if (i < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new cs9(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            ga0 ga0Var = (ga0) listIterator.next();
            long j2 = ga0Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                q90 c = ga0Var.c.c();
                for (cs9 cs9Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(cs9Var.a, cs9Var.b);
                }
                listIterator.set(new ga0(j2, ga0Var.b, c.b()));
            }
        }
        return d;
    }

    @Override // ita
    public final void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        au8 au8Var = (au8) this.b;
        au8Var.e.l.remove((TL_stars.SavedStarGift) this.c);
        au8Var.f(true);
        int i = au8Var.b;
        long e = yac.h(i).e();
        cga cgaVar = au8Var.a;
        if (j == e) {
            d31 b0 = d31.b0(cgaVar.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = ob6.M0(2131752868, null);
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            v21 O = b0.O(document, M0, ob6.a0(null, null, 2131752869, qu6.m(tL_starGiftUnique.num, ',', sb)));
            O.s = false;
            O.j();
        } else {
            v21 O2 = d31.b0(cgaVar.a).O(tL_starGiftUnique.getDocument(), ob6.M0(2131752866, null), ob6.a0(null, null, 2131752867, wf3.r(i, j)));
            O2.s = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    @Override // vt3
    public final void c() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 22:
                ((if9) obj2).i();
                ((hf9) obj).f2();
                break;
            default:
                xl9 xl9Var = (xl9) obj2;
                am9 am9Var = (am9) obj;
                TL_iv.pageTableCell pagetablecell = am9Var.b;
                if (pagetablecell != null) {
                    ajb.d(pagetablecell, am9Var.a.getText());
                }
                xh9 xh9Var = xl9Var.F;
                if (xh9Var != null && xl9Var.a != null) {
                    xh9Var.a.X3();
                    break;
                }
                break;
        }
    }

    @Override // lz0
    public final void cancel() {
        rr9 rr9Var = (rr9) this.b;
        rr9Var.b.removeCallbacks((kr9) this.c);
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        TL_stars.SavedStarGift savedStarGift;
        md9 md9Var = (md9) this.b;
        ld9 ld9Var = (ld9) this.c;
        b8c G = md9Var.d2.G(i - 1);
        if (G != null) {
            Object obj = G.H;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z = G.s;
                if (!TextUtils.isEmpty(starGift.gift_address) && md9Var.c2 && !uc7.s1(md9Var.a).k4.y.f) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, md9Var.J0, md9Var.getContext());
                    alertDialog$Builder.a.S = ob6.M0(2131749738, null);
                    alertDialog$Builder.a.U = ob6.M0(2131749739, null);
                    c00.u(null, 2131747558, alertDialog$Builder, null);
                    return;
                }
                if (!z) {
                    ArrayList arrayList = ld9Var.b.l;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        savedStarGift = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift.gift == starGift) {
                            break;
                        }
                    }
                    if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(md9Var.a).getCurrentTime()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(md9Var.getContext());
                        alertDialog$Builder2.a.S = ob6.M0(2131749701, null);
                        alertDialog$Builder2.a.U = hl.S2(ob6.a0(null, null, 2131749702, ob6.x(savedStarGift.can_craft_at, true)));
                        c00.u(null, 2131747558, alertDialog$Builder2, null);
                        return;
                    }
                } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                    id idVar = new id(3, null, md9Var.getContext());
                    idVar.q(400L);
                    long e = yac.h(md9Var.a).e();
                    pj pjVar = tL_starGiftUnique.resale_ton_only ? pj.b : pj.a;
                    jxa.u(md9Var.a, pjVar).E(tL_starGiftUnique, e, null, true, new f38(md9Var, idVar, pjVar, tL_starGiftUnique, e));
                    return;
                }
                md9Var.a2.a(starGift);
                md9Var.dismiss();
            }
        }
    }

    public final File e() {
        byte b = this.a;
        Object obj = this.c;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        switch (b) {
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                xb4.G(photoViewer.U);
                return xb4.J((TLObject) obj, null, true, true);
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                xb4.G(photoViewer.U);
                return xb4.M((TLRPC.Message) obj, false, true);
        }
    }

    @Override // nu4
    public final Object h(Object obj) {
        ql8 ql8Var = (ql8) this.b;
        pl8 pl8Var = (pl8) this.c;
        PremiumPreviewFragment premiumPreviewFragment = ql8Var.d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, pl8Var.getMeasuredWidth(), -pl8Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    @Override // p88
    public final void i(int i, int i2) {
        o88 o88Var = (o88) this.b;
        p88 p88Var = (p88) this.c;
        ki7 ki7Var = o88Var.e;
        p88Var.i(i, i2);
        TextView textView = o88Var.b;
        if (i2 > 0) {
            textView.setText("+" + i2);
        } else {
            textView.setText(String.valueOf(i2));
        }
        if (textView.getTag() != null) {
            hl.r(ki7Var);
            hl.d3(ki7Var, 1000L);
            return;
        }
        AnimatorSet animatorSet = o88Var.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        o88Var.d = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(o88Var.a, (Property<TextView, Float>) property, 0.0f));
        o88Var.d.setDuration(250L);
        o88Var.d.setInterpolator(new DecelerateInterpolator());
        o88Var.d.addListener(new n88(o88Var, (byte) 1));
        o88Var.d.start();
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        du8 du8Var = (du8) this.b;
        c51 c51Var = (c51) this.c;
        View view = (View) obj2;
        long j = ((TL_stars.SavedStarGift) ((b8c) obj).H).gift.id;
        if (du8Var.l1 == j) {
            du8Var.l1 = 0L;
            j = 0;
        } else {
            du8Var.l1 = j;
        }
        c51Var.setEnabled(j != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof m38) {
                    m38 m38Var = (m38) childAt;
                    m38Var.b(du8Var.l1 == m38Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        jz8 jz8Var = (jz8) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (jz8Var.W || jz8Var.i0 || jz8Var.m0) {
            return;
        }
        jz8Var.i0 = true;
        jz8Var.h0.postDelayed(jz8Var.z0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        v98 v98Var = (v98) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        v98Var.D0 = false;
        byte b = 1;
        cc4.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof kg7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && v98Var.isAttachedToWindow()) {
            hl.d3(new h68(v98Var, bitmap, b), 2000L);
        } else {
            v98Var.E0 = true;
        }
    }

    @Override // oj3
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        wl8 wl8Var = (wl8) this.b;
        String str = (String) this.c;
        wl8Var.getClass();
        long j = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j = ((if7) arrayList.get(i3)).a;
            wl8Var.r1.getSendMessagesHelper().q0(p7a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        uj3Var.finishFragment();
        ym0.h(j);
        return true;
    }

    @Override // bj9, org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 23:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j;
                ((mi9) obj2).a((String) obj, tL_inlineButtonTypeUserProfile);
                break;
            default:
                ((RtpReceiver) obj2).lambda$SetObserver$4((RtpReceiver.Observer) obj, j);
                break;
        }
    }

    @Override // oj3
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ym4 ym4Var = (ym4) this.b;
        String str = (String) this.c;
        synchronized (ym4Var) {
            ((qs) ym4Var.c).remove(str);
        }
        return task;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i2;
        byte b = this.a;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                PhotoViewer photoViewer = ((gb8) obj2).b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.j2((ArrayList) obj);
                break;
            case 5:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer2 = ((gb8) obj2).b;
                ed8 ed8Var = photoViewer2.d;
                ArrayList arrayList2 = photoViewer2.Z6;
                ArrayList arrayList3 = photoViewer2.c7;
                ArrayList arrayList4 = photoViewer2.X6;
                ArrayList arrayList5 = photoViewer2.d7;
                ArrayList arrayList6 = photoViewer2.e7;
                if (!ed8Var.N()) {
                    photoViewer2.A(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i4 = photoViewer2.O4;
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        r47 r47Var = (r47) arrayList4.get(photoViewer2.O4);
                        if (r47Var.p4()) {
                            photoViewer2.A(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i5 = photoViewer2.w;
                            if (i5 != 0) {
                                arrayList7.add(Integer.valueOf(i5));
                            } else {
                                arrayList7.add(Integer.valueOf(r47Var.e1()));
                            }
                            if (!wf3.B(r47.B0(r47Var.k)) || r47Var.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(r47Var.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = uc7.s1(photoViewer2.U).a1(Integer.valueOf((int) (r47.B0(r47Var.k) & 4294967295L)));
                            }
                            uc7 s1 = uc7.s1(photoViewer2.U);
                            long B0 = r47.B0(r47Var.k);
                            int I1 = r47.I1(r47Var.k);
                            boolean z = zArr[0];
                            if (r47Var.r1) {
                                i2 = 1;
                            } else {
                                if (r47.c5(r47Var.k)) {
                                    i3 = 9;
                                } else if (r47.a4(r47Var.k)) {
                                    i3 = 5;
                                }
                                i2 = i3;
                            }
                            s1.X(arrayList7, arrayList, encryptedChat, B0, I1, z, i2);
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i6 = photoViewer2.O4;
                    if (i6 >= 0 && i6 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer2.O4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            uc7.s1(photoViewer2.U).X(arrayList9, null, null, r47.B0(message), message.quick_reply_shortcut_id, true, 0);
                            jn7.f(photoViewer2.U).k(40, new Object[0]);
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
                                    uc7.s1(photoViewer2.U).j0(tL_inputPhoto);
                                }
                                jf7 Y = jf7.Y(photoViewer2.U);
                                Y.a.c(new xd7(Y, photoViewer2.y5, photo.id, (byte) 0));
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
                                    jn7.f(photoViewer2.U).k(40, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            long j = photoViewer2.y5;
                            int i8 = photoViewer2.U;
                            if (j > 0) {
                                uc7.s1(i8).j0(null);
                            } else {
                                uc7.s1(i8).z(-photoViewer2.y5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer2.A(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer2.d != null) {
                    arrayList5.remove(photoViewer2.O4);
                    photoViewer2.d.A(photoViewer2.O4);
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
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                pt8 pt8Var = (pt8) obj2;
                pcc pccVar = (pcc) obj;
                String obj3 = pt8Var.getText().toString();
                if (obj3.length() > 0 && obj3.length() <= 12) {
                    pccVar.a(obj3);
                    idVar.dismiss();
                    break;
                } else {
                    hl.z3(pt8Var);
                    break;
                }
                break;
            case 10:
                ((PrivacyControlActivity) obj2).x0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ol7(privacySettingsActivity, (wkb) obj, (byte) 11));
                break;
            case 12:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj2).x2((sg2[]) obj);
                break;
            case 13:
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = ((cr8) obj2).b;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                user.contact = false;
                profileActivity.Z3(false, false);
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        oh8 oh8Var = (oh8) this.b;
        switch (b) {
            case 6:
                wh8 wh8Var = oh8Var.a;
                wh8Var.f0.a((TLRPC.TL_messageMediaToDo) obj);
                wh8Var.finishFragment();
                break;
            default:
                wh8 wh8Var2 = oh8Var.a;
                wh8Var2.f0.a((TLRPC.TL_messageMediaPoll) obj);
                wh8Var2.finishFragment();
                break;
        }
    }

    public /* synthetic */ m88(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
