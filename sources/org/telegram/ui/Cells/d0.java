package org.telegram.ui.Cells;

import org.telegram.messenger.BotInlineKeyboard;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class d0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BotInlineKeyboard.BackgroundColor.values().length];
        a = iArr;
        try {
            iArr[BotInlineKeyboard.BackgroundColor.DANGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[BotInlineKeyboard.BackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[BotInlineKeyboard.BackgroundColor.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
