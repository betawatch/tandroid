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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.yp0 {
    public String B;
    public boolean C;
    public boolean E;
    public final boolean F;
    public TLRPC.User I;
    public TLRPC.InputFile J;
    public TLRPC.InputFile K;
    public TLRPC.VideoSize L;
    public double M;
    public final boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public final int S;
    public float T;
    public org.telegram.ui.ActionBar.p2 a;
    public w40 b;
    public li c;
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
    public boolean D = true;
    public boolean G = true;
    public boolean H = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public x40(int i10, boolean z4, boolean z10) {
        this.N = z4;
        this.F = z10;
        this.S = i10;
    }

    public static void a(x40 x40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue == 0) {
            x40Var.m();
            return;
        }
        if (intValue == 1) {
            x40Var.n();
            return;
        }
        if (intValue == 2) {
            x40Var.r();
            return;
        }
        if (intValue == 3) {
            runnable.run();
            return;
        }
        if (intValue != 4 || (p2Var = x40Var.a) == null || p2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && x40Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                x40Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            if (generateVideoPath != null) {
                if (i11 >= 24) {
                    intent.putExtra("output", FileProvider.d(x40Var.a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(generateVideoPath));
                }
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("android.intent.extra.durationLimit", 10);
                x40Var.f = generateVideoPath.getAbsolutePath();
            }
            x40Var.a.startActivityForResult(intent, 15);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void b(x40 x40Var, boolean z4, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = x40Var.e;
        int i10 = x40Var.d;
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
                            x40Var.B = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.fileLoadFailed);
                                x40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                            }
                        }
                        loadBitmap = null;
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        x40Var.B = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            x40Var.v = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.httpFileDidFailedLoad);
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
        x40Var.s(z4, bitmap, messageObject);
    }

    public final void c() {
        this.Q = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.w, false);
        }
        w40 w40Var = this.b;
        if (w40Var != null) {
            w40Var.P();
        }
    }

    public final void d() {
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.C) {
            this.e.setImageBitmap((Drawable) null);
            this.a = null;
            this.b = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w40 w40Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 == i12 || i10 == NotificationCenter.fileUploadFailed) {
            String str = (String) objArr[0];
            if (str.equals(this.v)) {
                this.v = null;
                if (i10 == i12) {
                    this.J = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.w)) {
                    return;
                }
                this.w = null;
                if (i10 == i12) {
                    this.K = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.v == null && this.w == null && this.y == null) {
                NotificationCenter.getInstance(i13).removeObserver(this, i12);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i10 == i12 && (w40Var = this.b) != null) {
                    w40Var.Q(this.J, this.K, this.M, this.x, this.h, this.n, this.s, this.L);
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
            w40 w40Var2 = this.b;
            this.T = min;
            w40Var2.D(min);
            return;
        }
        int i14 = NotificationCenter.fileLoaded;
        if (i10 == i14 || i10 == NotificationCenter.fileLoadFailed || i10 == NotificationCenter.httpFileDidLoad || i10 == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.T = 1.0f;
            if (str4.equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i15 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i15);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 == i14 || i10 == i15) {
                    s(false, ImageLoader.loadBitmap(this.B, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.setImageBitmap((Drawable) null);
                w40 w40Var3 = this.b;
                if (w40Var3 != null) {
                    w40Var3.P();
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
            if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.y && (p2Var = this.a) != null) {
                this.w = (String) objArr[1];
                p2Var.getFileLoader().uploadFile(this.w, false, false, (int) this.y.videoEditedInfo.estimatedSize, 33554432, false);
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
            if (this.M > longValue3) {
                this.M = longValue3;
            }
            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str5, (long) (this.M * 1000.0d), null, true);
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
        this.Q = false;
        if (this.v == null && this.w == null && this.y == null) {
            this.a = null;
            this.b = null;
        } else {
            this.C = true;
        }
        li liVar = this.c;
        if (liVar != null) {
            liVar.dismissInternal();
            this.c.v1();
        }
    }

    public final void f() {
        lt ltVar;
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        if (this.c == null) {
            li liVar = new li(this.a.getParentActivity(), this.a, this.O, this.P);
            this.c = liVar;
            int i10 = this.N ? 2 : 1;
            w40 w40Var = this.b;
            if (w40Var == null || !w40Var.u()) {
                ltVar = null;
            } else {
                w40 w40Var2 = this.b;
                Objects.requireNonNull(w40Var2);
                ltVar = new lt(w40Var2, 1);
            }
            liVar.N0 = i10;
            liVar.O0 = ltVar;
            liVar.P0 = false;
            di diVar = liVar.v0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
            if (diVar == null || diVar == chatAttachAlertPhotoLayout) {
                liVar.u1.setVisibility(8);
            }
            int i11 = liVar.N0;
            TextView textView = liVar.g1;
            if (i11 == 2) {
                textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                textView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
            if (chatAttachAlertPhotoLayout != null) {
                li liVar2 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.d1 = (liVar2.N0 == 0 || liVar2.C) ? false : true;
            }
            li liVar3 = this.c;
            liVar3.W1 = new s40(this);
            liVar3.R = this;
        }
        int i12 = this.R;
        if (i12 == 1) {
            this.c.g1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.I.first_name));
        } else if (i12 == 2) {
            this.c.g1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.I.first_name));
        }
    }

    public final boolean g(Dialog dialog) {
        li liVar = this.c;
        if (liVar == null || dialog != liVar) {
            return false;
        }
        liVar.g0.a0(false);
        this.c.dismissInternal();
        this.c.g0.d0(true);
        return true;
    }

    public final boolean h() {
        return (this.v == null && this.w == null && this.y == null) ? false : true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                f();
                li liVar = this.c;
                if (liVar != null) {
                    liVar.g0.g0(i10, intent, this.f);
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
                AndroidUtilities.runOnUIThread(new em(23, this, intent.getData()));
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
        li liVar = this.c;
        if (liVar != null) {
            liVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        li liVar = this.c;
        if (liVar != null) {
            if (i10 == 17) {
                liVar.g0.U(false);
                this.c.g0.Y();
            } else if (i10 == 4) {
                liVar.g0.Y();
            }
        }
    }

    public final void l() {
        li liVar = this.c;
        if (liVar != null) {
            liVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var == null || p2Var.getParentActivity() == null) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
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
        org.telegram.ui.wp0 wp0Var = new org.telegram.ui.wp0(this.N ? 3 : 1, false, false, null);
        wp0Var.x = this.G;
        wp0Var.S = new t40(this);
        this.a.presentFragment(wp0Var);
    }

    public final void o(boolean z4, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        this.Q = false;
        this.R = i10;
        if (this.D) {
            org.telegram.ui.ActionBar.p2 p2Var2 = this.a;
            if (p2Var2 == null || p2Var2.getParentActivity() == null) {
                return;
            }
            f();
            li liVar = this.c;
            liVar.R1 = this.E;
            liVar.J1(1, false);
            this.c.g0.f0();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 == 21 || i11 == 22) {
                AndroidUtilities.hideKeyboard(this.a.getFragmentView().findFocus());
            }
            this.c.r1();
            this.c.setOnHideListener(onDismissListener);
            int i12 = this.R;
            if (i12 != 0) {
                this.c.N = new v40(i12, this.I);
            }
            li liVar2 = this.c;
            liVar2.getClass();
            this.a.showDialog(liVar2);
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.a.getParentActivity(), null, false, false);
        g3Var.fixNavigationBar();
        if (i10 == 1) {
            g3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.I.first_name);
            g3Var.bigTitle = true;
        } else if (i10 == 2) {
            g3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.I.first_name);
            g3Var.bigTitle = true;
        } else {
            g3Var.title = LocaleController.getString(R.string.ChoosePhoto);
            g3Var.bigTitle = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        org.telegram.ui.b.h(R.drawable.msg_camera, 0, arrayList2, arrayList3);
        if (this.N) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            org.telegram.ui.b.h(R.drawable.msg_video, 4, arrayList2, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        org.telegram.ui.b.h(R.drawable.msg_photos, 1, arrayList2, arrayList3);
        if (this.G) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            org.telegram.ui.b.h(R.drawable.msg_search, 2, arrayList2, arrayList3);
        }
        if (z4) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            org.telegram.ui.b.h(R.drawable.msg_delete, 3, arrayList2, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.q40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                x40.a(x40.this, arrayList3, runnable, i14);
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(onDismissListener);
        this.a.showDialog(g3Var);
        if (z4) {
            g3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z4) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z4;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new u40(this, arrayList), null);
        PhotoViewer.t1().M = true;
    }

    public final void q(String str, String str2, boolean z4) {
        p(str, str2, new Pair(0, 0), z4);
    }

    public final void r() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(0, null, hashMap, arrayList, 1, false, null, this.O);
        mq0Var.p0 = new r40(this, hashMap, arrayList);
        mq0Var.f0(1, false);
        mq0Var.m0 = this.b.getInitialSearchString();
        if (this.P) {
            this.a.showAsSheet(mq0Var);
        } else {
            this.a.presentFragment(mq0Var);
        }
    }

    public final void s(boolean z4, Bitmap bitmap, MessageObject messageObject) {
        if (bitmap == null) {
            return;
        }
        this.K = null;
        this.J = null;
        this.y = null;
        this.x = null;
        this.L = messageObject == null ? null : messageObject.emojiMarkup;
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
            StringBuilder sb = new StringBuilder();
            sb.append(FileLoader.getDirectory(4));
            sb.append("/");
            sb.append(this.h.location.volume_id);
            sb.append("_");
            this.v = android.support.v4.media.a.m(this.h.location.local_id, ".jpg", sb);
            if (this.H) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    w40 w40Var = this.b;
                    if (w40Var != null) {
                        w40Var.K(z4, false);
                    }
                    this.s = false;
                } else {
                    if (this.F && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                        w40 w40Var2 = this.b;
                        if (w40Var2 != null) {
                            w40Var2.K(z4, true);
                        }
                        w40 w40Var3 = this.b;
                        if (w40Var3 != null) {
                            w40Var3.Q(null, null, 0.0d, null, this.h, this.n, this.s, null);
                            this.b.Q(null, null, this.M, this.x, this.h, this.n, this.s, this.L);
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
                    this.M = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                    videoEditedInfo.shouldLimitFps = false;
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.v = null;
                    w40 w40Var4 = this.b;
                    if (w40Var4 != null) {
                        w40Var4.K(z4, true);
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
            w40 w40Var5 = this.b;
            if (w40Var5 != null) {
                w40Var5.Q(null, null, 0.0d, null, this.h, this.n, this.s, null);
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
