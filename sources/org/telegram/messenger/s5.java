package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s5 extends TLRPC.TL_document {
    public final TLRPC.ThemeSettings a;
    public final TLRPC.Document b;
    public final org.telegram.ui.ActionBar.l6 c;
    public final org.telegram.ui.ActionBar.j6 d;

    public s5(TLRPC.ThemeSettings themeSettings) {
        this.a = themeSettings;
        org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(themeSettings));
        this.c = Q0;
        Q0.getClass();
        org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
        org.telegram.ui.ActionBar.l6.i(j6Var, themeSettings);
        j6Var.b = Q0;
        this.d = j6Var;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (!(wallPaper instanceof TLRPC.TL_wallPaper)) {
            this.id = -2147483648L;
            this.dc_id = TLObject.FLAG_31;
            return;
        }
        TLRPC.Document document = ((TLRPC.TL_wallPaper) wallPaper).document;
        this.b = document;
        this.id = document.id;
        this.access_hash = document.access_hash;
        this.file_reference = document.file_reference;
        this.user_id = document.user_id;
        this.date = document.date;
        this.file_name = document.file_name;
        this.mime_type = document.mime_type;
        this.size = document.size;
        this.thumbs = document.thumbs;
        this.version = document.version;
        this.dc_id = document.dc_id;
        this.key = document.key;
        this.iv = document.iv;
        this.attributes = document.attributes;
    }
}
