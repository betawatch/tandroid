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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class wh0 extends tp implements NotificationCenter.NotificationCenterDelegate {
    public final vh0 A0;
    public long B0;
    public TLRPC.ChatFull C0;
    public final rh0 D0;
    public boolean E0;
    public boolean F0;
    public final boolean G0;
    public ImageLocation H0;
    public final int I0;
    public final Path J0;
    public final RectF K0;
    public final float[] L0;
    public ImageLocation M0;
    public ImageLocation N0;
    public s61 O0;
    public MessagesController.DialogPhotos P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final ArrayList S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public int Z0;
    public final SparseArray a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public org.telegram.ui.cv0 e1;
    public boolean f1;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public nh0 m1;
    public ImageLocation n1;
    public ImageLocation o1;
    public final PointF u0;
    public final int v0;
    public final org.telegram.ui.ActionBar.k w0;
    public boolean x0;
    public boolean y0;
    public final rl0 z0;

    public wh0(Context context, org.telegram.ui.ActionBar.k kVar, rl0 rl0Var, org.telegram.ui.v4 v4Var) {
        super(context);
        this.u0 = new PointF();
        this.x0 = true;
        this.y0 = true;
        int i10 = UserConfig.selectedAccount;
        this.I0 = i10;
        this.J0 = new Path();
        this.K0 = new RectF();
        this.L0 = new float[8];
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.a1 = new SparseArray();
        this.b1 = true;
        this.g1 = -1;
        this.h1 = -1;
        setOffscreenPageLimit(2);
        this.m1 = null;
        this.G0 = false;
        this.z0 = rl0Var;
        ConnectionsManager.generateClassGuid();
        this.w0 = kVar;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.D0 = v4Var;
        b(new oh0(this));
        vh0 vh0Var = new vh0(this, getContext(), null);
        this.A0 = vh0Var;
        setAdapter((sp) vh0Var);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.P0 = null;
    }

    public final void A(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.M0 = imageLocation;
        this.R0.add(0, null);
        this.Q0.add(0, null);
        this.U0.add(0, imageLocation);
        this.V0.add(0, imageLocation2);
        this.W0.add(0, null);
        this.T0.add(0, null);
        this.S0.add(0, null);
        this.X0.add(0, -1);
        this.Y0.add(0, Float.valueOf(0.0f));
        this.A0.g();
        L();
        this.n1 = imageLocation;
        this.o1 = imageLocation2;
    }

    public final void B(float f10, int i10) {
        int i11 = this.g1;
        float f11 = 0.0f;
        if (i11 >= 0 || this.h1 >= 0) {
            if (i11 < 0) {
                i11 = this.h1;
            }
            int k10 = this.A0.k(i10);
            if (this.f1) {
                k10--;
            }
            float f12 = k10 == i11 ? 1.0f - f10 : (getRealCount() <= 0 || (k10 + (-1)) % getRealCount() != i11) ? (getRealCount() <= 0 || (k10 + 1) % getRealCount() != i11) ? 0.0f : (1.0f - f10) + 1.0f : (1.0f - f10) - 1.0f;
            if (f12 > 1.0f) {
                f12 = 2.0f - f12;
            }
            f11 = Utilities.clamp(f12, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f11);
    }

    public final ImageLocation C(ImageLocation imageLocation, ImageLocation imageLocation2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 2) {
            ArrayList arrayList = i10 == 0 ? this.V0 : this.U0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i11);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i12 = imageLocation3.dc_id;
                    if (i12 == imageLocation.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.T0.get(i11);
                        }
                    }
                    if (i12 == imageLocation2.dc_id) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.T0.get(i11);
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
        ArrayList arrayList = this.U0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.T0.get(i10);
        return imageLocation != null ? imageLocation : (ImageLocation) arrayList.get(i10);
    }

    public final View E(int i10) {
        vh0 vh0Var = this.A0;
        if (vh0Var == null) {
            return null;
        }
        ArrayList arrayList = vh0Var.c;
        if (arrayList.size() <= i10 || i10 < 0) {
            return null;
        }
        sh0 sh0Var = (sh0) arrayList.get(i10);
        th0 th0Var = sh0Var.b;
        return th0Var == null ? sh0Var.c : th0Var;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.S0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i10);
    }

    public final ImageLocation G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.U0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (ImageLocation) arrayList.get(i10);
    }

    public final boolean H(s61 s61Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z4) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation != null && imageLocation2 != null && this.Z0 == 0) {
            ImageLocation imageLocation3 = this.M0;
            ArrayList arrayList = this.U0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                vh0 vh0Var = this.A0;
                if (!isEmpty) {
                    this.M0 = imageLocation;
                    if (z4 && (dialogPhotos2 = this.P0) != null) {
                        dialogPhotos2.reset();
                        this.P0.loadAfter(getCurrentItem() - (vh0Var != null ? vh0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z4 && (dialogPhotos = this.P0) != null) {
                    dialogPhotos.reset();
                    this.P0.loadAfter(getCurrentItem() - (vh0Var != null ? vh0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.M0 = imageLocation;
                this.N0 = imageLocation2;
                this.O0 = s61Var;
                this.R0.add(null);
                this.Q0.add(null);
                arrayList.add(imageLocation);
                this.V0.add(imageLocation2);
                this.W0.add(s61Var);
                this.T0.add(null);
                this.S0.add(null);
                this.X0.add(-1);
                this.Y0.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.T0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        p9 currentItemView;
        if (this.T0.get(this.f1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        y5 animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.s();
    }

    public final void K() {
        this.m1 = null;
        int i10 = this.I0;
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
            if (childAt instanceof p9) {
                p9 p9Var = (p9) childAt;
                if (p9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = p9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof y5) {
                        ((y5) drawable).w(p9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.A0.j(), false);
    }

    public final void M(long j10, boolean z4) {
        if (this.B0 == j10 && !z4) {
            L();
            return;
        }
        this.c1 = true;
        this.Q0.clear();
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.A0.g();
        x(0, false);
        this.l1 = 0;
        this.H0 = null;
        this.M0 = null;
        this.B0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.I0).getDialogPhotos(j10);
        this.P0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i10, int i11) {
        this.j1 = i10;
        this.k1 = i11;
        vh0 vh0Var = this.A0;
        if (vh0Var != null) {
            for (int i12 = 0; i12 < vh0Var.c.size(); i12++) {
                if (((sh0) vh0Var.c.get(i12)).c != null) {
                    qh0 qh0Var = ((sh0) vh0Var.c.get(i12)).c;
                    int i13 = this.j1;
                    int i14 = this.k1;
                    qh0Var.r(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f10) {
        if (imageLocation == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.U0;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == imageLocation) {
                this.Y0.set(i10, Float.valueOf(f10));
                SparseArray sparseArray = this.a1;
                if (sparseArray.get(i10) != null) {
                    ((RadialProgress2) sparseArray.get(i10)).o(f10, true);
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
        boolean z4;
        wh0 wh0Var;
        boolean z10;
        int i13;
        ArrayList arrayList2;
        ImageLocation imageLocation2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList4;
        Integer num2;
        TLRPC.User user2;
        boolean z11;
        TLRPC.User user3;
        Object obj;
        boolean z12;
        TLRPC.Photo photo;
        wh0 wh0Var2 = this;
        Integer num3 = -1;
        int i14 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = wh0Var2.R0;
        ArrayList arrayList6 = wh0Var2.Q0;
        if (i10 != i14) {
            int i15 = NotificationCenter.fileLoaded;
            SparseArray sparseArray = wh0Var2.a1;
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
                        wh0Var2.invalidate();
                    }
                }
                return;
            }
            if (i10 != NotificationCenter.fileLoadProgressChanged) {
                if (i10 == NotificationCenter.reloadDialogPhotos && wh0Var2.Z0 == 0 && (dialogPhotos = wh0Var2.P0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos2 = wh0Var2.P0;
                    int currentItem = wh0Var2.getCurrentItem();
                    vh0 vh0Var = wh0Var2.A0;
                    dialogPhotos2.loadAfter(currentItem - (vh0Var != null ? vh0Var.j() : 0), true);
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
                    wh0Var2.invalidate();
                }
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos3 = (MessagesController.DialogPhotos) objArr[0];
        if (wh0Var2.P0 == dialogPhotos3) {
            ArrayList arrayList7 = new ArrayList(dialogPhotos3.photos);
            if (!arrayList7.isEmpty() || !dialogPhotos3.fromCache) {
                wh0Var2.g1 = -1;
                wh0Var2.h1 = -1;
                int i18 = wh0Var2.I0;
                TLRPC.User user4 = MessagesController.getInstance(i18).getUser(Long.valueOf(wh0Var2.B0));
                TLRPC.UserFull userFull = MessagesController.getInstance(i18).getUserFull(wh0Var2.B0);
                if (userFull != null && (photo = userFull.personal_photo) != null) {
                    arrayList7.add(0, photo);
                    wh0Var2.g1 = 0;
                }
                if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                    arrayList7.add(userFull.fallback_photo);
                    wh0Var2.h1 = arrayList7.size() - 1;
                }
                arrayList5.clear();
                arrayList6.clear();
                ArrayList arrayList8 = wh0Var2.U0;
                arrayList8.clear();
                ArrayList arrayList9 = wh0Var2.T0;
                arrayList9.clear();
                ArrayList arrayList10 = wh0Var2.V0;
                arrayList10.clear();
                ArrayList arrayList11 = wh0Var2.W0;
                arrayList11.clear();
                ArrayList arrayList12 = wh0Var2.S0;
                arrayList12.clear();
                ArrayList arrayList13 = wh0Var2.X0;
                arrayList13.clear();
                ArrayList arrayList14 = wh0Var2.Y0;
                arrayList14.clear();
                if (DialogObject.isChatDialog(wh0Var2.B0)) {
                    TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-wh0Var2.B0));
                    imageLocation = ImageLocation.getForUserOrChat(i18, chat, 0);
                    arrayList = arrayList8;
                    if (imageLocation != null) {
                        arrayList.add(imageLocation);
                        user = user4;
                        arrayList10.add(ImageLocation.getForUserOrChat(i18, chat, 1));
                        arrayList11.add(null);
                        arrayList5.add(null);
                        TLRPC.ChatFull chatFull = wh0Var2.C0;
                        if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                            z12 = false;
                            arrayList12.add(null);
                            arrayList6.add(null);
                            arrayList9.add(null);
                        } else {
                            arrayList12.add(wh0Var2.C0.chat_photo);
                            if (wh0Var2.C0.chat_photo.video_sizes.isEmpty()) {
                                z12 = false;
                                arrayList9.add(null);
                                arrayList6.add(null);
                            } else {
                                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(wh0Var2.C0.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, wh0Var2.C0.chat_photo));
                                arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                z12 = false;
                            }
                        }
                        arrayList13.add(num3);
                        arrayList14.add(z12);
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
                    z4 = wh0Var2.G0;
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
                                ImageLocation imageLocation3 = wh0Var2.M0;
                                num = num2;
                                if (imageLocation3 == null) {
                                    arrayList14 = arrayList4;
                                    user2 = user;
                                } else if (imageLocation3.photoId != forPhoto.photoId || z4 || wh0Var2.B0 == UserConfig.getInstance(i12).getClientUserId()) {
                                    user2 = user;
                                    arrayList14 = arrayList4;
                                } else {
                                    arrayList5.add(null);
                                    arrayList.add(wh0Var2.M0);
                                    ImageLocation imageLocation4 = wh0Var2.N0;
                                    if (imageLocation4 == null) {
                                        imageLocation4 = ImageLocation.getForPhoto(photoSize, photo2);
                                    }
                                    arrayList10.add(imageLocation4);
                                    if (photo2.video_sizes.isEmpty()) {
                                        user3 = user;
                                        obj = null;
                                        arrayList11.add(wh0Var2.O0);
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize != null) {
                                            user3 = user;
                                            arrayList11.add(new s61(vectorMarkupVideoSize, user != null && user3.premium, 2));
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
                                    z11 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                    TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                    if (vectorMarkupVideoSize2 != null) {
                                        user = user2;
                                        arrayList11.add(new s61(vectorMarkupVideoSize2, user2 != null && user2.premium, 2));
                                        z11 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user2;
                                        z11 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                        arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                arrayList14.add(z11);
                            }
                        }
                        num = num2;
                        arrayList14 = arrayList4;
                    }
                    i19 = i13 + 1;
                    wh0Var2 = this;
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
                if (z4) {
                    wh0Var = this;
                    if (!wh0Var.E0 || wh0Var.c1) {
                        wh0Var.L();
                    }
                } else {
                    wh0Var = this;
                    if (!wh0Var.E0 || wh0Var.c1) {
                        wh0Var.L();
                        wh0Var.getAdapter().g();
                        wh0Var.B(0.0f, wh0Var.getRealPosition());
                    }
                }
                if (wh0Var.h1 >= 0 || wh0Var.g1 >= 0) {
                    z10 = false;
                } else {
                    z10 = false;
                    wh0Var.B(0.0f, 0);
                }
                wh0Var.c1 = z10;
                rh0 rh0Var = wh0Var.D0;
                if (rh0Var != null) {
                    rh0Var.c();
                }
                ImageLocation imageLocation5 = wh0Var.n1;
                if (imageLocation5 != null) {
                    wh0Var.A(imageLocation5, wh0Var.o1);
                }
            }
        }
    }

    public nh0 getBlurDrawer() {
        return this.m1;
    }

    public float getCurrentItemProgress() {
        y5 animation;
        p9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public p9 getCurrentItemView() {
        vh0 vh0Var = this.A0;
        if (vh0Var == null || vh0Var.c.isEmpty()) {
            return null;
        }
        return ((sh0) vh0Var.c.get(getCurrentItem())).c;
    }

    public long getDialogId() {
        return this.B0;
    }

    public int getRealCount() {
        int size = this.S0.size();
        return this.f1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.A0.k(getCurrentItem());
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.z0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // m2.h, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        nh0 nh0Var = this.m1;
        if (nh0Var != null) {
            nh0Var.setTranslationY(getHeight() - this.m1.getMeasuredHeight());
        }
    }

    @Override // m2.h, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        nh0 nh0Var = this.m1;
        if (nh0Var != null) {
            nh0Var.D = true;
            nh0Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r0 > r5) goto L88;
     */
    @Override // m2.h, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        vh0 vh0Var = this.A0;
        if (vh0Var != null) {
            rl0 rl0Var = this.z0;
            if (rl0Var.getScrollState() != 0 && !this.x0 && this.y0) {
                this.y0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.cv0 cv0Var = this.e1;
            rh0 rh0Var = this.D0;
            if (cv0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.F0) {
                    org.telegram.ui.cv0 cv0Var2 = this.e1;
                    if (!cv0Var2.n) {
                        cv0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.e1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.F0) {
                        this.F0 = true;
                        if (rh0Var != null) {
                            rh0Var.a();
                        }
                    }
                    return true;
                }
            }
            PointF pointF = this.u0;
            if (action == 0) {
                this.x0 = true;
                this.y0 = true;
                this.E0 = true;
                pointF.set(motionEvent.getX(), motionEvent.getY());
                if (vh0Var.c.size() > 1 && rh0Var != null) {
                    rh0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.F0 = false;
            } else if (action == 1) {
                if (!this.F0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i10 = vh0Var.j();
                            int i11 = currentItem + 1;
                            if (i11 < realCount + i10) {
                                i10 = i11;
                            }
                        } else {
                            int i12 = (-1) + currentItem;
                            i10 = i12 < vh0Var.j() ? (realCount + r0) - 1 : i12;
                        }
                        if (rh0Var != null) {
                            rh0Var.a();
                        }
                        x(i10, false);
                    }
                }
            } else if (action == 2) {
                float x10 = motionEvent.getX() - pointF.x;
                float y10 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y10);
                float f10 = this.v0;
                boolean z4 = abs >= f10 || Math.abs(x10) >= f10;
                if (z4) {
                    this.F0 = true;
                    if (rh0Var != null) {
                        rh0Var.a();
                    }
                }
                boolean z10 = this.y0;
                if (z10 && this.x0) {
                    if (z4) {
                        if (Math.abs(y10) > Math.abs(x10)) {
                            this.y0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.x0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            rl0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z10) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.x0 ? rl0Var.onTouchEvent(motionEvent) : false;
            if (this.y0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (action == 1 || action == 3) {
                this.x0 = false;
                this.y0 = false;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        nh0 nh0Var = this.m1;
        if (nh0Var != null) {
            nh0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(y5 y5Var) {
        vh0 vh0Var;
        if (y5Var == null || (vh0Var = this.A0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof p9) && vh0Var.k(vh0Var.d.indexOf(childAt)) == 0) {
                p9 p9Var = (p9) childAt;
                y5 animation = p9Var.getImageReceiver().getAnimation();
                if (animation != y5Var) {
                    if (animation != null) {
                        animation.w(p9Var);
                    }
                    p9Var.setImageDrawable(y5Var);
                    y5Var.f(this);
                    y5Var.O = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.C0 = chatFull;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.C0 == null) {
            return;
        }
        ArrayList arrayList2 = this.U0;
        if (arrayList2.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.C0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.C0.chat_photo);
        boolean isEmpty = this.C0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.Q0;
        ArrayList arrayList4 = this.T0;
        if (isEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.C0.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.C0.chat_photo));
            arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            rh0 rh0Var = this.D0;
            if (rh0Var != null) {
                rh0Var.c();
            }
        }
        this.Y0.set(0, null);
        this.A0.g();
    }

    public void setCreateThumbFromParent(boolean z4) {
        this.b1 = z4;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z4) {
        this.f1 = z4;
    }

    public void setImagesLayerNum(int i10) {
        this.i1 = i10;
    }

    public void setInvalidateWithParent(boolean z4) {
        this.d1 = z4;
    }

    public void setParentAvatarImage(p9 p9Var) {
        vh0 vh0Var = this.A0;
        if (vh0Var != null) {
            vh0Var.g = p9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.cv0 cv0Var) {
        this.e1 = cv0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        nh0 nh0Var = this.m1;
        if (nh0Var != null) {
            nh0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public wh0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, rl0 rl0Var, org.telegram.ui.a01 a01Var, rh0 rh0Var, nh0 nh0Var) {
        super(context);
        this.u0 = new PointF();
        this.x0 = true;
        this.y0 = true;
        int i10 = UserConfig.selectedAccount;
        this.I0 = i10;
        this.J0 = new Path();
        this.K0 = new RectF();
        this.L0 = new float[8];
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.a1 = new SparseArray();
        this.b1 = true;
        this.g1 = -1;
        this.h1 = -1;
        this.m1 = nh0Var;
        setPadding(0, 0, 0, nh0Var == null ? 0 : nh0Var.n);
        if (nh0Var != null) {
            nh0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.G0 = true;
        this.B0 = j10;
        this.z0 = rl0Var;
        this.w0 = kVar;
        vh0 vh0Var = new vh0(this, getContext(), a01Var);
        this.A0 = vh0Var;
        setAdapter((sp) vh0Var);
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.D0 = rh0Var;
        b(new ph0((org.telegram.ui.dz0) this));
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i10).getDialogPhotos(j10);
        this.P0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
