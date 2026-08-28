package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.kp0 {
    public String A;
    public boolean B;
    public boolean D;
    public final boolean E;
    public TLRPC.User H;
    public TLRPC.InputFile I;
    public TLRPC.InputFile J;
    public TLRPC.VideoSize K;
    public double L;
    public final boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public final int R;
    public float S;
    public org.telegram.ui.ActionBar.o2 a;
    public d40 b;
    public ki c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String v;
    public String w;
    public String x;
    public MessageObject y;
    public final int d = UserConfig.selectedAccount;
    public boolean C = true;
    public boolean F = true;
    public boolean G = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public e40(int i9, boolean z10, boolean z11) {
        this.M = z10;
        this.E = z11;
        this.R = i9;
    }

    public static void a(e40 e40Var, ArrayList arrayList, Runnable runnable, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int intValue = ((Integer) arrayList.get(i9)).intValue();
        if (intValue == 0) {
            e40Var.m();
            return;
        }
        if (intValue == 1) {
            e40Var.n();
            return;
        }
        if (intValue == 2) {
            e40Var.r();
            return;
        }
        if (intValue == 3) {
            runnable.run();
            return;
        }
        if (intValue != 4 || (o2Var = e40Var.a) == null || o2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && e40Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                e40Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            if (generateVideoPath != null) {
                if (i10 >= 24) {
                    intent.putExtra("output", FileProvider.d(e40Var.a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(generateVideoPath));
                }
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("android.intent.extra.durationLimit", 10);
                e40Var.f = generateVideoPath.getAbsolutePath();
            }
            e40Var.a.startActivityForResult(intent, 15);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void b(e40 e40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = e40Var.e;
        int i9 = e40Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
        Bitmap bitmap = null;
        if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject.videoEditedInfo = sendingMediaInfo.videoEditedInfo;
            messageObject.emojiMarkup = sendingMediaInfo.emojiMarkup;
            bitmap = ImageLoader.loadBitmap(sendingMediaInfo.thumbPath, null, 800.0f, 800.0f, true);
        } else {
            String str = sendingMediaInfo.path;
            if (str != null) {
                loadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
            } else {
                MediaController.SearchImage searchImage = sendingMediaInfo.searchImage;
                if (searchImage != null) {
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                        if (closestPhotoSizeWithSize != null) {
                            File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, true);
                            e40Var.A = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.fileLoadFailed);
                                e40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                            }
                        }
                        loadBitmap = null;
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        e40Var.A = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            e40Var.v = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.httpFileDidFailedLoad);
                            imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                        } else {
                            loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                messageObject = null;
            }
            messageObject = null;
            bitmap = loadBitmap;
        }
        e40Var.s(z10, bitmap, messageObject);
    }

    public final void c() {
        this.P = true;
        String str = this.v;
        int i9 = this.d;
        if (str != null) {
            FileLoader.getInstance(i9).cancelFileUpload(this.v, false);
        }
        if (this.w != null) {
            FileLoader.getInstance(i9).cancelFileUpload(this.w, false);
        }
        d40 d40Var = this.b;
        if (d40Var != null) {
            d40Var.O();
        }
    }

    public final void d() {
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.B) {
            this.e.setImageBitmap((Drawable) null);
            this.a = null;
            this.b = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        d40 d40Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i11 = NotificationCenter.fileUploaded;
        int i12 = this.d;
        if (i9 == i11 || i9 == NotificationCenter.fileUploadFailed) {
            String str = (String) objArr[0];
            if (str.equals(this.v)) {
                this.v = null;
                if (i9 == i11) {
                    this.I = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.w)) {
                    return;
                }
                this.w = null;
                if (i9 == i11) {
                    this.J = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.v == null && this.w == null && this.y == null) {
                NotificationCenter.getInstance(i12).removeObserver(this, i11);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i9 == i11 && (d40Var = this.b) != null) {
                    d40Var.P(this.I, this.J, this.L, this.x, this.h, this.n, this.s, this.K);
                }
                d();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            String str3 = this.y != null ? this.w : this.v;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            d40 d40Var2 = this.b;
            this.S = min;
            d40Var2.D(min);
            return;
        }
        int i13 = NotificationCenter.fileLoaded;
        if (i9 == i13 || i9 == NotificationCenter.fileLoadFailed || i9 == NotificationCenter.httpFileDidLoad || i9 == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.S = 1.0f;
            if (str4.equals(this.v)) {
                NotificationCenter.getInstance(i12).removeObserver(this, i13);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                int i14 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i14);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i9 == i13 || i9 == i14) {
                    s(false, ImageLoader.loadBitmap(this.A, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.setImageBitmap((Drawable) null);
                d40 d40Var3 = this.b;
                if (d40Var3 != null) {
                    d40Var3.O();
                    return;
                }
                return;
            }
            return;
        }
        int i15 = NotificationCenter.filePreparingFailed;
        if (i9 == i15) {
            if (((MessageObject) objArr[0]) != this.y || this.a == null) {
                return;
            }
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i12).removeObserver(this, i15);
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            d();
            return;
        }
        if (i9 != NotificationCenter.fileNewChunkAvailable) {
            if (i9 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.y && (o2Var = this.a) != null) {
                this.w = (String) objArr[1];
                o2Var.getFileLoader().uploadFile(this.w, false, false, (int) this.y.videoEditedInfo.estimatedSize, 33554432, false);
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]) != this.y || this.a == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long longValue = ((Long) objArr[2]).longValue();
        long longValue2 = ((Long) objArr[3]).longValue();
        this.a.getFileLoader().checkUploadNewDataAvailable(str5, false, longValue, longValue2);
        if (longValue2 != 0) {
            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
            if (this.L > longValue3) {
                this.L = longValue3;
            }
            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str5, (long) (this.L * 1000.0d), null, true);
            if (createVideoThumbnailAtTime != null) {
                File pathToAttach = FileLoader.getInstance(i12).getPathToAttach(this.n, true);
                if (pathToAttach != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach);
                    }
                    pathToAttach.delete();
                }
                File pathToAttach2 = FileLoader.getInstance(i12).getPathToAttach(this.h, true);
                if (pathToAttach2 != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach2);
                    }
                    pathToAttach2.delete();
                }
                this.h = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 800.0f, 800.0f, 80, false, 320, 320);
                TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 150.0f, 150.0f, 80, false, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                this.n = scaleAndSaveImage;
                if (scaleAndSaveImage != null) {
                    try {
                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(BitmapFactory.decodeFile(FileLoader.getInstance(i12).getPathToAttach(this.n, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            this.x = str5;
            this.w = str5;
            this.y = null;
        }
    }

    public final void e() {
        this.P = false;
        if (this.v == null && this.w == null && this.y == null) {
            this.a = null;
            this.b = null;
        } else {
            this.B = true;
        }
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.dismissInternal();
            this.c.v1();
        }
    }

    public final void f() {
        ct ctVar;
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        if (this.c == null) {
            ki kiVar = new ki(this.a.getParentActivity(), this.a, this.N, this.O);
            this.c = kiVar;
            int i9 = this.M ? 2 : 1;
            d40 d40Var = this.b;
            if (d40Var == null || !d40Var.u()) {
                ctVar = null;
            } else {
                d40 d40Var2 = this.b;
                Objects.requireNonNull(d40Var2);
                ctVar = new ct(d40Var2, 1);
            }
            kiVar.M0 = i9;
            kiVar.N0 = ctVar;
            kiVar.O0 = false;
            ci ciVar = kiVar.u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
            if (ciVar == null || ciVar == chatAttachAlertPhotoLayout) {
                kiVar.t1.setVisibility(8);
            }
            int i10 = kiVar.M0;
            TextView textView = kiVar.f1;
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                textView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
            if (chatAttachAlertPhotoLayout != null) {
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.c1 = (kiVar2.M0 == 0 || kiVar2.B) ? false : true;
            }
            ki kiVar3 = this.c;
            kiVar3.V1 = new z30(this);
            kiVar3.Q = this;
        }
        int i11 = this.Q;
        if (i11 == 1) {
            this.c.f1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name));
        } else if (i11 == 2) {
            this.c.f1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name));
        }
    }

    public final boolean g(Dialog dialog) {
        ki kiVar = this.c;
        if (kiVar == null || dialog != kiVar) {
            return false;
        }
        kiVar.f0.Z(false);
        this.c.dismissInternal();
        this.c.f0.c0(true);
        return true;
    }

    public final boolean h() {
        return (this.v == null && this.w == null && this.y == null) ? false : true;
    }

    public final void i(int i9, int i10, Intent intent) {
        if (i10 == -1) {
            if (i9 == 0 || i9 == 2) {
                f();
                ki kiVar = this.c;
                if (kiVar != null) {
                    kiVar.f0.f0(i9, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i9 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.t1().K2(null, this.a, null);
                p(this.f, null, AndroidUtilities.getImageOrientation(this.f), false);
                AndroidUtilities.addMediaToGallery(this.f);
                this.f = null;
                return;
            }
            if (i9 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new zq(18, this, intent.getData()));
                return;
            }
            if (i9 == 15) {
                q(this.f, null, true);
                AndroidUtilities.addMediaToGallery(this.f);
                this.f = null;
            }
        }
    }

    public final void j() {
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.x1();
        }
    }

    public final void k(int i9, String[] strArr, int[] iArr) {
        ki kiVar = this.c;
        if (kiVar != null) {
            if (i9 == 17) {
                kiVar.f0.T(false);
                this.c.f0.X();
            } else if (i9 == 4) {
                kiVar.f0.X();
            }
        }
    }

    public final void l() {
        ki kiVar = this.c;
        if (kiVar != null) {
            kiVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File generatePicturePath = AndroidUtilities.generatePicturePath();
            if (generatePicturePath != null) {
                if (i9 >= 24) {
                    intent.putExtra("output", FileProvider.d(this.a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(generatePicturePath));
                }
                this.f = generatePicturePath.getAbsolutePath();
            }
            this.a.startActivityForResult(intent, 13);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 33 || parentActivity == null) {
            if (i9 >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
            return;
        }
        org.telegram.ui.ip0 ip0Var = new org.telegram.ui.ip0(this.M ? 3 : 1, false, false, null);
        ip0Var.x = this.F;
        ip0Var.R = new a40(this);
        this.a.presentFragment(ip0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        this.P = false;
        this.Q = i9;
        if (this.C) {
            org.telegram.ui.ActionBar.o2 o2Var2 = this.a;
            if (o2Var2 == null || o2Var2.getParentActivity() == null) {
                return;
            }
            f();
            ki kiVar = this.c;
            kiVar.Q1 = this.D;
            kiVar.J1(1, false);
            this.c.f0.e0();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.a.getFragmentView().findFocus());
            }
            this.c.r1();
            this.c.setOnHideListener(onDismissListener);
            int i11 = this.Q;
            if (i11 != 0) {
                this.c.M = new c40(i11, this.H);
            }
            ki kiVar2 = this.c;
            kiVar2.getClass();
            this.a.showDialog(kiVar2);
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.a.getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        if (i9 == 1) {
            f3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name);
            f3Var.bigTitle = true;
        } else if (i9 == 2) {
            f3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name);
            f3Var.bigTitle = true;
        } else {
            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
            f3Var.bigTitle = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        org.telegram.ui.Cells.j2.j(R.drawable.msg_camera, 0, arrayList2, arrayList3);
        if (this.M) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            org.telegram.ui.Cells.j2.j(R.drawable.msg_video, 4, arrayList2, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        org.telegram.ui.Cells.j2.j(R.drawable.msg_photos, 1, arrayList2, arrayList3);
        if (this.F) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            org.telegram.ui.Cells.j2.j(R.drawable.msg_search, 2, arrayList2, arrayList3);
        }
        if (z10) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            org.telegram.ui.Cells.j2.j(R.drawable.msg_delete, 3, arrayList2, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.x30
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                e40.a(e40.this, arrayList3, runnable, i13);
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(onDismissListener);
        this.a.showDialog(f3Var);
        if (z10) {
            f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new b40(this, arrayList), null);
        PhotoViewer.t1().L = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, null, hashMap, arrayList, 1, false, null, this.N);
        zp0Var.o0 = new y30(this, hashMap, arrayList);
        zp0Var.e0(1, false);
        zp0Var.l0 = this.b.getInitialSearchString();
        if (this.O) {
            this.a.showAsSheet(zp0Var);
        } else {
            this.a.presentFragment(zp0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        if (bitmap == null) {
            return;
        }
        this.J = null;
        this.I = null;
        this.y = null;
        this.x = null;
        this.K = messageObject == null ? null : messageObject.emojiMarkup;
        this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
        TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        this.n = scaleAndSaveImage;
        int i9 = this.d;
        if (scaleAndSaveImage != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i9).getPathToAttach(this.n, true).getAbsolutePath());
                this.r = decodeFile;
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            UserConfig.getInstance(i9).saveConfig(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileLoader.getDirectory(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.v = aa.d.l(this.h.location.local_id, ".jpg", sb2);
            if (this.G) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    d40 d40Var = this.b;
                    if (d40Var != null) {
                        d40Var.J(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.E && !MessagesController.getInstance(i9).uploadMarkupVideo) {
                        d40 d40Var2 = this.b;
                        if (d40Var2 != null) {
                            d40Var2.J(z10, true);
                        }
                        d40 d40Var3 = this.b;
                        if (d40Var3 != null) {
                            d40Var3.P(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.P(null, null, this.L, this.x, this.h, this.n, this.s, this.K);
                            d();
                            return;
                        }
                        return;
                    }
                    this.y = messageObject;
                    VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                    long j10 = videoEditedInfo.startTime;
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    this.L = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                    videoEditedInfo.shouldLimitFps = false;
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.v = null;
                    d40 d40Var4 = this.b;
                    if (d40Var4 != null) {
                        d40Var4.J(z10, true);
                    }
                    this.s = true;
                }
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadFailed);
                if (this.v != null) {
                    FileLoader.getInstance(i9).uploadFile(this.v, false, true, 16777216);
                }
            }
            d40 d40Var5 = this.b;
            if (d40Var5 != null) {
                d40Var5.P(null, null, 0.0d, null, this.h, this.n, this.s, null);
            }
        }
    }

    public final void t(MediaController.PhotoEntry photoEntry) {
        Bitmap loadBitmap;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        MessageObject messageObject = null;
        if ((photoEntry.isVideo || photoEntry.editedInfo != null) && !photoEntry.isLivePhoto()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject2.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject2.videoEditedInfo = photoEntry.editedInfo;
            messageObject2.emojiMarkup = photoEntry.emojiMarkup;
            loadBitmap = ImageLoader.loadBitmap(photoEntry.thumbPath, null, 800.0f, 800.0f, true);
            messageObject = messageObject2;
        } else {
            loadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
        }
        s(false, loadBitmap, messageObject);
    }
}
