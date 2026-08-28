package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pg1 extends org.telegram.ui.Components.gk0 {
    public final Context c;
    public final of.v1 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public pg1(UsersSelectActivity usersSelectActivity, Context context) {
        this.v = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.B) {
            this.s = 0;
        } else {
            int i9 = usersSelectActivity.x;
            if (i9 == 2) {
                this.s = (!usersSelectActivity.D ? 1 : 0) + 5;
            } else if (i9 != 0) {
                this.s = 0;
            } else if (usersSelectActivity.E) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        int i10 = usersSelectActivity.x;
        boolean z10 = i10 != 2;
        boolean z11 = i10 != 2;
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            if (!DialogObject.isEncryptedDialog(dialog.id)) {
                if (DialogObject.isUserDialog(dialog.id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.id));
                    if (user != null && ((usersSelectActivity.C || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.id));
                    if (z11 && chat != null) {
                        this.r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.C) {
            this.r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        of.v1 v1Var = new of.v1(false);
        this.f = v1Var;
        v1Var.p = false;
        v1Var.a = new dl0(this, 25);
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i9 = this.v.x;
        boolean z10 = i9 != 2;
        boolean z11 = i9 != 2;
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            og1 og1Var = new og1(this, str, z11, z10, 0);
            this.h = og1Var;
            dispatchQueue.postRunnable(og1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.r0
    public final int h() {
        if (this.n) {
            int size = this.d.size();
            of.v1 v1Var = this.f;
            return v1Var.e.size() + v1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i9 = 0;
        if (!usersSelectActivity.B) {
            int i10 = usersSelectActivity.x;
            if (i10 == 2) {
                i9 = (!usersSelectActivity.D ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i9 = usersSelectActivity.E ? 7 : 5;
            }
        }
        return this.r.size() + i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.B ? !((i10 = usersSelectActivity.x) != 2 ? i10 != 0 || (!usersSelectActivity.E ? !(i9 == 0 || i9 == 4) : !(i9 == 0 || i9 == 6)) : i9 != 0 && i9 != (!usersSelectActivity.D ? 1 : 0) + 4) : i9 == 0) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cf  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        Object obj;
        String string;
        CharSequence charSequence;
        ?? r11;
        long j10;
        int i10;
        long j11;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        boolean z11;
        boolean canUserDoAdminAction;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        CharSequence charSequence2;
        int i11 = q1Var.f;
        View view = q1Var.a;
        UsersSelectActivity usersSelectActivity = this.v;
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 != 0 || usersSelectActivity.B) {
                v3Var.setText(LocaleController.getString(R.string.FilterChats));
                return;
            } else {
                v3Var.setText(LocaleController.getString(R.string.FilterChatTypes));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        if (this.n) {
            int size = this.d.size();
            of.v1 v1Var = this.f;
            ArrayList arrayList = v1Var.e;
            ArrayList arrayList2 = v1Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i9 < 0 || i9 >= size) ? (i9 < size || i9 >= size3 + size) ? (i9 <= size + size3 || i9 >= (size2 + size) + size3) ? null : v1Var.e.get((i9 - size) - size3) : arrayList2.get(i9 - size) : this.d.get(i9);
            if (obj != null) {
                String publicUsername = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : ChatObject.getPublicUsername((TLRPC.Chat) obj);
                if (i9 < size) {
                    charSequence = (CharSequence) this.e.get(i9);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence.toString().startsWith("@" + publicUsername)) {
                            charSequence2 = charSequence;
                        }
                    }
                    r11 = 0;
                    j10 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i10 = usersSelectActivity.x;
                    if (i10 != 2) {
                        if (i10 != 0) {
                            j11 = 0;
                            int i13 = usersSelectActivity.getMessagesController().dialogs_dict.f(j10) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().dialogs_dict.f(j10)).ttl_period : 0;
                            if (i13 > 0) {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                spannableStringBuilder4.append((CharSequence) "d");
                                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i13)).toLowerCase());
                                spannableStringBuilder = spannableStringBuilder4;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                                spannableStringBuilder = spannableStringBuilder5;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                canUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                                z11 = z12;
                                spannableStringBuilder2 = spannableStringBuilder;
                                if (canUserDoAdminAction) {
                                }
                                g4Var.d(obj, charSequence, spannableStringBuilder2);
                                g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
                                if (j10 == j11) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder3 = spannableStringBuilder;
                                canUserDoAdminAction = true;
                                spannableStringBuilder2 = spannableStringBuilder3;
                                if (canUserDoAdminAction) {
                                }
                                g4Var.d(obj, charSequence, spannableStringBuilder2);
                                g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
                                if (j10 == j11) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = g4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            r11 = new SpannableStringBuilder();
                            ArrayList<MessagesController.DialogFilter> arrayList3 = usersSelectActivity.getMessagesController().dialogFilters;
                            int size4 = arrayList3.size();
                            j11 = 0;
                            for (int i14 = 0; i14 < size4; i14++) {
                                MessagesController.DialogFilter dialogFilter = arrayList3.get(i14);
                                if (dialogFilter.includesDialog(usersSelectActivity.getAccountInstance(), j10)) {
                                    if (r11.length() > 0) {
                                        r11.append(", ");
                                    }
                                    r11.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder3 = r11;
                            canUserDoAdminAction = true;
                            spannableStringBuilder2 = spannableStringBuilder3;
                            if (canUserDoAdminAction) {
                                g4Var.setAlpha(0.5f);
                            } else {
                                g4Var.setAlpha(1.0f);
                            }
                            g4Var.d(obj, charSequence, spannableStringBuilder2);
                            g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
                            if (j10 == j11) {
                                g4Var.c(usersSelectActivity.J.h(j10) >= 0, false);
                                g4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = 0;
                    z11 = false;
                    spannableStringBuilder3 = r11;
                    canUserDoAdminAction = true;
                    spannableStringBuilder2 = spannableStringBuilder3;
                    if (canUserDoAdminAction) {
                    }
                    g4Var.d(obj, charSequence, spannableStringBuilder2);
                    g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
                    if (j10 == j11) {
                    }
                } else if (i9 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = v1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        spannableStringBuilder6.append((CharSequence) "@");
                        spannableStringBuilder6.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder6.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = spannableStringBuilder6;
                    } catch (Exception unused) {
                        charSequence2 = publicUsername;
                    }
                }
                charSequence = null;
                r11 = charSequence2;
                if (obj instanceof TLRPC.User) {
                }
                i10 = usersSelectActivity.x;
                if (i10 != 2) {
                }
                j11 = 0;
                z11 = false;
                spannableStringBuilder3 = r11;
                canUserDoAdminAction = true;
                spannableStringBuilder2 = spannableStringBuilder3;
                if (canUserDoAdminAction) {
                }
                g4Var.d(obj, charSequence, spannableStringBuilder2);
                g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
                if (j10 == j11) {
                }
            }
        } else {
            int i15 = this.s;
            if (i9 < i15) {
                String str2 = "non_contacts";
                if (usersSelectActivity.x == 2) {
                    if (i9 == 1) {
                        string = LocaleController.getString(R.string.FilterExistingChats);
                        str2 = "existing_chats";
                        i12 = 1;
                    } else if (i9 == 2 && !usersSelectActivity.D) {
                        string = LocaleController.getString(R.string.FilterNewChats);
                        str2 = "new_chats";
                    } else if (i9 == (!usersSelectActivity.D ? 1 : 0) + 2) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        str2 = "contacts";
                        i12 = 4;
                    } else {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i12 = 8;
                    }
                } else if (usersSelectActivity.E) {
                    if (i9 == 1) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        i12 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        str2 = "contacts";
                    } else if (i9 == 2) {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i12 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i9 == 3) {
                        string = LocaleController.getString(R.string.FilterGroups);
                        i12 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        str2 = "groups";
                    } else if (i9 == 4) {
                        string = LocaleController.getString(R.string.FilterChannels);
                        i12 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        str2 = "channels";
                    } else {
                        string = LocaleController.getString(R.string.FilterBots);
                        i12 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        str2 = "bots";
                    }
                } else if (i9 == 1) {
                    string = LocaleController.getString(R.string.FilterMuted);
                    i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    str2 = "muted";
                } else if (i9 == 2) {
                    string = LocaleController.getString(R.string.FilterRead);
                    i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    str2 = "read";
                } else {
                    string = LocaleController.getString(R.string.FilterArchived);
                    i12 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    str2 = "archived";
                }
                g4Var.d(str2, string, null);
                g4Var.c((usersSelectActivity.F & i12) == i12, false);
                g4Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i9 - i15);
        }
        charSequence = null;
        r11 = 0;
        if (obj instanceof TLRPC.User) {
        }
        i10 = usersSelectActivity.x;
        if (i10 != 2) {
        }
        j11 = 0;
        z11 = false;
        spannableStringBuilder3 = r11;
        canUserDoAdminAction = true;
        spannableStringBuilder2 = spannableStringBuilder3;
        if (canUserDoAdminAction) {
        }
        g4Var.d(obj, charSequence, spannableStringBuilder2);
        g4Var.getStatusTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, !z11 ? org.telegram.ui.ActionBar.f6.n6 : org.telegram.ui.ActionBar.f6.y6, false));
        if (j10 == j11) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        return new org.telegram.ui.Components.ik0(i9 != 1 ? new org.telegram.ui.Cells.v3(context, null) : new org.telegram.ui.Cells.g4(context, 1, 0, true));
    }
}
