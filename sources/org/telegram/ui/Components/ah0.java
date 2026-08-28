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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ah0 extends mp implements NotificationCenter.NotificationCenterDelegate {
    public long A0;
    public TLRPC.ChatFull B0;
    public final vg0 C0;
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
    public u51 N0;
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
    public org.telegram.ui.nu0 d1;
    public boolean e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public int j1;
    public int k1;
    public rg0 l1;
    public ImageLocation m1;
    public ImageLocation n1;
    public final PointF t0;
    public final int u0;
    public final org.telegram.ui.ActionBar.k v0;
    public boolean w0;
    public boolean x0;
    public final wk0 y0;
    public final zg0 z0;

    public ah0(Context context, org.telegram.ui.ActionBar.k kVar, wk0 wk0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.t0 = new PointF();
        this.w0 = true;
        this.x0 = true;
        int i9 = UserConfig.selectedAccount;
        this.H0 = i9;
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
        this.y0 = wk0Var;
        ConnectionsManager.generateClassGuid();
        this.v0 = kVar;
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = q4Var;
        b(new sg0(this));
        zg0 zg0Var = new zg0(this, getContext(), null);
        this.z0 = zg0Var;
        setAdapter((lp) zg0Var);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosUpdate);
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

    public final void B(float f10, int i9) {
        int i10 = this.f1;
        float f11 = 0.0f;
        if (i10 >= 0 || this.g1 >= 0) {
            if (i10 < 0) {
                i10 = this.g1;
            }
            int k10 = this.z0.k(i9);
            if (this.e1) {
                k10--;
            }
            float f12 = k10 == i10 ? 1.0f - f10 : (getRealCount() <= 0 || (k10 + (-1)) % getRealCount() != i10) ? (getRealCount() <= 0 || (k10 + 1) % getRealCount() != i10) ? 0.0f : (1.0f - f10) + 1.0f : (1.0f - f10) - 1.0f;
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
        int i9 = 0;
        while (i9 < 2) {
            ArrayList arrayList = i9 == 0 ? this.U0 : this.T0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i10);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i11 = imageLocation3.dc_id;
                    if (i11 == imageLocation.dc_id) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.S0.get(i10);
                        }
                    }
                    if (i11 == imageLocation2.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.S0.get(i10);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i9++;
        }
        return null;
    }

    public final ImageLocation D(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i9 >= arrayList.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.S0.get(i9);
        return imageLocation != null ? imageLocation : (ImageLocation) arrayList.get(i9);
    }

    public final View E(int i9) {
        zg0 zg0Var = this.z0;
        if (zg0Var == null) {
            return null;
        }
        ArrayList arrayList = zg0Var.c;
        if (arrayList.size() <= i9 || i9 < 0) {
            return null;
        }
        wg0 wg0Var = (wg0) arrayList.get(i9);
        xg0 xg0Var = wg0Var.b;
        return xg0Var == null ? wg0Var.c : xg0Var;
    }

    public final TLRPC.Photo F(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.R0;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i9);
    }

    public final ImageLocation G(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return (ImageLocation) arrayList.get(i9);
    }

    public final boolean H(u51 u51Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z10) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation != null && imageLocation2 != null && this.Y0 == 0) {
            ImageLocation imageLocation3 = this.L0;
            ArrayList arrayList = this.T0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                zg0 zg0Var = this.z0;
                if (!isEmpty) {
                    this.L0 = imageLocation;
                    if (z10 && (dialogPhotos2 = this.O0) != null) {
                        dialogPhotos2.reset();
                        this.O0.loadAfter(getCurrentItem() - (zg0Var != null ? zg0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z10 && (dialogPhotos = this.O0) != null) {
                    dialogPhotos.reset();
                    this.O0.loadAfter(getCurrentItem() - (zg0Var != null ? zg0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.L0 = imageLocation;
                this.M0 = imageLocation2;
                this.N0 = u51Var;
                this.Q0.add(null);
                this.P0.add(null);
                arrayList.add(imageLocation);
                this.U0.add(imageLocation2);
                this.V0.add(u51Var);
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
        o9 currentItemView;
        if (this.S0.get(this.e1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        x5 animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.s();
    }

    public final void K() {
        this.l1 = null;
        int i9 = this.H0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i9);
        int i10 = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i10);
        NotificationCenter.getInstance(i9).removeObserver(this, i10);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof o9) {
                o9 o9Var = (o9) childAt;
                if (o9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = o9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof x5) {
                        ((x5) drawable).w(o9Var);
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

    public final void N(int i9, int i10) {
        this.i1 = i9;
        this.j1 = i10;
        zg0 zg0Var = this.z0;
        if (zg0Var != null) {
            for (int i11 = 0; i11 < zg0Var.c.size(); i11++) {
                if (((wg0) zg0Var.c.get(i11)).c != null) {
                    ug0 ug0Var = ((wg0) zg0Var.c.get(i11)).c;
                    int i12 = this.i1;
                    int i13 = this.j1;
                    ug0Var.r(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f10) {
        if (imageLocation == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.T0;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) == imageLocation) {
                this.X0.set(i9, Float.valueOf(f10));
                SparseArray sparseArray = this.Z0;
                if (sparseArray.get(i9) != null) {
                    ((RadialProgress2) sparseArray.get(i9)).o(f10, true);
                }
            } else {
                i9++;
            }
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        TLRPC.User user;
        ArrayList arrayList;
        ImageLocation imageLocation;
        int i11;
        boolean z10;
        ah0 ah0Var;
        boolean z11;
        int i12;
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
        ah0 ah0Var2 = this;
        Integer num3 = -1;
        int i13 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = ah0Var2.Q0;
        ArrayList arrayList6 = ah0Var2.P0;
        if (i9 != i13) {
            int i14 = NotificationCenter.fileLoaded;
            SparseArray sparseArray = ah0Var2.Z0;
            if (i9 == i14) {
                String str = (String) objArr[0];
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    String str2 = (String) arrayList6.get(i15);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i15);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i15);
                        if (radialProgress2 != null) {
                            radialProgress2.o(1.0f, true);
                        }
                        ah0Var2.invalidate();
                    }
                }
                return;
            }
            if (i9 != NotificationCenter.fileLoadProgressChanged) {
                if (i9 == NotificationCenter.reloadDialogPhotos && ah0Var2.Y0 == 0 && (dialogPhotos = ah0Var2.O0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos2 = ah0Var2.O0;
                    int currentItem = ah0Var2.getCurrentItem();
                    zg0 zg0Var = ah0Var2.z0;
                    dialogPhotos2.loadAfter(currentItem - (zg0Var != null ? zg0Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                String str4 = (String) arrayList6.get(i16);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i16);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i16);
                    if (radialProgress22 != null) {
                        radialProgress22.o(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
                    }
                    ah0Var2.invalidate();
                }
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos3 = (MessagesController.DialogPhotos) objArr[0];
        if (ah0Var2.O0 == dialogPhotos3) {
            ArrayList arrayList7 = new ArrayList(dialogPhotos3.photos);
            if (!arrayList7.isEmpty() || !dialogPhotos3.fromCache) {
                ah0Var2.f1 = -1;
                ah0Var2.g1 = -1;
                int i17 = ah0Var2.H0;
                TLRPC.User user4 = MessagesController.getInstance(i17).getUser(Long.valueOf(ah0Var2.A0));
                TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(ah0Var2.A0);
                if (userFull != null && (photo = userFull.personal_photo) != null) {
                    arrayList7.add(0, photo);
                    ah0Var2.f1 = 0;
                }
                if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                    arrayList7.add(userFull.fallback_photo);
                    ah0Var2.g1 = arrayList7.size() - 1;
                }
                arrayList5.clear();
                arrayList6.clear();
                ArrayList arrayList8 = ah0Var2.T0;
                arrayList8.clear();
                ArrayList arrayList9 = ah0Var2.S0;
                arrayList9.clear();
                ArrayList arrayList10 = ah0Var2.U0;
                arrayList10.clear();
                ArrayList arrayList11 = ah0Var2.V0;
                arrayList11.clear();
                ArrayList arrayList12 = ah0Var2.R0;
                arrayList12.clear();
                ArrayList arrayList13 = ah0Var2.W0;
                arrayList13.clear();
                ArrayList arrayList14 = ah0Var2.X0;
                arrayList14.clear();
                if (DialogObject.isChatDialog(ah0Var2.A0)) {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-ah0Var2.A0));
                    imageLocation = ImageLocation.getForUserOrChat(i17, chat, 0);
                    arrayList = arrayList8;
                    if (imageLocation != null) {
                        arrayList.add(imageLocation);
                        user = user4;
                        arrayList10.add(ImageLocation.getForUserOrChat(i17, chat, 1));
                        arrayList11.add(null);
                        arrayList5.add(null);
                        TLRPC.ChatFull chatFull = ah0Var2.B0;
                        if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                            z13 = false;
                            arrayList12.add(null);
                            arrayList6.add(null);
                            arrayList9.add(null);
                        } else {
                            arrayList12.add(ah0Var2.B0.chat_photo);
                            if (ah0Var2.B0.chat_photo.video_sizes.isEmpty()) {
                                z13 = false;
                                arrayList9.add(null);
                                arrayList6.add(null);
                            } else {
                                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(ah0Var2.B0.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, ah0Var2.B0.chat_photo));
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
                int i18 = 0;
                while (true) {
                    int size = arrayList7.size();
                    i11 = i17;
                    z10 = ah0Var2.F0;
                    if (i18 >= size) {
                        break;
                    }
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i18);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList3 = photo2.sizes) == null) {
                        i12 = i18;
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
                        i12 = i18;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 50);
                        int size2 = photo2.sizes.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size2) {
                                photoSize = closestPhotoSizeWithSize;
                                break;
                            }
                            int i20 = size2;
                            TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i19);
                            int i21 = i19;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                photoSize = photoSize2;
                                break;
                            } else {
                                i19 = i21 + 1;
                                size2 = i20;
                            }
                        }
                        if (imageLocation != null) {
                            int size3 = photo2.sizes.size();
                            arrayList2 = arrayList7;
                            int i22 = 0;
                            while (i22 < size3) {
                                int i23 = size3;
                                TLRPC.FileLocation fileLocation = photo2.sizes.get(i22).location;
                                int i24 = i22;
                                if (fileLocation != null) {
                                    int i25 = fileLocation.local_id;
                                    arrayList4 = arrayList14;
                                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                    imageLocation2 = imageLocation;
                                    if (i25 == tL_fileLocationToBeDeprecated.local_id) {
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
                                            i22 = i24 + 1;
                                            size3 = i23;
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
                                i22 = i24 + 1;
                                size3 = i23;
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
                            int i26 = photo2.dc_id;
                            if (i26 != 0) {
                                TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                                fileLocation2.dc_id = i26;
                                fileLocation2.file_reference = photo2.file_reference;
                            }
                            ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                            if (forPhoto != null) {
                                ImageLocation imageLocation3 = ah0Var2.L0;
                                num = num2;
                                if (imageLocation3 == null) {
                                    arrayList14 = arrayList4;
                                    user2 = user;
                                } else if (imageLocation3.photoId != forPhoto.photoId || z10 || ah0Var2.A0 == UserConfig.getInstance(i11).getClientUserId()) {
                                    user2 = user;
                                    arrayList14 = arrayList4;
                                } else {
                                    arrayList5.add(null);
                                    arrayList.add(ah0Var2.L0);
                                    ImageLocation imageLocation4 = ah0Var2.M0;
                                    if (imageLocation4 == null) {
                                        imageLocation4 = ImageLocation.getForPhoto(photoSize, photo2);
                                    }
                                    arrayList10.add(imageLocation4);
                                    if (photo2.video_sizes.isEmpty()) {
                                        user3 = user;
                                        obj = null;
                                        arrayList11.add(ah0Var2.N0);
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize != null) {
                                            user3 = user;
                                            arrayList11.add(new u51(vectorMarkupVideoSize, user != null && user3.premium, 2));
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
                                        arrayList11.add(new u51(vectorMarkupVideoSize2, user2 != null && user2.premium, 2));
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
                    i18 = i12 + 1;
                    ah0Var2 = this;
                    num3 = num;
                    i17 = i11;
                    arrayList7 = arrayList2;
                    imageLocation = imageLocation2;
                }
                int size4 = arrayList10.size();
                if (size4 > 1) {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= (size4 > 2 ? 2 : 1)) {
                            break;
                        }
                        FileLoader.getInstance(i11).loadFile((ImageLocation) arrayList10.get(i27 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                        i27++;
                    }
                }
                getAdapter().g();
                if (z10) {
                    ah0Var = this;
                    if (!ah0Var.D0 || ah0Var.b1) {
                        ah0Var.L();
                    }
                } else {
                    ah0Var = this;
                    if (!ah0Var.D0 || ah0Var.b1) {
                        ah0Var.L();
                        ah0Var.getAdapter().g();
                        ah0Var.B(0.0f, ah0Var.getRealPosition());
                    }
                }
                if (ah0Var.g1 >= 0 || ah0Var.f1 >= 0) {
                    z11 = false;
                } else {
                    z11 = false;
                    ah0Var.B(0.0f, 0);
                }
                ah0Var.b1 = z11;
                vg0 vg0Var = ah0Var.C0;
                if (vg0Var != null) {
                    vg0Var.c();
                }
                ImageLocation imageLocation5 = ah0Var.m1;
                if (imageLocation5 != null) {
                    ah0Var.A(imageLocation5, ah0Var.n1);
                }
            }
        }
    }

    public rg0 getBlurDrawer() {
        return this.l1;
    }

    public float getCurrentItemProgress() {
        x5 animation;
        o9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public o9 getCurrentItemView() {
        zg0 zg0Var = this.z0;
        if (zg0Var == null || zg0Var.c.isEmpty()) {
            return null;
        }
        return ((wg0) zg0Var.c.get(getCurrentItem())).c;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setTranslationY(getHeight() - this.l1.getMeasuredHeight());
        }
    }

    @Override // m2.g, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.C = true;
            rg0Var.postInvalidateOnAnimation();
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
        int i9;
        zg0 zg0Var = this.z0;
        if (zg0Var != null) {
            wk0 wk0Var = this.y0;
            if (wk0Var.getScrollState() != 0 && !this.w0 && this.x0) {
                this.x0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.nu0 nu0Var = this.d1;
            vg0 vg0Var = this.C0;
            if (nu0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.E0) {
                    org.telegram.ui.nu0 nu0Var2 = this.d1;
                    if (!nu0Var2.n) {
                        nu0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.d1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.E0) {
                        this.E0 = true;
                        if (vg0Var != null) {
                            vg0Var.a();
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
                if (zg0Var.c.size() > 1 && vg0Var != null) {
                    vg0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.E0 = false;
            } else if (action == 1) {
                if (!this.E0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i9 = zg0Var.j();
                            int i10 = currentItem + 1;
                            if (i10 < realCount + i9) {
                                i9 = i10;
                            }
                        } else {
                            int i11 = (-1) + currentItem;
                            i9 = i11 < zg0Var.j() ? (realCount + r0) - 1 : i11;
                        }
                        if (vg0Var != null) {
                            vg0Var.a();
                        }
                        x(i9, false);
                    }
                }
            } else if (action == 2) {
                float x10 = motionEvent.getX() - pointF.x;
                float y10 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y10);
                float f10 = this.u0;
                boolean z10 = abs >= f10 || Math.abs(x10) >= f10;
                if (z10) {
                    this.E0 = true;
                    if (vg0Var != null) {
                        vg0Var.a();
                    }
                }
                boolean z11 = this.x0;
                if (z11 && this.w0) {
                    if (z10) {
                        if (Math.abs(y10) > Math.abs(x10)) {
                            this.x0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.w0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            wk0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z11) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.w0 ? wk0Var.onTouchEvent(motionEvent) : false;
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(x5 x5Var) {
        zg0 zg0Var;
        if (x5Var == null || (zg0Var = this.z0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof o9) && zg0Var.k(zg0Var.d.indexOf(childAt)) == 0) {
                o9 o9Var = (o9) childAt;
                x5 animation = o9Var.getImageReceiver().getAnimation();
                if (animation != x5Var) {
                    if (animation != null) {
                        animation.w(o9Var);
                    }
                    o9Var.setImageDrawable(x5Var);
                    x5Var.f(this);
                    x5Var.N = true;
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
            vg0 vg0Var = this.C0;
            if (vg0Var != null) {
                vg0Var.c();
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

    public void setImagesLayerNum(int i9) {
        this.h1 = i9;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.c1 = z10;
    }

    public void setParentAvatarImage(o9 o9Var) {
        zg0 zg0Var = this.z0;
        if (zg0Var != null) {
            zg0Var.g = o9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.nu0 nu0Var) {
        this.d1 = nu0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setVisibility(i9);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public ah0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, wk0 wk0Var, org.telegram.ui.iz0 iz0Var, vg0 vg0Var, rg0 rg0Var) {
        super(context);
        this.t0 = new PointF();
        this.w0 = true;
        this.x0 = true;
        int i9 = UserConfig.selectedAccount;
        this.H0 = i9;
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
        this.l1 = rg0Var;
        setPadding(0, 0, 0, rg0Var == null ? 0 : rg0Var.n);
        if (rg0Var != null) {
            rg0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.F0 = true;
        this.A0 = j10;
        this.y0 = wk0Var;
        this.v0 = kVar;
        zg0 zg0Var = new zg0(this, getContext(), iz0Var);
        this.z0 = zg0Var;
        setAdapter((lp) zg0Var);
        this.u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = vg0Var;
        b(new tg0((org.telegram.ui.my0) this));
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i9).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
