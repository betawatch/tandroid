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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.lp0 {
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
    public org.telegram.ui.ActionBar.n2 a;
    public i40 b;
    public gi c;
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

    public j40(int i10, boolean z10, boolean z11) {
        this.M = z10;
        this.E = z11;
        this.R = i10;
    }

    public static void a(j40 j40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue == 0) {
            j40Var.m();
            return;
        }
        if (intValue == 1) {
            j40Var.n();
            return;
        }
        if (intValue == 2) {
            j40Var.r();
            return;
        }
        if (intValue == 3) {
            runnable.run();
            return;
        }
        if (intValue != 4 || (n2Var = j40Var.a) == null || n2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && j40Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                j40Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            if (generateVideoPath != null) {
                if (i11 >= 24) {
                    intent.putExtra("output", FileProvider.d(j40Var.a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(generateVideoPath));
                }
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("android.intent.extra.durationLimit", 10);
                j40Var.f = generateVideoPath.getAbsolutePath();
            }
            j40Var.a.startActivityForResult(intent, 15);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void b(j40 j40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = j40Var.e;
        int i10 = j40Var.d;
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
                            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                            j40Var.A = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.fileLoadFailed);
                                j40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                            }
                        }
                        loadBitmap = null;
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        j40Var.A = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            j40Var.v = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.httpFileDidFailedLoad);
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
        j40Var.s(z10, bitmap, messageObject);
    }

    public final void c() {
        this.P = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.w, false);
        }
        i40 i40Var = this.b;
        if (i40Var != null) {
            i40Var.P();
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i40 i40Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 == i12 || i10 == NotificationCenter.fileUploadFailed) {
            String str = (String) objArr[0];
            if (str.equals(this.v)) {
                this.v = null;
                if (i10 == i12) {
                    this.I = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.w)) {
                    return;
                }
                this.w = null;
                if (i10 == i12) {
                    this.J = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.v == null && this.w == null && this.y == null) {
                NotificationCenter.getInstance(i13).removeObserver(this, i12);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i10 == i12 && (i40Var = this.b) != null) {
                    i40Var.Q(this.I, this.J, this.L, this.x, this.h, this.n, this.s, this.K);
                }
                d();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            String str3 = this.y != null ? this.w : this.v;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            i40 i40Var2 = this.b;
            this.S = min;
            i40Var2.E(min);
            return;
        }
        int i14 = NotificationCenter.fileLoaded;
        if (i10 == i14 || i10 == NotificationCenter.fileLoadFailed || i10 == NotificationCenter.httpFileDidLoad || i10 == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.S = 1.0f;
            if (str4.equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i15 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i15);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 == i14 || i10 == i15) {
                    s(false, ImageLoader.loadBitmap(this.A, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.setImageBitmap((Drawable) null);
                i40 i40Var3 = this.b;
                if (i40Var3 != null) {
                    i40Var3.P();
                    return;
                }
                return;
            }
            return;
        }
        int i16 = NotificationCenter.filePreparingFailed;
        if (i10 == i16) {
            if (((MessageObject) objArr[0]) != this.y || this.a == null) {
                return;
            }
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i13).removeObserver(this, i16);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            d();
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.y && (n2Var = this.a) != null) {
                this.w = (String) objArr[1];
                n2Var.getFileLoader().uploadFile(this.w, false, false, (int) this.y.videoEditedInfo.estimatedSize, 33554432, false);
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
                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.n, true);
                if (pathToAttach != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete file " + pathToAttach);
                    }
                    pathToAttach.delete();
                }
                File pathToAttach2 = FileLoader.getInstance(i13).getPathToAttach(this.h, true);
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
                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.n, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
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
        gi giVar = this.c;
        if (giVar != null) {
            giVar.dismissInternal();
            this.c.v1();
        }
    }

    public final void f() {
        bt btVar;
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (this.c == null) {
            gi giVar = new gi(this.a.getParentActivity(), this.a, this.N, this.O);
            this.c = giVar;
            int i10 = this.M ? 2 : 1;
            i40 i40Var = this.b;
            if (i40Var == null || !i40Var.v()) {
                btVar = null;
            } else {
                i40 i40Var2 = this.b;
                Objects.requireNonNull(i40Var2);
                btVar = new bt(i40Var2, 1);
            }
            giVar.M0 = i10;
            giVar.N0 = btVar;
            giVar.O0 = false;
            yh yhVar = giVar.u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
            if (yhVar == null || yhVar == chatAttachAlertPhotoLayout) {
                giVar.t1.setVisibility(8);
            }
            int i11 = giVar.M0;
            TextView textView = giVar.f1;
            if (i11 == 2) {
                textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                textView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
            if (chatAttachAlertPhotoLayout != null) {
                gi giVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.c1 = (giVar2.M0 == 0 || giVar2.B) ? false : true;
            }
            gi giVar3 = this.c;
            giVar3.V1 = new e40(this);
            giVar3.Q = this;
        }
        int i12 = this.Q;
        if (i12 == 1) {
            this.c.f1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name));
        } else if (i12 == 2) {
            this.c.f1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name));
        }
    }

    public final boolean g(Dialog dialog) {
        gi giVar = this.c;
        if (giVar == null || dialog != giVar) {
            return false;
        }
        giVar.f0.a0(false);
        this.c.dismissInternal();
        this.c.f0.d0(true);
        return true;
    }

    public final boolean h() {
        return (this.v == null && this.w == null && this.y == null) ? false : true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                f();
                gi giVar = this.c;
                if (giVar != null) {
                    giVar.f0.g0(i10, intent, this.f);
                }
                this.f = null;
                return;
            }
            if (i10 == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.t1().K2(null, this.a, null);
                p(this.f, null, AndroidUtilities.getImageOrientation(this.f), false);
                AndroidUtilities.addMediaToGallery(this.f);
                this.f = null;
                return;
            }
            if (i10 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new xq(18, this, intent.getData()));
                return;
            }
            if (i10 == 15) {
                q(this.f, null, true);
                AndroidUtilities.addMediaToGallery(this.f);
                this.f = null;
            }
        }
    }

    public final void j() {
        gi giVar = this.c;
        if (giVar != null) {
            giVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        gi giVar = this.c;
        if (giVar != null) {
            if (i10 == 17) {
                giVar.f0.U(false);
                this.c.f0.Y();
            } else if (i10 == 4) {
                giVar.f0.Y();
            }
        }
    }

    public final void l() {
        gi giVar = this.c;
        if (giVar != null) {
            giVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File generatePicturePath = AndroidUtilities.generatePicturePath();
            if (generatePicturePath != null) {
                if (i10 >= 24) {
                    intent.putExtra("output", FileProvider.d(this.a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(generatePicturePath));
                }
                this.f = generatePicturePath.getAbsolutePath();
            }
            this.a.startActivityForResult(intent, 13);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 || parentActivity == null) {
            if (i10 >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
            return;
        }
        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(this.M ? 3 : 1, false, false, null);
        jp0Var.x = this.F;
        jp0Var.R = new f40(this);
        this.a.presentFragment(jp0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        this.P = false;
        this.Q = i10;
        if (this.C) {
            org.telegram.ui.ActionBar.n2 n2Var2 = this.a;
            if (n2Var2 == null || n2Var2.getParentActivity() == null) {
                return;
            }
            f();
            gi giVar = this.c;
            giVar.Q1 = this.D;
            giVar.J1(1, false);
            this.c.f0.f0();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 == 21 || i11 == 22) {
                AndroidUtilities.hideKeyboard(this.a.getFragmentView().findFocus());
            }
            this.c.r1();
            this.c.setOnHideListener(onDismissListener);
            int i12 = this.Q;
            if (i12 != 0) {
                this.c.M = new h40(i12, this.H);
            }
            gi giVar2 = this.c;
            giVar2.getClass();
            this.a.showDialog(giVar2);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this.a.getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        if (i10 == 1) {
            e3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name);
            e3Var.bigTitle = true;
        } else if (i10 == 2) {
            e3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name);
            e3Var.bigTitle = true;
        } else {
            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
            e3Var.bigTitle = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        org.telegram.ui.Cells.pa.n(R.drawable.msg_camera, 0, arrayList2, arrayList3);
        if (this.M) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_video, 4, arrayList2, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        org.telegram.ui.Cells.pa.n(R.drawable.msg_photos, 1, arrayList2, arrayList3);
        if (this.F) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_search, 2, arrayList2, arrayList3);
        }
        if (z10) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_delete, 3, arrayList2, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.c40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                j40.a(j40.this, arrayList3, runnable, i14);
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = onClickListener;
        e3Var.setOnHideListener(onDismissListener);
        this.a.showDialog(e3Var);
        if (z10) {
            e3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new g40(this, arrayList), null);
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
        org.telegram.ui.aq0 aq0Var = new org.telegram.ui.aq0(0, null, hashMap, arrayList, 1, false, null, this.N);
        aq0Var.o0 = new d40(this, hashMap, arrayList);
        aq0Var.f0(1, false);
        aq0Var.l0 = this.b.getInitialSearchString();
        if (this.O) {
            this.a.showAsSheet(aq0Var);
        } else {
            this.a.presentFragment(aq0Var);
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
        int i10 = this.d;
        if (scaleAndSaveImage != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.n, true).getAbsolutePath());
                this.r = decodeFile;
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
            } catch (Throwable unused) {
            }
        }
        bitmap.recycle();
        if (this.h != null) {
            UserConfig.getInstance(i10).saveConfig(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileLoader.getDirectory(4));
            sb2.append("/");
            sb2.append(this.h.location.volume_id);
            sb2.append("_");
            this.v = a9.p.k(this.h.location.local_id, ".jpg", sb2);
            if (this.G) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    i40 i40Var = this.b;
                    if (i40Var != null) {
                        i40Var.J(z10, false);
                    }
                    this.s = false;
                } else {
                    if (this.E && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                        i40 i40Var2 = this.b;
                        if (i40Var2 != null) {
                            i40Var2.J(z10, true);
                        }
                        i40 i40Var3 = this.b;
                        if (i40Var3 != null) {
                            i40Var3.Q(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.Q(null, null, this.L, this.x, this.h, this.n, this.s, this.K);
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
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.v = null;
                    i40 i40Var4 = this.b;
                    if (i40Var4 != null) {
                        i40Var4.J(z10, true);
                    }
                    this.s = true;
                }
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                if (this.v != null) {
                    FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                }
            }
            i40 i40Var5 = this.b;
            if (i40Var5 != null) {
                i40Var5.Q(null, null, 0.0d, null, this.h, this.n, this.s, null);
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
