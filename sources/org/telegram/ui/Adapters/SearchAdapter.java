package org.telegram.ui.Adapters;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.RecyclerListView;

/* loaded from: classes4.dex */
public abstract class SearchAdapter extends RecyclerListView.SelectionAdapter {
    private ArrayList allUnregistredContacts;
    private boolean allowBots;
    private boolean allowChats;
    private boolean allowPhoneNumbers;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private long channelId;
    private LongSparseArray ignoreUsers;
    public boolean includeLoading;
    public boolean includeSearch;
    private String lastQuery;
    private Context mContext;
    private boolean onlyMutual;
    private SearchAdapterHelper searchAdapterHelper;
    private boolean searchInProgress;
    private int searchPointer;
    private int searchReqId;
    private Timer searchTimer;
    private LongSparseArray selectedUsers;
    int unregistredContactsHeaderRow;
    private boolean useUserCell;
    private ArrayList searchResult = new ArrayList();
    private ArrayList searchResultNames = new ArrayList();
    private ArrayList unregistredContacts = new ArrayList();

    protected abstract void onSearchProgressChanged();

    public SearchAdapter(RecyclerListView recyclerListView, Context context, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Theme.ResourcesProvider resourcesProvider) {
        this.mContext = context;
        this.ignoreUsers = longSparseArray;
        this.selectedUsers = longSparseArray2;
        this.onlyMutual = z2;
        this.allowUsernameSearch = z;
        this.allowChats = z3;
        this.allowBots = z4;
        this.channelId = i;
        this.allowSelf = z5;
        this.allowPhoneNumbers = z6;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Adapters.SearchAdapter.1
            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ boolean canApplySearchResults(int i2) {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$canApplySearchResults(this, i2);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public /* synthetic */ void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList, hashMap);
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public void onDataSetChanged(int i2) {
                SearchAdapter.this.notifyDataSetChanged();
                if (i2 != 0) {
                    SearchAdapter.this.onSearchProgressChanged();
                }
            }

            @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
            public LongSparseArray getExcludeUsers() {
                return SearchAdapter.this.ignoreUsers;
            }
        });
    }

    public void searchDialogs(final String str) {
        try {
            Timer timer = this.searchTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.searchResult.clear();
        this.unregistredContacts.clear();
        this.searchResultNames.clear();
        if (this.allowUsernameSearch) {
            this.searchAdapterHelper.queryServerSearch(null, true, this.allowChats, this.allowBots, this.allowSelf, false, this.channelId, this.allowPhoneNumbers, 0, 0);
        }
        notifyDataSetChanged();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.searchTimer = timer2;
        timer2.schedule(new TimerTask() { // from class: org.telegram.ui.Adapters.SearchAdapter.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    SearchAdapter.this.searchTimer.cancel();
                    SearchAdapter.this.searchTimer = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                SearchAdapter.this.processSearch(str);
            }
        }, 200L, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSearch(final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.SearchAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SearchAdapter.$r8$lambda$Y6OGA9LtiF893dhAG1gSBS5oMoo(SearchAdapter.this, str);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Y6OGA9LtiF893dhAG1gSBS5oMoo(final SearchAdapter searchAdapter, final String str) {
        searchAdapter.lastQuery = str;
        if (searchAdapter.allowUsernameSearch) {
            searchAdapter.searchAdapterHelper.queryServerSearch(str, true, searchAdapter.allowChats, searchAdapter.allowBots, searchAdapter.allowSelf, false, searchAdapter.channelId, searchAdapter.allowPhoneNumbers, -1, 1);
        }
        final int i = UserConfig.selectedAccount;
        final ArrayList arrayList = new ArrayList(ContactsController.getInstance(i).contacts);
        searchAdapter.searchInProgress = true;
        final int i2 = searchAdapter.searchPointer;
        searchAdapter.searchPointer = i2 + 1;
        searchAdapter.searchReqId = i2;
        searchAdapter.notifyDataSetChanged();
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Adapters.SearchAdapter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SearchAdapter.$r8$lambda$_vSfLcy9LwO1vSdJCj-iHUzEpLw(SearchAdapter.this, str, i2, arrayList, i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    public static /* synthetic */ void $r8$lambda$_vSfLcy9LwO1vSdJCj-iHUzEpLw(SearchAdapter searchAdapter, String str, int i, ArrayList arrayList, int i2) {
        int i3;
        int i4;
        searchAdapter.getClass();
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            searchAdapter.updateSearchResults(i, new ArrayList(), new ArrayList(), searchAdapter.unregistredContacts);
            return;
        }
        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
        if (lowerCase.equals(translitString) || translitString.length() == 0) {
            translitString = null;
        }
        int i5 = (translitString != null ? 1 : 0) + 1;
        String[] strArr = new String[i5];
        strArr[0] = lowerCase;
        if (translitString != null) {
            strArr[1] = translitString;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6 = i3 + 1) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i6);
            String str2 = null;
            TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(tL_contact.user_id));
            if ((searchAdapter.allowSelf || !user.self) && (!searchAdapter.onlyMutual || user.mutual_contact)) {
                LongSparseArray longSparseArray = searchAdapter.ignoreUsers;
                int i7 = i6;
                if (longSparseArray == null || longSparseArray.indexOfKey(tL_contact.user_id) < 0) {
                    int i8 = 3;
                    String[] strArr2 = new String[3];
                    strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                    strArr2[1] = translitString2;
                    if (strArr2[0].equals(translitString2)) {
                        strArr2[1] = null;
                    }
                    if (UserObject.isReplyUser(user)) {
                        strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                    } else if (user.self) {
                        strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                    }
                    int i9 = 0;
                    boolean z = false;
                    while (i9 < i5) {
                        String str3 = strArr[i9];
                        i3 = i7;
                        int i10 = 0;
                        while (i10 < i8) {
                            String str4 = strArr2[i10];
                            if (str4 != null) {
                                if (!str4.startsWith(str3)) {
                                    i4 = i10;
                                    if (str4.contains(" " + str3)) {
                                    }
                                }
                                z = true;
                                break;
                            }
                            i4 = i10;
                            i10 = i4 + 1;
                            i8 = 3;
                        }
                        String publicUsername = UserObject.getPublicUsername(user);
                        ?? r5 = (z || publicUsername == null || !publicUsername.startsWith(str3)) ? z : 2;
                        if (r5 != 0) {
                            if (r5 == 1) {
                                arrayList3.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str3));
                            } else {
                                arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), str2, "@" + str3));
                            }
                            arrayList2.add(user);
                        } else {
                            i9++;
                            z = r5;
                            i7 = i3;
                            i8 = 3;
                            str2 = null;
                        }
                    }
                }
                i3 = i7;
            } else {
                i3 = i6;
            }
        }
        if (searchAdapter.allUnregistredContacts == null) {
            searchAdapter.allUnregistredContacts = new ArrayList();
            ArrayList<ContactsController.Contact> arrayList5 = ContactsController.getInstance(i2).phoneBookContacts;
            int size = arrayList5.size();
            int i11 = 0;
            while (i11 < size) {
                ContactsController.Contact contact = arrayList5.get(i11);
                i11++;
                ContactsController.Contact contact2 = contact;
                ContactEntry contactEntry = new ContactEntry();
                contactEntry.contact = contact2;
                contactEntry.q1 = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                contactEntry.q2 = (contact2.last_name + " " + contact2.first_name).toLowerCase();
                searchAdapter.allUnregistredContacts.add(contactEntry);
            }
        }
        for (int i12 = 0; i12 < searchAdapter.allUnregistredContacts.size(); i12++) {
            ContactEntry contactEntry2 = (ContactEntry) searchAdapter.allUnregistredContacts.get(i12);
            if ((translitString != null && (contactEntry2.q1.toLowerCase().contains(translitString) || contactEntry2.q1.toLowerCase().contains(translitString))) || contactEntry2.q1.toLowerCase().contains(lowerCase) || contactEntry2.q1.toLowerCase().contains(lowerCase)) {
                arrayList4.add(contactEntry2.contact);
            }
        }
        searchAdapter.updateSearchResults(i, arrayList2, arrayList3, arrayList4);
    }

    private void updateSearchResults(final int i, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Adapters.SearchAdapter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SearchAdapter.$r8$lambda$ztXosB2KqSMwFSMrWFpQ4axnPAE(SearchAdapter.this, i, arrayList, arrayList2, arrayList3);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$ztXosB2KqSMwFSMrWFpQ4axnPAE(SearchAdapter searchAdapter, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        if (i == searchAdapter.searchReqId) {
            searchAdapter.searchResult = arrayList;
            searchAdapter.searchResultNames = arrayList2;
            searchAdapter.unregistredContacts = arrayList3;
            searchAdapter.searchAdapterHelper.mergeResults(arrayList);
            searchAdapter.searchInProgress = false;
            searchAdapter.notifyDataSetChanged();
            searchAdapter.onSearchProgressChanged();
        }
    }

    public boolean searchInProgress() {
        return this.searchInProgress || this.searchAdapterHelper.isSearchInProgress();
    }

    @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 0 || itemViewType == 2 || itemViewType == 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        this.unregistredContactsHeaderRow = -1;
        int size = this.searchResult.size();
        if (this.includeSearch) {
            size++;
        }
        if (!this.unregistredContacts.isEmpty()) {
            this.unregistredContactsHeaderRow = size;
            size += this.unregistredContacts.size() + 1;
        }
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 != 0) {
            size += size3;
        }
        return (this.includeLoading && searchInProgress()) ? size + 3 : size;
    }

    public boolean isGlobalSearch(int i) {
        int size = this.searchResult.size();
        int size2 = this.unregistredContacts.size();
        int size3 = this.searchAdapterHelper.getGlobalSearch().size();
        int size4 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i >= 0 && i < size) {
            return false;
        }
        if (i <= size || i >= size + size2 + 1) {
            return (i <= (size + size2) + 1 || i >= ((size + size4) + size2) + 1) && i > ((size + size4) + size2) + 1 && i <= (((size3 + size4) + size) + size2) + 1;
        }
        return false;
    }

    public Object getItem(int i) {
        int size = this.searchResult.size();
        int size2 = this.unregistredContacts.size();
        int size3 = this.searchAdapterHelper.getGlobalSearch().size();
        int size4 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i >= 0 && i < size) {
            return this.searchResult.get(i);
        }
        int i2 = i - size;
        if (size2 > 0) {
            if (i2 == 0) {
                return null;
            }
            if (i2 > 0 && i2 <= size2) {
                return this.unregistredContacts.get(i2 - 1);
            }
            i2 -= size2 + 1;
        }
        if (i2 >= 0 && i2 < size4) {
            return this.searchAdapterHelper.getPhoneSearch().get(i2);
        }
        int i3 = i2 - size4;
        if (i3 <= 0 || i3 > size3) {
            return null;
        }
        return this.searchAdapterHelper.getGlobalSearch().get(i3 - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i != 0) {
            if (i == 1) {
                GraySectionCell graySectionCell = new GraySectionCell(this.mContext, 26, null);
                graySectionCell.setNoBackground(true);
                view = graySectionCell;
            } else if (i == 3) {
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(this.mContext);
                profileSearchCell.setCallCellStyle();
                view = profileSearchCell;
            } else if (i == 4) {
                View view2 = new View(this.mContext) { // from class: org.telegram.ui.Adapters.SearchAdapter.3
                    @Override // android.view.View
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
                    }
                };
                view2.setId(9);
                view2.setTag(-33024);
                view = view2;
            } else if (i == 5) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(29);
                flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = flickerLoadingView;
            } else {
                view = new TextCell(this.mContext, 16, false);
            }
        } else if (this.useUserCell) {
            view = new UserCell(this.mContext, 1, 1, false);
        } else {
            ProfileSearchCell profileSearchCell2 = new ProfileSearchCell(this.mContext);
            profileSearchCell2.setCallCellStyle();
            view = profileSearchCell2;
        }
        return new RecyclerListView.Holder(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        String str;
        long j2;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        if (this.includeSearch) {
            if (i == 0) {
                return;
            } else {
                i--;
            }
        }
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (i == this.unregistredContactsHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (getItem(i) == null) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (itemViewType == 2) {
                String str2 = (String) getItem(i);
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
                textCell.setText(LocaleController.formatString(R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str2)), false);
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
            ContactsController.Contact contact = (ContactsController.Contact) getItem(i);
            profileSearchCell.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), PhoneFormat.getInstance().format("+" + contact.shortPhones.get(0)), false, false);
            return;
        }
        TLObject tLObject = (TLObject) getItem(i);
        if (tLObject == null) {
            return;
        }
        CharSequence charSequence3 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = UserObject.getPublicUsername(user);
            if (str != null && this.lastQuery != null && !str.toLowerCase().contains(this.lastQuery.toLowerCase()) && user.usernames != null) {
                for (int i2 = 0; i2 < user.usernames.size(); i2++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i2);
                    if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.lastQuery.toLowerCase())) {
                        str = tL_username.username;
                    }
                }
            }
            long j3 = user.id;
            z = user.self;
            j2 = j3;
        } else {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = ChatObject.getPublicUsername(chat);
                j = chat.id;
            } else {
                j = 0;
                str = null;
            }
            j2 = j;
            z = false;
        }
        if (i < this.searchResult.size()) {
            charSequence = (CharSequence) this.searchResultNames.get(i);
            if (charSequence != null && str != null && str.length() > 0) {
                if (charSequence.toString().startsWith("@" + str)) {
                    charSequence2 = charSequence;
                    if (!this.useUserCell) {
                        UserCell userCell = (UserCell) viewHolder.itemView;
                        userCell.setData(tLObject, charSequence3, charSequence2, 0);
                        userCell.setChecked(this.selectedUsers.indexOfKey(j2) >= 0, false);
                        return;
                    } else {
                        ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) viewHolder.itemView;
                        if (z) {
                            charSequence3 = LocaleController.getString(R.string.SavedMessages);
                        }
                        profileSearchCell2.setData(tLObject, null, charSequence3, charSequence2, false, z);
                        profileSearchCell2.setChecked(this.selectedUsers.indexOfKey(j2) >= 0, false);
                        return;
                    }
                }
            }
        } else if (i <= this.searchResult.size() || str == null) {
            charSequence = null;
        } else {
            String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
            if (lastFoundUsername != null && lastFoundUsername.startsWith("@")) {
                lastFoundUsername = lastFoundUsername.substring(1);
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "@");
                spannableStringBuilder.append((CharSequence) str);
                if (lastFoundUsername != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername)) != -1) {
                    int length = lastFoundUsername.length();
                    if (indexOfIgnoreCase == 0) {
                        length++;
                    } else {
                        indexOfIgnoreCase++;
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                }
                charSequence = null;
                charSequence3 = spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
                charSequence2 = str;
            }
        }
        charSequence2 = charSequence3;
        charSequence3 = charSequence;
        if (!this.useUserCell) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.includeSearch) {
            if (i == 0) {
                return 4;
            }
            i--;
        }
        if (this.includeLoading && searchInProgress() && i >= (getItemCount() - (this.includeSearch ? 1 : 0)) - 3) {
            return 5;
        }
        Object item = getItem(i);
        if (item == null) {
            return 1;
        }
        return item instanceof String ? "section".equals((String) item) ? 1 : 2 : item instanceof ContactsController.Contact ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ContactEntry {
        ContactsController.Contact contact;
        String q1;
        String q2;

        private ContactEntry() {
        }
    }
}
