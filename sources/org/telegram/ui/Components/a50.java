package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a50 implements org.telegram.ui.sq0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ g50 d;

    public a50(g50 g50Var, HashMap hashMap, ArrayList arrayList) {
        this.d = g50Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.sq0
    public final void d(int i10, boolean z10, boolean z11) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return;
        }
        g50 g50Var = this.d;
        if (g50Var.b == null || this.a || z10) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                g50.a(g50Var, false, arrayList);
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
    public final boolean e() {
        return this.d.b.e();
    }

    @Override // org.telegram.ui.sq0
    public final void a() {
    }

    @Override // org.telegram.ui.sq0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.sq0
    public final void b(Editable editable) {
    }
}
