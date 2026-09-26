package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p40 implements org.telegram.ui.sq0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ v40 d;

    public p40(v40 v40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = v40Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.sq0
    public final boolean e() {
        return this.d.b.e();
    }

    @Override // org.telegram.ui.sq0
    public final void i(int i10, boolean z10, boolean z11) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return;
        }
        v40 v40Var = this.d;
        if (v40Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                v40.b(v40Var, false, arrayList);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i11));
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
            i11++;
        }
    }

    @Override // org.telegram.ui.sq0
    public final void a() {
    }

    @Override // org.telegram.ui.sq0
    public final void b(Editable editable) {
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ void g() {
    }
}
