package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wl0;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class e extends im0 {
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final int v;
    public final boolean w;
    public final a0.h x;
    public ArrayList y;

    public e(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        this.s = context;
        this.v = i10;
        this.w = z10;
        this.x = hVar;
        this.E = i11 != 0;
        this.G = i11 == 2;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        if (this.F == 2 || this.I) {
            return null;
        }
        int i11 = this.r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
        int S = S(i10);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i12 == 0 || this.E) {
            if (S <= 0 || S > arrayList.size()) {
                return null;
            }
            return arrayList.get(S - 1);
        }
        if (S < 0 || S >= arrayList.size()) {
            return null;
        }
        return arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i10) {
        boolean z10 = this.K;
        int i11 = this.r;
        if (z10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return ContactsController.getInstance(i11).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z11 = this.E;
        boolean z12 = this.w;
        if (i12 != 0 && !z11) {
            if (!this.I) {
                if (i10 < arrayList.size()) {
                    int size = hashMap.get(arrayList.get(i10)).size();
                    return (i10 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                }
            }
            return 1;
        }
        if (i10 == 0) {
            if (this.I) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.I) {
            if (this.F != 2) {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    int size2 = hashMap.get(arrayList.get(i13)).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i10 == 1) {
                if (this.y.isEmpty()) {
                    return 0;
                }
                return this.y.size();
            }
            if (z12) {
                return 0;
            }
            return ContactsController.getInstance(i11).phoneBookContacts.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.im0
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override // org.telegram.ui.Components.im0
    public final Object O(int i10, int i11) {
        int i12;
        boolean z10 = this.K;
        int i13 = this.r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return ContactsController.getInstance(i13).phoneBookContacts.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i14 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i14 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (i14 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList2.get(i11).user_id));
                }
            }
            return null;
        }
        if (i10 == 0) {
            return null;
        }
        if (this.F != 2) {
            int i15 = i10 - 1;
            if (i15 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = hashMap.get(arrayList.get(i15));
                if (i11 < arrayList3.size()) {
                    return MessagesController.getInstance(i13).getUser(Long.valueOf(arrayList3.get(i11).user_id));
                }
                return null;
            }
        } else if (i10 == 1) {
            if (i11 < this.y.size()) {
                return MessagesController.getInstance(i13).getUser(Long.valueOf(((TLRPC.TL_contact) this.y.get(i11)).user_id));
            }
            return null;
        }
        if (!this.w || i11 < 0 || i11 >= ContactsController.getInstance(i13).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(i13).phoneBookContacts.get(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i10, int i11) {
        if (this.K) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 != 1) {
                return 8;
            }
            if (i11 == 0) {
                return 5;
            }
            return i11 == 1 ? 7 : 8;
        }
        int i12 = this.v;
        int i13 = this.r;
        ContactsController contactsController = ContactsController.getInstance(i13);
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i13);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z10 = this.E;
        if (i12 == 0 || z10) {
            if (i10 == 0) {
                if (z10) {
                    if (i11 == 1) {
                        return 5;
                    }
                    if (i11 == 2) {
                        int i14 = this.F;
                        return (i14 == 1 || i14 == 2) ? 7 : 2;
                    }
                } else if (this.w) {
                    if (i11 >= 2) {
                        if (i11 == 2) {
                            return 5;
                        }
                        if (i11 == 3) {
                            if (this.I) {
                                return 5;
                            }
                            int i15 = this.F;
                            if (i15 == 1 || i15 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i11 == 2) {
                        return 5;
                    }
                    if (i11 == 3) {
                        if (this.I) {
                            return 5;
                        }
                        int i16 = this.F;
                        if (i16 == 1 || i16 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.I) {
                    return 4;
                }
                if (this.F != 2) {
                    int i17 = i10 - 1;
                    if (i17 < arrayList.size()) {
                        if (i11 < hashMap.get(arrayList.get(i17)).size()) {
                            return 0;
                        }
                    }
                } else if (i10 == 1) {
                    if (i11 < this.y.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.I) {
            return 4;
        }
        if (i11 < hashMap.get(arrayList.get(i10)).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.im0
    public final View T(int i10, View view) {
        int i11 = this.r;
        int i12 = this.v;
        ContactsController contactsController = ContactsController.getInstance(i11);
        if (i12 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i11);
        ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        View view2 = view;
        if (view == null) {
            q4 q4Var = new q4(this.s);
            q4Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
            TextView textView = new TextView(q4Var.getContext());
            q4Var.a = textView;
            k3.m(22.0f, 1, textView);
            r6.W(textView, k6.B6, null);
            textView.setGravity(17);
            q4Var.addView(textView, z5.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            view2 = q4Var;
        }
        q4 q4Var2 = (q4) view2;
        if (this.F == 2 || this.H || this.I) {
            q4Var2.setLetter("");
            return view2;
        }
        if (i12 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                q4Var2.setLetter(arrayList.get(i10));
                return view2;
            }
            q4Var2.setLetter("");
            return view2;
        }
        if (i10 == 0) {
            q4Var2.setLetter("");
            return view2;
        }
        int i13 = i10 - 1;
        if (i13 < arrayList.size()) {
            q4Var2.setLetter(arrayList.get(i13));
            return view2;
        }
        q4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (!this.K) {
            int i12 = this.v;
            int i13 = this.r;
            ContactsController contactsController = ContactsController.getInstance(i13);
            HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = i12 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i13);
            ArrayList<String> arrayList = i12 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z10 = this.E;
            if (i12 == 0 || z10) {
                if (i10 == 0) {
                    if (z10) {
                        if (i11 >= 1) {
                            return false;
                        }
                    } else if (this.w) {
                        if (i11 >= 2) {
                            return false;
                        }
                    } else if (i11 >= 3) {
                        return false;
                    }
                } else {
                    if (this.I) {
                        return false;
                    }
                    if (this.F != 2) {
                        int i14 = i10 - 1;
                        if (i14 < arrayList.size() && i11 >= hashMap.get(arrayList.get(i14)).size()) {
                            return false;
                        }
                    } else if (i10 == 1 && i11 >= this.y.size()) {
                        return false;
                    }
                }
            } else if (this.I || i11 >= hashMap.get(arrayList.get(i10)).size()) {
                return false;
            }
        } else if (i10 != 1 || i11 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.im0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i12 = b1Var.f;
        View view = b1Var.a;
        int i13 = 7;
        boolean z10 = this.E;
        int i14 = this.r;
        if (i12 == 0) {
            wa waVar = (wa) view;
            waVar.T.a = false;
            if (this.F != 2 && !this.H) {
                i13 = 58;
            }
            waVar.b(i13, 1);
            if (this.F == 2) {
                arrayList = this.y;
            } else {
                int i15 = this.v;
                ContactsController contactsController = ContactsController.getInstance(i14);
                arrayList = (i15 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i15 == 2 ? ContactsController.getInstance(i14).sortedUsersMutualSectionsArray : ContactsController.getInstance(i14).sortedUsersSectionsArray).get(i10 - ((i15 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(arrayList.get(i11).user_id));
            waVar.d(user, null, null, false);
            waVar.c(this.x.h(user.id) >= 0, false);
            return;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                u3 u3Var = (u3) view;
                int i16 = this.F;
                if (i16 == 0) {
                    u3Var.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i16 == 1) {
                    u3Var.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    u3Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i12 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.J ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i12 != 7) {
                if (i12 != 8) {
                    return;
                }
                o4 o4Var = (o4) view;
                int i17 = i11 - 2;
                if (i17 < 0 || i17 >= ContactsController.getInstance(i14).phoneBookContacts.size()) {
                    return;
                }
                o4Var.a(ContactsController.getInstance(i14).phoneBookContacts.get(i17), null);
                return;
            }
            l4 l4Var = (l4) view;
            if (this.K && i11 == 1 && i10 == 1) {
                l4Var.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.F == 1) {
                l4Var.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                l4Var.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        r8 r8Var = (r8) view;
        boolean z11 = this.w;
        if (z11 || !z10) {
            int i18 = k6.G6;
            r8Var.g(i18, i18);
        } else {
            int i19 = k6.il;
            r8Var.g(i19, i19);
        }
        if (i10 != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i14).phoneBookContacts.get(i11);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    r8Var.k(contact.last_name, false);
                    return;
                } else {
                    r8Var.k(str, false);
                    return;
                }
            }
            r8Var.k(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z11) {
            if (i11 == 0) {
                r8Var.r(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i11 == 1) {
                    r8Var.r(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.G) {
                r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i11 == 0) {
            r8Var.r(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i11 == 1) {
            r8Var.r(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i10, boolean z10) {
        this.F = i10;
        if (i10 != 2) {
            l();
            return;
        }
        if (this.y == null || z10) {
            int i11 = this.r;
            this.y = new ArrayList(ContactsController.getInstance(i11).contacts);
            long j10 = UserConfig.getInstance(i11).clientUserId;
            int size = this.y.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.y.get(i12)).user_id == j10) {
                    this.y.remove(i12);
                    break;
                }
                i12++;
            }
        }
        Z();
    }

    public final void Z() {
        int i10 = this.r;
        if (this.y == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.y, new d(MessagesController.getInstance(i10), currentTime, 0));
            l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.s;
        if (i10 == 0) {
            wa waVar = new wa(context, 58, 1, false);
            waVar.setCallCellStyle(58);
            view = waVar;
        } else if (i10 == 1) {
            view = new r8(context);
        } else if (i10 == 2) {
            view = new u3(context, null);
        } else if (i10 != 3) {
            if (i10 == 4) {
                FrameLayout vVar = new ah.v(this, context, viewGroup, 4);
                vVar.addView(new br(context), z5.e(-1, -2, 17));
                vVar.setLayoutParams(new s4.o0(-1, -2));
                vVar.setTag(-33024);
                view2 = vVar;
            } else if (i10 == 7) {
                view = new l4(this.s, k6.L6, 21, 14, 5, false, false, null);
            } else if (i10 == 8) {
                view = new o4(context, false);
            } else if (i10 != 9) {
                view = new b7(context, (org.telegram.ui.Cells.b1) null);
            } else {
                View unVar = new un(context, 4);
                unVar.setId(9);
                unVar.setTag(-33024);
                view2 = unVar;
            }
            view = view2;
        } else {
            View b3Var = new b3(context, null);
            b3Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            view = b3Var;
        }
        return new wl0(view);
    }
}
