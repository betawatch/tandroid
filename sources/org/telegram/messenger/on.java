package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class on implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ on(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i3) {
        this.a = i3;
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
                hp hpVar = (hp) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                ir irVar = (ir) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                hpVar.getClass();
                if (tL_error != null) {
                    g0.h3(new wm(hpVar, irVar, context, s1Var, tL_error, d2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        g0.h3(new vm(1, context, s1Var));
                    }
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(irVar, 26));
                    break;
                }
            default:
                final x00 x00Var = (x00) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final v00 v00Var = (v00) this.e;
                final ci.e3 e3Var = (ci.e3) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                x00Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i3 = 1;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.m00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    x00 x00Var2 = x00Var;
                                    x00Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    x00Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                    x00Var2.K.remove(v00Var);
                                    e3Var.run();
                                    break;
                                default:
                                    x00 x00Var3 = x00Var;
                                    x00Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    x00Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                    x00Var3.K.remove(v00Var);
                                    e3Var.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.h3(new wm(x00Var, storyItem, str, tL_textWithEntities, arrayList.get(0), v00Var, e3Var, 4));
                        break;
                    } else {
                        final int i10 = 0;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.m00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        x00 x00Var2 = x00Var;
                                        x00Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        x00Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                        x00Var2.K.remove(v00Var);
                                        e3Var.run();
                                        break;
                                    default:
                                        x00 x00Var3 = x00Var;
                                        x00Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        x00Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                        x00Var3.K.remove(v00Var);
                                        e3Var.run();
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
