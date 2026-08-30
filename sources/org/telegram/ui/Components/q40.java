package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.eq0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ w40 d;

    public q40(w40 w40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = w40Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.eq0
    public final boolean e() {
        return this.d.b.e();
    }

    @Override // org.telegram.ui.eq0
    public final void f(int i10, boolean z4, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            return;
        }
        w40 w40Var = this.d;
        if (w40Var.b == null || this.a || z4) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                w40.b(w40Var, false, arrayList);
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

    @Override // org.telegram.ui.eq0
    public final void a() {
    }

    @Override // org.telegram.ui.eq0
    public final void b(Editable editable) {
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ void c() {
    }
}
