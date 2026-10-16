package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c50 implements org.telegram.ui.er0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ i50 d;

    public c50(i50 i50Var, HashMap hashMap, ArrayList arrayList) {
        this.d = i50Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.er0
    public final boolean e() {
        return this.d.b.e();
    }

    @Override // org.telegram.ui.er0
    public final void h(int i10, boolean z10, boolean z11) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return;
        }
        i50 i50Var = this.d;
        if (i50Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                i50.a(i50Var, false, arrayList);
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

    @Override // org.telegram.ui.er0
    public final void a() {
    }

    @Override // org.telegram.ui.er0
    public final void b(Editable editable) {
    }

    @Override // org.telegram.ui.er0
    public final /* synthetic */ void g() {
    }
}
