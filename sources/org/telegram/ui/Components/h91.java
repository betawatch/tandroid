package org.telegram.ui.Components;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class h91 implements org.telegram.ui.tp0 {
    public final /* synthetic */ j91 a;

    public h91(j91 j91Var) {
        this.a = j91Var;
    }

    @Override // org.telegram.ui.tp0
    public final void a(ArrayList arrayList) {
        j91 j91Var = this.a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                j91Var.e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(j91Var.e));
                j91Var.d.b(j91Var.e, loadBitmap, true);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.tp0
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.a.b.startActivityForResult(intent, 11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
