package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jh implements org.telegram.ui.eq0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ li d;

    public jh(li liVar, HashMap hashMap, ArrayList arrayList) {
        this.d = liVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.eq0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.eq0
    public final void f(int i10, boolean z4, boolean z10) {
        if (z4) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i11 >= arrayList2.size()) {
                ((org.telegram.ui.xn) this.d.c0).d8(i10, arrayList, z10);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList.add(sendingMediaInfo);
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            String str = searchImage.imagePath;
            if (str != null) {
                sendingMediaInfo.path = str;
            } else {
                sendingMediaInfo.searchImage = searchImage;
            }
            sendingMediaInfo.thumbPath = searchImage.thumbPath;
            sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
            CharSequence charSequence = searchImage.caption;
            sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
            sendingMediaInfo.entities = searchImage.entities;
            sendingMediaInfo.masks = searchImage.stickers;
            sendingMediaInfo.ttl = searchImage.ttl;
            TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
            if (botInlineResult != null && searchImage.type == 1) {
                sendingMediaInfo.inlineResult = botInlineResult;
                sendingMediaInfo.params = searchImage.params;
            }
            searchImage.date = (int) (System.currentTimeMillis() / 1000);
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
