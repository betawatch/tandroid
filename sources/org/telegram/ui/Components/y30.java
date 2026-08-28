package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y30 implements org.telegram.ui.yp0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ e40 d;

    public y30(e40 e40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = e40Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.yp0
    public final boolean e() {
        return this.d.b.e();
    }

    @Override // org.telegram.ui.yp0
    public final void i(int i9, boolean z10, boolean z11) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return;
        }
        e40 e40Var = this.d;
        if (e40Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                e40.b(e40Var, false, arrayList);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList.add(sendingMediaInfo);
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str = searchImage.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                CharSequence charSequence = searchImage.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.yp0
    public final void a() {
    }

    @Override // org.telegram.ui.yp0
    public final void b(Editable editable) {
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ void h() {
    }
}
