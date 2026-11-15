package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ok0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Bitmap bitmap;
        Bundle bundle;
        h9.i0 i0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.messenger.qe qeVar = (org.telegram.messenger.qe) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i7 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i7 < arrayList5.size(); arrayList5 = arrayList2) {
                m9.y yVar = (m9.y) arrayList5.get(i7);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) c8.r9.a(yVar);
                    } catch (CancellationException | ExecutionException e10) {
                        synchronized (h2.a.b) {
                            Log.d("MediaSessionLegacyStub", h2.a.a("Failed to get bitmap", e10));
                        }
                    }
                    e2.l0 l0Var = (e2.l0) arrayList3.get(i7);
                    int i10 = p4.n.a;
                    String str = !l0Var.a.equals("") ? null : l0Var.a;
                    e2.o0 o0Var = l0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = o0Var.J;
                    CharSequence charSequence3 = o0Var.a;
                    CharSequence charSequence4 = o0Var.g;
                    CharSequence charSequence5 = o0Var.f;
                    i0Var = o0Var.K;
                    Integer num = o0Var.I;
                    Integer num2 = o0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z10 = num2 == null && num2.intValue() != -1;
                    z11 = num == null;
                    if (!z10 || z11) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z10) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", p4.n.a(num2.intValue()));
                        }
                        if (z11) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!i0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                    }
                    charSequence = o0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i11 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i12 < i11) {
                                String[] strArr = q4.i.d;
                                if (i13 < strArr.length) {
                                    int i14 = i13 + 1;
                                    String str2 = strArr[i13];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            charSequence2 = o0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = o0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = o0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = o0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = o0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i12] = charSequence2;
                                        i12++;
                                    }
                                    i13 = i14;
                                    i11 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence5, charSequence4, bitmap2, o0Var.n, bundle3, l0Var.f.a), i7 != -1 ? -1L : i7));
                    i7++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                e2.l0 l0Var2 = (e2.l0) arrayList3.get(i7);
                int i102 = p4.n.a;
                if (!l0Var2.a.equals("")) {
                }
                e2.o0 o0Var2 = l0Var2.d;
                if (bitmap == null) {
                }
                bundle = o0Var2.J;
                CharSequence charSequence32 = o0Var2.a;
                CharSequence charSequence42 = o0Var2.g;
                CharSequence charSequence52 = o0Var2.f;
                i0Var = o0Var2.K;
                Integer num3 = o0Var2.I;
                Integer num22 = o0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z10) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z10) {
                }
                if (z11) {
                }
                bundle3 = bundle42;
                if (!i0Var.isEmpty()) {
                }
                charSequence = o0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence52, charSequence42, bitmap2, o0Var2.n, bundle3, l0Var2.f.a), i7 != -1 ? -1L : i7));
                i7++;
                arrayList3 = arrayList;
            }
            p4.m0.e0(((p4.m0) qeVar.e).n, arrayList4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri fromFile;
        int i7;
        int indexOf;
        int i10;
        int i11;
        char c10;
        String G;
        org.telegram.ui.web.v0 v0Var;
        boolean z10;
        int i12 = 2;
        switch (this.a) {
            case 0:
                kl0.i0((kl0) this.b, (TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.c;
                org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) this.d;
                String str = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.Z8;
                Bitmap decodeFile = BitmapFactory.decodeFile(ffVar.I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.h3(new en0(photoViewer, 10));
                    return;
                }
                int i13 = 11;
                int[] iArr = new int[11];
                AnimatedFileNative.d(ffVar2.I, iArr, 0L);
                int max = Math.max(iArr[1], ffVar2.F);
                int max2 = Math.max(iArr[2], ffVar2.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                int i14 = (int) (f10 * max3);
                int i15 = (int) (f11 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(i14, i15, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.h3(new ok0(photoViewer, ffVar2, str, createBitmap2, 2));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new en0(photoViewer, i13));
                    return;
                }
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.ff ffVar3 = (org.telegram.messenger.ff) this.c;
                String str2 = (String) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                if (ffVar3.g != null) {
                    try {
                        new File(ffVar3.g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                ffVar3.d = -1L;
                ffVar3.g = str2;
                ffVar3.e = null;
                ffVar3.f = null;
                photoViewer2.q5.b.setLoading(false);
                sq0 sq0Var = photoViewer2.d;
                if (sq0Var != null) {
                    sq0Var.X(photoViewer2.P4);
                }
                vo0 vo0Var = photoViewer2.h1;
                if (vo0Var != null) {
                    vo0Var.setImage(bitmap);
                }
                photoViewer2.c3(0);
                CheckBox checkBox = photoViewer2.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 3:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ao0 ao0Var = (ao0) this.e;
                ImageView imageView = photoViewer3.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    ao0Var.run();
                    return;
                }
                return;
            case 4:
                oo0 oo0Var = (oo0) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.m10 m10Var = (org.telegram.messenger.m10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                PhotoViewer photoViewer4 = oo0Var.b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i16 = photoViewer4.U;
                    ArrayList arrayList = photoViewer4.f7;
                    org.telegram.messenger.np.s1(i16).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = org.telegram.messenger.np.s1(photoViewer4.U).a2(Long.valueOf(m10Var.n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (a22 != null) {
                            a22.photo.photo_id = tL_photos_photo.photo.id;
                            m10Var.w(a22);
                            m10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                es0.Z((es0) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c, (TL_stars.updatePaidMessagesPrice) this.e);
                return;
            case 6:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c, (boolean[]) this.e);
                return;
            case 7:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                try {
                    t1Var.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = true;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.a.f();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                RectF rectF = ProfileActivity.X6;
                try {
                    t1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr2[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, org.telegram.messenger.hd.M0(2131751105, null), 0).show();
                        return;
                    }
                    return;
                }
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 24) {
                    org.telegram.messenger.t0.d();
                    fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i17 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.hd.E0().z0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        return;
                    }
                }
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr2 = (int[]) this.e;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    i7 = 0;
                } else {
                    RectF rectF2 = ProfileActivity.X6;
                    profileActivity.getClass();
                    i7 = 0;
                    org.telegram.ui.Components.cc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.p4 == iArr2[i7]) {
                    profileActivity.p4 = i7;
                    return;
                }
                return;
            case 10:
                ProfileActivity.i0((ProfileActivity) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c, (String) this.e);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                String[] strArr = (String[]) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                RectF rectF3 = ProfileActivity.X6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.p21.V0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str3, str4, new l00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    j00.a(profileActivity3.getParentActivity(), 0, tL_username.username, profileActivity3.e1 != 0 ? profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.e1)) : profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.f1)), (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    return;
                } else {
                    RectF rectF4 = ProfileActivity.X6;
                    org.telegram.ui.Components.cc.d0(tL_error2);
                    return;
                }
            case 13:
                pv0 pv0Var = (pv0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.m10 m10Var2 = (org.telegram.messenger.m10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = pv0Var.b;
                profileActivity4.o0.d1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(m10Var2.n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.o0.W0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (a23 != null) {
                            a23.photo.photo_id = tL_photos_photo2.photo.id;
                            m10Var2.w(a23);
                            m10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                bw0 bw0Var = (bw0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                ProfileActivity profileActivity5 = bw0Var.c.e;
                profileActivity5.g5(null);
                if (!(tLObject6 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.cc.d0(tL_error3);
                    return;
                }
                TLObject a24 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.f1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                j00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, a24, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.A0);
                return;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                try {
                    t1Var3.dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    v21 v21Var = sessionsActivity.a;
                    if (v21Var != null) {
                        v21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                try {
                    t1Var4.dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    v21 v21Var2 = sessionsActivity2.a;
                    if (v21Var2 != null) {
                        v21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                u21 u21Var = (u21) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                j9 j9Var = (j9) this.e;
                u21Var.a = tLObject7;
                u21Var.b = tL_error6;
                j9Var.run();
                return;
            case 18:
                k31.d0((k31) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c, (String) this.e);
                return;
            case 19:
                k41 k41Var = (k41) this.b;
                mg.b bVar = (mg.b) this.c;
                String str5 = (String) this.d;
                y41 y41Var = (y41) this.e;
                z41 z41Var = k41Var.x;
                if (bVar != null) {
                    z41Var.V.l(str5, bVar);
                }
                if (bVar != null && !y41Var.b && (i10 = y41Var.a) >= 0) {
                    View m10 = z41Var.U.m(i10);
                    if (m10 instanceof k41) {
                        k41Var.r.e = bVar;
                        k41 k41Var2 = (k41) m10;
                        k41Var2.b.u0.d(false, false);
                        k41Var2.g(false);
                    }
                }
                z41.c0(z41Var);
                return;
            case 20:
                l41 l41Var = (l41) this.b;
                mg.b bVar2 = (mg.b) this.c;
                String str6 = (String) this.d;
                org.telegram.messenger.r10 r10Var = (org.telegram.messenger.r10) this.e;
                l41Var.k = false;
                l41Var.d = bVar2;
                l41Var.g = str6;
                j41 j41Var = (j41) r10Var.run();
                if (j41Var != null) {
                    j41Var.e(l41Var, true);
                    return;
                }
                return;
            case 21:
                o81 o81Var = (o81) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                String str7 = (String) this.d;
                org.telegram.ui.ActionBar.t1 t1Var5 = (org.telegram.ui.ActionBar.t1) this.e;
                s81 s81Var = o81Var.a;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    int i18 = 0;
                    while (i18 < updates.updates.size()) {
                        if (updates.updates.get(i18) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i18);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str7;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = s81Var.getMessagesController().z1(s81Var.a);
                            tL_messageService.dialog_id = s81Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
                            arrayList3.add(new org.telegram.messenger.gj(i11, tL_messageService, false, false));
                            TLRPC.Chat M0 = s81Var.getMessagesController().M0(Long.valueOf(-s81Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = s81Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i12;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str7;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = s81Var.getMessagesController().z1(s81Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = s81Var.F;
                            an anVar = s81Var.E;
                            if (anVar != null) {
                                anVar.ob();
                                anVar.sb();
                                anVar.Vb(arrayList3, M0, tL_messageService.id, 1, 1, tL_forumTopic);
                                anVar.c = true;
                                anVar.L8();
                                anVar.wd(true);
                                anVar.p1.n(true);
                                anVar.Cd();
                                anVar.g2.setCurrentTopic(anVar.b());
                                anVar.zd(true);
                                anVar.Pc(true);
                                anVar.D9(true);
                                anVar.N6(true, true);
                                anVar.hb();
                                s81Var.getMessagesController().r7.q(s81Var.a, tL_forumTopic, true);
                                s81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -s81Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                an anVar2 = new an(bundle);
                                anVar2.Vb(arrayList3, M0, tL_messageService.id, 1, 1, tL_forumTopic);
                                anVar2.c = true;
                                s81Var.getMessagesController().r7.q(s81Var.a, tL_forumTopic, true);
                                s81Var.presentFragment(anVar2);
                            }
                        }
                        i18++;
                        i12 = 2;
                    }
                }
                t1Var5.dismiss();
                return;
            case 22:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.b, (byte[]) this.d, (TLObject) this.c, (byte[]) this.e);
                return;
            case 23:
                xa1 xa1Var = (xa1) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                String str8 = (String) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    xa1Var.z0(new fy0(22, xa1Var, str8));
                    return;
                }
                if (tL_error7 == null || tL_error7.text.startsWith("CODE_INVALID")) {
                    xa1Var.D0();
                    return;
                }
                if (!tL_error7.text.startsWith("FLOOD_WAIT")) {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), tL_error7.text);
                    return;
                }
                int intValue = Utilities.z(tL_error7.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M02 = org.telegram.messenger.hd.M0(2131743931, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                xa1Var.L0(M02, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, objArr));
                return;
            case 24:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.b;
                fi.i7 i7Var = (fi.i7) this.c;
                String str9 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (s0Var.c && ((v0Var = s0Var.R) == null || !v0Var.o(i7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str9 + " dropped after document change");
                    return;
                }
                s0Var.d("window.Telegram.WebView.receiveEvent('" + str9 + "', " + jSONObject + ");");
                return;
            case 25:
                ab.c0 c0Var = (ab.c0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                p4.h hVar = (p4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (c0Var.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            c0Var.k(hVar);
                        }
                    } finally {
                    }
                }
                return;
            case 26:
                a();
                return;
            case 27:
                p4.c1 c1Var = (p4.c1) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.d0 d0Var = (p4.d0) this.d;
                p4.l lVar = (p4.l) this.e;
                ab.c0 c0Var2 = c1Var.b;
                try {
                    c1Var.c.remove(vVar);
                    if (!d0Var.j()) {
                        p4.x0 x0Var = (p4.x0) vVar.d;
                        x0Var.getClass();
                        IBinder asBinder = x0Var.a.asBinder();
                        p4.t m11 = d0Var.m(vVar);
                        if (c0Var2.x(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var2.b(asBinder, vVar, m11.a, m11.b);
                        com.google.android.gms.common.api.internal.t u10 = c0Var2.u(vVar);
                        if (u10 == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            p4.g1 g1Var = d0Var.t;
                            p4.e1 e1Var = d0Var.s;
                            e2.y0 y0Var = m11.b;
                            p4.e1 A1 = c1Var.A1(e1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.n.b).c.b;
                            h9.i0 i0Var = m11.c;
                            if (i0Var == null) {
                                i0Var = d0Var.y;
                            }
                            h9.i0 i0Var2 = m11.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.z;
                            }
                            h9.i0 i0Var3 = d0Var.r;
                            p4.j1 j1Var = m11.a;
                            e2.y0 t6 = g1Var.t();
                            p4.o1 o1Var = d0Var.j.a;
                            o1Var.getClass();
                            p4.j jVar = new p4.j(c1Var, i0Var, i0Var2, i0Var3, j1Var, y0Var, t6, new Bundle(o1Var.g), d0Var.A, A1, token);
                            if (!d0Var.j()) {
                                try {
                                    ((p4.k) lVar).h1(u10.e(), jVar.a(vVar.c));
                                    z10 = true;
                                } catch (RemoteException unused2) {
                                    z10 = false;
                                }
                                if (z10) {
                                    try {
                                        if (!d0Var.x || !p4.d0.k(vVar)) {
                                            d0Var.e.getClass();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (!z10) {
                                            c8.hb.a(lVar);
                                        }
                                        throw th;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                        }
                    }
                    c8.hb.a(lVar);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                break;
            case 28:
                p4.d0 d0Var2 = (p4.d0) this.b;
                m9.e0 e0Var = (m9.e0) this.c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.e;
                if (d0Var2.j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th4) {
                    e0Var.n(th4);
                    return;
                }
            default:
                p4.d0 d0Var3 = (p4.d0) this.b;
                p4.z0 z0Var = (p4.z0) this.c;
                p4.v vVar2 = (p4.v) this.d;
                List list = (List) this.e;
                if (d0Var3.j()) {
                    return;
                }
                z0Var.a(d0Var3.t, vVar2, list);
                return;
        }
    }

    public /* synthetic */ ok0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = tLObject;
        this.e = obj2;
        this.d = tL_error;
    }

    public /* synthetic */ ok0(org.telegram.ui.ActionBar.e2 e2Var, Object obj, TLObject tLObject, Object obj2, int i7) {
        this.a = i7;
        this.b = e2Var;
        this.d = obj;
        this.c = tLObject;
        this.e = obj2;
    }
}
