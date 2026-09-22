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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n81 implements org.telegram.ui.iq0 {
    public final /* synthetic */ p81 a;

    public n81(p81 p81Var) {
        this.a = p81Var;
    }

    @Override // org.telegram.ui.iq0
    public final void a(ArrayList arrayList) {
        p81 p81Var = this.a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                p81Var.e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(p81Var.e));
                p81Var.d.b(p81Var.e, loadBitmap, true);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.iq0
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
