package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class kh0 extends qp implements NotificationCenter.NotificationCenterDelegate {
    public long A0;
    public TLRPC.ChatFull B0;
    public final fh0 C0;
    public boolean D0;
    public boolean E0;
    public final boolean F0;
    public ImageLocation G0;
    public final int H0;
    public final Path I0;
    public final RectF J0;
    public final float[] K0;
    public ImageLocation L0;
    public ImageLocation M0;
    public h61 N0;
    public MessagesController.DialogPhotos O0;
    public final ArrayList P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final ArrayList S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public int Y0;
    public final SparseArray Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public org.telegram.ui.lu0 d1;
    public boolean e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public int k1;
    public bh0 l1;
    public ImageLocation m1;
    public ImageLocation n1;
    public final PointF t0;
    public final int u0;
    public final org.telegram.ui.ActionBar.l v0;
    public boolean w0;
    public boolean x0;
    public final jl0 y0;
    public final jh0 z0;

    public kh0(Context context, org.telegram.ui.ActionBar.l lVar, jl0 jl0Var, org.telegram.ui.r4 r4Var) {
        super(context);
        this.t0 = new PointF();
        this.w0 = true;
        this.x0 = true;
        int i10 = UserConfig.selectedAccount;
        this.H0 = i10;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new float[8];
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Z0 = new SparseArray();
        this.a1 = true;
        this.f1 = -1;
        this.g1 = -1;
        setOffscreenPageLimit(2);
        this.l1 = null;
        this.F0 = false;
        this.y0 = jl0Var;
        ConnectionsManager.generateClassGuid();
        this.v0 = lVar;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = r4Var;
        b(new ch0(this));
        jh0 jh0Var = new jh0(this, getContext(), null);
        this.z0 = jh0Var;
        setAdapter((pp) jh0Var);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.O0 = null;
    }

    public final void A(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.L0 = imageLocation;
        this.Q0.add(0, null);
        this.P0.add(0, null);
        this.T0.add(0, imageLocation);
        this.U0.add(0, imageLocation2);
        this.V0.add(0, null);
        this.S0.add(0, null);
        this.R0.add(0, null);
        this.W0.add(0, -1);
        this.X0.add(0, Float.valueOf(0.0f));
        this.z0.g();
        L();
        this.m1 = imageLocation;
        this.n1 = imageLocation2;
    }

    public final void B(float f9, int i10) {
        int i11 = this.f1;
        float f10 = 0.0f;
        if (i11 >= 0 || this.g1 >= 0) {
            if (i11 < 0) {
                i11 = this.g1;
            }
            int k9 = this.z0.k(i10);
            if (this.e1) {
                k9--;
            }
            float f11 = k9 == i11 ? 1.0f - f9 : (getRealCount() <= 0 || (k9 + (-1)) % getRealCount() != i11) ? (getRealCount() <= 0 || (k9 + 1) % getRealCount() != i11) ? 0.0f : (1.0f - f9) + 1.0f : (1.0f - f9) - 1.0f;
            if (f11 > 1.0f) {
                f11 = 2.0f - f11;
            }
            f10 = Utilities.clamp(f11, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f10);
    }

    public final ImageLocation C(ImageLocation imageLocation, ImageLocation imageLocation2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 2) {
            ArrayList arrayList = i10 == 0 ? this.U0 : this.T0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i11);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i12 = imageLocation3.dc_id;
                    if (i12 == imageLocation.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.S0.get(i11);
                        }
                    }
                    if (i12 == imageLocation2.dc_id) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.S0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
        }
        return null;
    }

    public final ImageLocation D(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.S0.get(i10);
        return imageLocation != null ? imageLocation : (ImageLocation) arrayList.get(i10);
    }

    public final View E(int i10) {
        jh0 jh0Var = this.z0;
        if (jh0Var == null) {
            return null;
        }
        ArrayList arrayList = jh0Var.c;
        if (arrayList.size() <= i10 || i10 < 0) {
            return null;
        }
        gh0 gh0Var = (gh0) arrayList.get(i10);
        hh0 hh0Var = gh0Var.b;
        return hh0Var == null ? gh0Var.c : hh0Var;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.R0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i10);
    }

    public final ImageLocation G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (ImageLocation) arrayList.get(i10);
    }

    public final boolean H(h61 h61Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z10) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation != null && imageLocation2 != null && this.Y0 == 0) {
            ImageLocation imageLocation3 = this.L0;
            ArrayList arrayList = this.T0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                jh0 jh0Var = this.z0;
                if (!isEmpty) {
                    this.L0 = imageLocation;
                    if (z10 && (dialogPhotos2 = this.O0) != null) {
                        dialogPhotos2.reset();
                        this.O0.loadAfter(getCurrentItem() - (jh0Var != null ? jh0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z10 && (dialogPhotos = this.O0) != null) {
                    dialogPhotos.reset();
                    this.O0.loadAfter(getCurrentItem() - (jh0Var != null ? jh0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.L0 = imageLocation;
                this.M0 = imageLocation2;
                this.N0 = h61Var;
                this.Q0.add(null);
                this.P0.add(null);
                arrayList.add(imageLocation);
                this.U0.add(imageLocation2);
                this.V0.add(h61Var);
                this.S0.add(null);
                this.R0.add(null);
                this.W0.add(-1);
                this.X0.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.e1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.S0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        t9 currentItemView;
        if (this.S0.get(this.e1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        c6 animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.s();
    }

    public final void K() {
        this.l1 = null;
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        int i11 = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i11);
        NotificationCenter.getInstance(i10).removeObserver(this, i11);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof t9) {
                t9 t9Var = (t9) childAt;
                if (t9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = t9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof c6) {
                        ((c6) drawable).w(t9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.z0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.A0 == j10 && !z10) {
            L();
            return;
        }
        this.b1 = true;
        this.P0.clear();
        this.Q0.clear();
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.W0.clear();
        this.X0.clear();
        this.z0.g();
        x(0, false);
        this.k1 = 0;
        this.G0 = null;
        this.L0 = null;
        this.A0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.H0).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i10, int i11) {
        this.i1 = i10;
        this.j1 = i11;
        jh0 jh0Var = this.z0;
        if (jh0Var != null) {
            for (int i12 = 0; i12 < jh0Var.c.size(); i12++) {
                if (((gh0) jh0Var.c.get(i12)).c != null) {
                    eh0 eh0Var = ((gh0) jh0Var.c.get(i12)).c;
                    int i13 = this.i1;
                    int i14 = this.j1;
                    eh0Var.r(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f9) {
        if (imageLocation == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.T0;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == imageLocation) {
                this.X0.set(i10, Float.valueOf(f9));
                SparseArray sparseArray = this.Z0;
                if (sparseArray.get(i10) != null) {
                    ((RadialProgress2) sparseArray.get(i10)).o(f9, true);
                }
            } else {
                i10++;
            }
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).invalidate();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        TLRPC.User user;
        ArrayList arrayList;
        ImageLocation imageLocation;
        int i12;
        boolean z10;
        kh0 kh0Var;
        boolean z11;
        int i13;
        ArrayList arrayList2;
        ImageLocation imageLocation2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList4;
        Integer num2;
        TLRPC.User user2;
        boolean z12;
        TLRPC.User user3;
        Object obj;
        boolean z13;
        TLRPC.Photo photo;
        kh0 kh0Var2 = this;
        Integer num3 = -1;
        int i14 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = kh0Var2.Q0;
        ArrayList arrayList6 = kh0Var2.P0;
        if (i10 != i14) {
            int i15 = NotificationCenter.fileLoaded;
            SparseArray sparseArray = kh0Var2.Z0;
            if (i10 == i15) {
                String str = (String) objArr[0];
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    String str2 = (String) arrayList6.get(i16);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i16);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i16);
                        if (radialProgress2 != null) {
                            radialProgress2.o(1.0f, true);
                        }
                        kh0Var2.invalidate();
                    }
                }
                return;
            }
            if (i10 != NotificationCenter.fileLoadProgressChanged) {
                if (i10 == NotificationCenter.reloadDialogPhotos && kh0Var2.Y0 == 0 && (dialogPhotos = kh0Var2.O0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos2 = kh0Var2.O0;
                    int currentItem = kh0Var2.getCurrentItem();
                    jh0 jh0Var = kh0Var2.z0;
                    dialogPhotos2.loadAfter(currentItem - (jh0Var != null ? jh0Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                String str4 = (String) arrayList6.get(i17);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i17);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i17);
                    if (radialProgress22 != null) {
                        radialProgress22.o(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
                    }
                    kh0Var2.invalidate();
                }
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos3 = (MessagesController.DialogPhotos) objArr[0];
        if (kh0Var2.O0 == dialogPhotos3) {
            ArrayList arrayList7 = new ArrayList(dialogPhotos3.photos);
            if (!arrayList7.isEmpty() || !dialogPhotos3.fromCache) {
                kh0Var2.f1 = -1;
                kh0Var2.g1 = -1;
                int i18 = kh0Var2.H0;
                TLRPC.User user4 = MessagesController.getInstance(i18).getUser(Long.valueOf(kh0Var2.A0));
                TLRPC.UserFull userFull = MessagesController.getInstance(i18).getUserFull(kh0Var2.A0);
                if (userFull != null && (photo = userFull.personal_photo) != null) {
                    arrayList7.add(0, photo);
                    kh0Var2.f1 = 0;
                }
                if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                    arrayList7.add(userFull.fallback_photo);
                    kh0Var2.g1 = arrayList7.size() - 1;
                }
                arrayList5.clear();
                arrayList6.clear();
                ArrayList arrayList8 = kh0Var2.T0;
                arrayList8.clear();
                ArrayList arrayList9 = kh0Var2.S0;
                arrayList9.clear();
                ArrayList arrayList10 = kh0Var2.U0;
                arrayList10.clear();
                ArrayList arrayList11 = kh0Var2.V0;
                arrayList11.clear();
                ArrayList arrayList12 = kh0Var2.R0;
                arrayList12.clear();
                ArrayList arrayList13 = kh0Var2.W0;
                arrayList13.clear();
                ArrayList arrayList14 = kh0Var2.X0;
                arrayList14.clear();
                if (DialogObject.isChatDialog(kh0Var2.A0)) {
                    TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-kh0Var2.A0));
                    imageLocation = ImageLocation.getForUserOrChat(i18, chat, 0);
                    arrayList = arrayList8;
                    if (imageLocation != null) {
                        arrayList.add(imageLocation);
                        user = user4;
                        arrayList10.add(ImageLocation.getForUserOrChat(i18, chat, 1));
                        arrayList11.add(null);
                        arrayList5.add(null);
                        TLRPC.ChatFull chatFull = kh0Var2.B0;
                        if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                            z13 = false;
                            arrayList12.add(null);
                            arrayList6.add(null);
                            arrayList9.add(null);
                        } else {
                            arrayList12.add(kh0Var2.B0.chat_photo);
                            if (kh0Var2.B0.chat_photo.video_sizes.isEmpty()) {
                                z13 = false;
                                arrayList9.add(null);
                                arrayList6.add(null);
                            } else {
                                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(kh0Var2.B0.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, kh0Var2.B0.chat_photo));
                                arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                z13 = false;
                            }
                        }
                        arrayList13.add(num3);
                        arrayList14.add(z13);
                    } else {
                        user = user4;
                    }
                } else {
                    user = user4;
                    arrayList = arrayList8;
                    imageLocation = null;
                }
                int i19 = 0;
                while (true) {
                    int size = arrayList7.size();
                    i12 = i18;
                    z10 = kh0Var2.F0;
                    if (i19 >= size) {
                        break;
                    }
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i19);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList3 = photo2.sizes) == null) {
                        i13 = i19;
                        arrayList2 = arrayList7;
                        imageLocation2 = imageLocation;
                        num = num3;
                        arrayList12.add(null);
                        arrayList.add(null);
                        arrayList10.add(null);
                        arrayList11.add(null);
                        arrayList5.add(null);
                        arrayList9.add(null);
                        arrayList6.add(null);
                        arrayList13.add(num);
                        arrayList14.add(null);
                    } else {
                        i13 = i19;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 50);
                        int size2 = photo2.sizes.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size2) {
                                photoSize = closestPhotoSizeWithSize;
                                break;
                            }
                            int i21 = size2;
                            TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i20);
                            int i22 = i20;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                photoSize = photoSize2;
                                break;
                            } else {
                                i20 = i22 + 1;
                                size2 = i21;
                            }
                        }
                        if (imageLocation != null) {
                            int size3 = photo2.sizes.size();
                            arrayList2 = arrayList7;
                            int i23 = 0;
                            while (i23 < size3) {
                                int i24 = size3;
                                TLRPC.FileLocation fileLocation = photo2.sizes.get(i23).location;
                                int i25 = i23;
                                if (fileLocation != null) {
                                    int i26 = fileLocation.local_id;
                                    arrayList4 = arrayList14;
                                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                    imageLocation2 = imageLocation;
                                    if (i26 == tL_fileLocationToBeDeprecated.local_id) {
                                        num2 = num3;
                                        if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                            arrayList12.set(0, photo2);
                                            if (!photo2.video_sizes.isEmpty()) {
                                                arrayList9.set(0, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), photo2));
                                            }
                                            num = num2;
                                            arrayList14 = arrayList4;
                                        } else {
                                            num3 = num2;
                                            arrayList14 = arrayList4;
                                            imageLocation = imageLocation2;
                                            i23 = i25 + 1;
                                            size3 = i24;
                                        }
                                    }
                                } else {
                                    arrayList4 = arrayList14;
                                    imageLocation2 = imageLocation;
                                }
                                num2 = num3;
                                num3 = num2;
                                arrayList14 = arrayList4;
                                imageLocation = imageLocation2;
                                i23 = i25 + 1;
                                size3 = i24;
                            }
                            num2 = num3;
                            arrayList4 = arrayList14;
                            imageLocation2 = imageLocation;
                        } else {
                            arrayList2 = arrayList7;
                            arrayList4 = arrayList14;
                            imageLocation2 = imageLocation;
                            num2 = num3;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            int i27 = photo2.dc_id;
                            if (i27 != 0) {
                                TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                                fileLocation2.dc_id = i27;
                                fileLocation2.file_reference = photo2.file_reference;
                            }
                            ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                            if (forPhoto != null) {
                                ImageLocation imageLocation3 = kh0Var2.L0;
                                num = num2;
                                if (imageLocation3 == null) {
                                    arrayList14 = arrayList4;
                                    user2 = user;
                                } else if (imageLocation3.photoId != forPhoto.photoId || z10 || kh0Var2.A0 == UserConfig.getInstance(i12).getClientUserId()) {
                                    user2 = user;
                                    arrayList14 = arrayList4;
                                } else {
                                    arrayList5.add(null);
                                    arrayList.add(kh0Var2.L0);
                                    ImageLocation imageLocation4 = kh0Var2.M0;
                                    if (imageLocation4 == null) {
                                        imageLocation4 = ImageLocation.getForPhoto(photoSize, photo2);
                                    }
                                    arrayList10.add(imageLocation4);
                                    if (photo2.video_sizes.isEmpty()) {
                                        user3 = user;
                                        obj = null;
                                        arrayList11.add(kh0Var2.N0);
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize != null) {
                                            user3 = user;
                                            arrayList11.add(new h61(vectorMarkupVideoSize, user != null && user3.premium, 2));
                                            obj = null;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        } else {
                                            user3 = user;
                                            obj = null;
                                            arrayList11.add(null);
                                            arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2));
                                            arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                                        }
                                    }
                                    arrayList12.add(obj);
                                    arrayList13.add(num);
                                    arrayList14 = arrayList4;
                                    arrayList14.add(obj);
                                    user = user3;
                                }
                                arrayList.add(forPhoto);
                                arrayList5.add(FileLoader.getAttachFileName(photoSize instanceof TLRPC.TL_photoStrippedSize ? closestPhotoSizeWithSize2 : photoSize));
                                arrayList10.add(ImageLocation.getForPhoto(photoSize, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user2;
                                    z12 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                    TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize2 != null) {
                                        user = user2;
                                        arrayList11.add(new h61(vectorMarkupVideoSize2, user2 != null && user2.premium, 2));
                                        z12 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user2;
                                        z12 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                        arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                arrayList14.add(z12);
                            }
                        }
                        num = num2;
                        arrayList14 = arrayList4;
                    }
                    i19 = i13 + 1;
                    kh0Var2 = this;
                    num3 = num;
                    i18 = i12;
                    arrayList7 = arrayList2;
                    imageLocation = imageLocation2;
                }
                int size4 = arrayList10.size();
                if (size4 > 1) {
                    int i28 = 0;
                    while (true) {
                        if (i28 >= (size4 > 2 ? 2 : 1)) {
                            break;
                        }
                        FileLoader.getInstance(i12).loadFile((ImageLocation) arrayList10.get(i28 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                        i28++;
                    }
                }
                getAdapter().g();
                if (z10) {
                    kh0Var = this;
                    if (!kh0Var.D0 || kh0Var.b1) {
                        kh0Var.L();
                    }
                } else {
                    kh0Var = this;
                    if (!kh0Var.D0 || kh0Var.b1) {
                        kh0Var.L();
                        kh0Var.getAdapter().g();
                        kh0Var.B(0.0f, kh0Var.getRealPosition());
                    }
                }
                if (kh0Var.g1 >= 0 || kh0Var.f1 >= 0) {
                    z11 = false;
                } else {
                    z11 = false;
                    kh0Var.B(0.0f, 0);
                }
                kh0Var.b1 = z11;
                fh0 fh0Var = kh0Var.C0;
                if (fh0Var != null) {
                    fh0Var.c();
                }
                ImageLocation imageLocation5 = kh0Var.m1;
                if (imageLocation5 != null) {
                    kh0Var.A(imageLocation5, kh0Var.n1);
                }
            }
        }
    }

    public bh0 getBlurDrawer() {
        return this.l1;
    }

    public float getCurrentItemProgress() {
        c6 animation;
        t9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public t9 getCurrentItemView() {
        jh0 jh0Var = this.z0;
        if (jh0Var == null || jh0Var.c.isEmpty()) {
            return null;
        }
        return ((gh0) jh0Var.c.get(getCurrentItem())).c;
    }

    public long getDialogId() {
        return this.A0;
    }

    public int getRealCount() {
        int size = this.R0.size();
        return this.e1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.z0.k(getCurrentItem());
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.y0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bh0 bh0Var = this.l1;
        if (bh0Var != null) {
            bh0Var.setTranslationY(getHeight() - this.l1.getMeasuredHeight());
        }
    }

    @Override // m2.g, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        bh0 bh0Var = this.l1;
        if (bh0Var != null) {
            bh0Var.C = true;
            bh0Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r0 > r5) goto L88;
     */
    @Override // m2.g, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        jh0 jh0Var = this.z0;
        if (jh0Var != null) {
            jl0 jl0Var = this.y0;
            if (jl0Var.getScrollState() != 0 && !this.w0 && this.x0) {
                this.x0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.lu0 lu0Var = this.d1;
            fh0 fh0Var = this.C0;
            if (lu0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.E0) {
                    org.telegram.ui.lu0 lu0Var2 = this.d1;
                    if (!lu0Var2.n) {
                        lu0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.d1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.E0) {
                        this.E0 = true;
                        if (fh0Var != null) {
                            fh0Var.a();
                        }
                    }
                    return true;
                }
            }
            PointF pointF = this.t0;
            if (action == 0) {
                this.w0 = true;
                this.x0 = true;
                this.D0 = true;
                pointF.set(motionEvent.getX(), motionEvent.getY());
                if (jh0Var.c.size() > 1 && fh0Var != null) {
                    fh0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.E0 = false;
            } else if (action == 1) {
                if (!this.E0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i10 = jh0Var.j();
                            int i11 = currentItem + 1;
                            if (i11 < realCount + i10) {
                                i10 = i11;
                            }
                        } else {
                            int i12 = (-1) + currentItem;
                            i10 = i12 < jh0Var.j() ? (realCount + r0) - 1 : i12;
                        }
                        if (fh0Var != null) {
                            fh0Var.a();
                        }
                        x(i10, false);
                    }
                }
            } else if (action == 2) {
                float x4 = motionEvent.getX() - pointF.x;
                float y8 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y8);
                float f9 = this.u0;
                boolean z10 = abs >= f9 || Math.abs(x4) >= f9;
                if (z10) {
                    this.E0 = true;
                    if (fh0Var != null) {
                        fh0Var.a();
                    }
                }
                boolean z11 = this.x0;
                if (z11 && this.w0) {
                    if (z10) {
                        if (Math.abs(y8) > Math.abs(x4)) {
                            this.x0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.w0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            jl0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z11) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.w0 ? jl0Var.onTouchEvent(motionEvent) : false;
            if (this.x0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (action == 1 || action == 3) {
                this.w0 = false;
                this.x0 = false;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        bh0 bh0Var = this.l1;
        if (bh0Var != null) {
            bh0Var.setAlpha(f9);
        }
    }

    public void setAnimatedFileMaybe(c6 c6Var) {
        jh0 jh0Var;
        if (c6Var == null || (jh0Var = this.z0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof t9) && jh0Var.k(jh0Var.d.indexOf(childAt)) == 0) {
                t9 t9Var = (t9) childAt;
                c6 animation = t9Var.getImageReceiver().getAnimation();
                if (animation != c6Var) {
                    if (animation != null) {
                        animation.w(t9Var);
                    }
                    t9Var.setImageDrawable(c6Var);
                    c6Var.f(this);
                    c6Var.N = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.B0 = chatFull;
        ArrayList arrayList = this.R0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.B0 == null) {
            return;
        }
        ArrayList arrayList2 = this.T0;
        if (arrayList2.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.B0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.B0.chat_photo);
        boolean isEmpty = this.B0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.P0;
        ArrayList arrayList4 = this.S0;
        if (isEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.B0.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.B0.chat_photo));
            arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            fh0 fh0Var = this.C0;
            if (fh0Var != null) {
                fh0Var.c();
            }
        }
        this.X0.set(0, null);
        this.z0.g();
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.a1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.e1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.h1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.c1 = z10;
    }

    public void setParentAvatarImage(t9 t9Var) {
        jh0 jh0Var = this.z0;
        if (jh0Var != null) {
            jh0Var.g = t9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.lu0 lu0Var) {
        this.d1 = lu0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        bh0 bh0Var = this.l1;
        if (bh0Var != null) {
            bh0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f9) {
    }

    public kh0(Context context, long j10, org.telegram.ui.ActionBar.l lVar, jl0 jl0Var, org.telegram.ui.iz0 iz0Var, fh0 fh0Var, bh0 bh0Var) {
        super(context);
        this.t0 = new PointF();
        this.w0 = true;
        this.x0 = true;
        int i10 = UserConfig.selectedAccount;
        this.H0 = i10;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new float[8];
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Z0 = new SparseArray();
        this.a1 = true;
        this.f1 = -1;
        this.g1 = -1;
        this.l1 = bh0Var;
        setPadding(0, 0, 0, bh0Var == null ? 0 : bh0Var.n);
        if (bh0Var != null) {
            bh0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.F0 = true;
        this.A0 = j10;
        this.y0 = jl0Var;
        this.v0 = lVar;
        jh0 jh0Var = new jh0(this, getContext(), iz0Var);
        this.z0 = jh0Var;
        setAdapter((pp) jh0Var);
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = fh0Var;
        b(new dh0((org.telegram.ui.my0) this));
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i10).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
