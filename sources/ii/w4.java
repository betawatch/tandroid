package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final h3 b;
    public MessageObject c;
    public VideoEditedInfo d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.a = i10;
        this.b = h3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = photoEntry.croppedMediaEntities;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = (arrayList == null || arrayList.isEmpty()) ? photoEntry.mediaEntities : photoEntry.croppedMediaEntities;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList2.get(i10);
                    if (mediaEntity != null) {
                        if (mediaEntity.type == 0) {
                            byte b10 = mediaEntity.subType;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (this.n || this.h) {
            return;
        }
        this.h = true;
        if (this.c != null && this.d != null) {
            try {
                MediaController.getInstance().cancelVideoConvert(this.c);
            } catch (Throwable unused) {
            }
        }
        d();
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        d();
        h3 h3Var = this.b;
        w3 w3Var = h3Var.c;
        IdentityHashMap identityHashMap = w3Var.a4;
        u uVar = h3Var.a;
        identityHashMap.remove(uVar);
        uVar.a = 3;
        w3Var.r4(h3Var.b, uVar);
        w3Var.h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.b;
        a aVar = h3Var.b;
        u uVar = h3Var.a;
        w3 w3Var = h3Var.c;
        if (this.h || this.n || i11 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        uVar.f = ((Float) objArr[4]).floatValue();
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            VideoEditedInfo videoEditedInfo = this.d;
            int i12 = videoEditedInfo.resultWidth;
            int i13 = videoEditedInfo.resultHeight;
            int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
            w3Var.a4.remove(uVar);
            uVar.b = true;
            uVar.e = str;
            if (i12 > 0) {
                uVar.j = i12;
            }
            if (i13 > 0) {
                uVar.k = i13;
            }
            uVar.l = 0;
            uVar.m = 0;
            uVar.f = 0.0f;
            w3Var.o4(aVar);
            w3Var.M4(h3Var.b, uVar, str, true, uVar.j, uVar.k, ceil);
        }
    }
}
