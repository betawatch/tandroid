package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class vn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ vn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = (np) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                nr nrVar = (nr) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                npVar.getClass();
                if (tL_error != null) {
                    g0.h3(new dn(npVar, nrVar, context, t1Var, tL_error, e2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        g0.h3(new cn(1, context, t1Var));
                    }
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(nrVar, 27));
                    break;
                }
            default:
                final c10 c10Var = (c10) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final a10 a10Var = (a10) this.e;
                final di.x2 x2Var = (di.x2) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                c10Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i7 = 1;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.r00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    c10 c10Var2 = c10Var;
                                    c10Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    c10Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                    c10Var2.K.remove(a10Var);
                                    x2Var.run();
                                    break;
                                default:
                                    c10 c10Var3 = c10Var;
                                    c10Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    c10Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                    c10Var3.K.remove(a10Var);
                                    x2Var.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.h3(new dn(c10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), a10Var, x2Var, 4));
                        break;
                    } else {
                        final int i10 = 0;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.r00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        c10 c10Var2 = c10Var;
                                        c10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        c10Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                        c10Var2.K.remove(a10Var);
                                        x2Var.run();
                                        break;
                                    default:
                                        c10 c10Var3 = c10Var;
                                        c10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        c10Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                        c10Var3.K.remove(a10Var);
                                        x2Var.run();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }
}
