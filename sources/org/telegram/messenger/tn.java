package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ tn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
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
                mr mrVar = (mr) this.e;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                npVar.getClass();
                if (tL_error != null) {
                    g0.g3(new xm(npVar, mrVar, context, t1Var, tL_error, g2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        g0.g3(new wm(1, context, t1Var));
                    }
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new a(mrVar, 27));
                    break;
                }
            default:
                final a10 a10Var = (a10) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final y00 y00Var = (y00) this.e;
                final bi.c4 c4Var = (bi.c4) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                a10Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i7 = 1;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.p00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    a10 a10Var2 = a10Var;
                                    a10Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    a10Var2.getMessagesController().R1().k.h(storyItem2.dialogId, storyItem2);
                                    a10Var2.K.remove(y00Var);
                                    c4Var.run();
                                    break;
                                default:
                                    a10 a10Var3 = a10Var;
                                    a10Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    a10Var3.getMessagesController().R1().k.h(storyItem3.dialogId, storyItem3);
                                    a10Var3.K.remove(y00Var);
                                    c4Var.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.g3(new xm(a10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), y00Var, c4Var, 4));
                        break;
                    } else {
                        final int i10 = 0;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.p00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        a10 a10Var2 = a10Var;
                                        a10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        a10Var2.getMessagesController().R1().k.h(storyItem2.dialogId, storyItem2);
                                        a10Var2.K.remove(y00Var);
                                        c4Var.run();
                                        break;
                                    default:
                                        a10 a10Var3 = a10Var;
                                        a10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        a10Var3.getMessagesController().R1().k.h(storyItem3.dialogId, storyItem3);
                                        a10Var3.K.remove(y00Var);
                                        c4Var.run();
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
