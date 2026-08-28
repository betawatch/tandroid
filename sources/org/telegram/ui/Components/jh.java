package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jh implements org.telegram.ui.yp0 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ki d;

    public jh(ki kiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = kiVar;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // org.telegram.ui.yp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.yp0
    public final void i(int i9, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                ((org.telegram.ui.qn) this.d.b0).d8(i9, arrayList, z11);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i10));
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
